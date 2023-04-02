package calculadora;

import java.util.Stack;

public class NotationExpresion {
	private static final char ADD = '+';
	private static final char SUB = '-';
	private static final char DIV = '/';
	private static final char MULT = '*';
	private static final char EXP = '^';
	private static final char LEFT_PAR = '(';
	private static final char RIGHT_PAR = ')';
	private static final int P_ONE = 1;
	private static final int P_TWO = 2;
	private static final int P_THREE = 3;
	private static final int P_ZERO = 0;
	
	/**
	 * Devuelve el valor de precedencia de un operador matematico
	 * @param ch char un operador matematico, representado como un dato de tipo primitivo char
	 * @return int el valor de precedencia del operador dado. retorna 0 si el operador no es valido.
	 */
	private static int getPrecedence(char ch) {
		if(ch==EXP)
			return P_THREE;
		else if(ch==MULT || ch==DIV)
			return P_TWO;
		else if(ch==ADD || ch==SUB)
			return P_ONE;
		return P_ZERO;
	}
	
	/**
	 * Devuelve el valor de precedencia de un operador matematico
	 * @param ch un operador matematico representado como un objeto de la clase Character
	 * @return int el valor de precedencia del operador dado. retorna 0 si el operador no es valido.
	 */
	private static int getPrecedence(Character ch) {
		return getPrecedence(ch.charValue());
	}
	
	/**
	 * Si la pila tiene operadores este metodo se encarga de sacarlos y añadirlos a la expresion
	 * postfija, dependiendo de como fueron añadidos a la pila
	 */
	private static void checkPila(Stack <Character> pila, Stack <Character> postFix) {
		for(int i = pila.size()-1; i>=0 ; i--) {

			if( pila.elementAt(i).equals(')') ) {
				pila.pop();
			}
			else if( pila.elementAt(i).equals('(') ) {
				pila.pop();
				break;
			}
			else {
				postFix.push( pila.pop() );
			}
		}
		
	}
	
	/**
	 * Este metodo recibie un caracter si es un operando lo añade a la expresion postfija
	 * si es un operador verifica el valor de precedencia para añadirlo a la pila o a la expresion
	 * postfija. Cuando encuentra parentesis los añade a la pila y dependiendo de cual sea
	 * llama al metodo checkPila para vaciarla.
	 * @param ch
	 */
	private static void addToPila(char ch, Stack <Character> pila, Stack <Character> postFix ) {
		if(ch == LEFT_PAR || ch == ADD || ch == SUB || ch == MULT || ch == DIV || ch == EXP) {
			if( !pila.isEmpty() && getPrecedence(pila.lastElement()) == getPrecedence(ch) ) 
				postFix.push( pila.pop() );
			pila.push( Character.valueOf(ch) );
		}
		else if(ch == RIGHT_PAR) {
			pila.push( Character.valueOf(ch) );
			checkPila(pila, postFix);
		}
		else {
			postFix.push( Character.valueOf(ch) );
		}
	}
	
	/**
	 * Convierte una cadena de caracteres que representa una expresion en notacion
	 * infija a postfija.
	 * @param str La cadena de texto que representa la expresion infija.
	 * @return Un objeto de tipo Stack que contiene los elementos de la expresion
	 * recibida como parametro en orden o notacion postfija.
	 */
	public static Stack<Character> inFixToPost(String str) {
		Stack <Character> pila = new Stack<>();
		Stack <Character> postFix = new Stack<>();
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			addToPila(ch, pila, postFix);
		}
		if(!pila.isEmpty())
			checkPila(pila, postFix);
		
		return postFix;
	}
	
	
}
