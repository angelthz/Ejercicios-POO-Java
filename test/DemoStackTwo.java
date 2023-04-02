package test;

import java.util.Stack;


public class DemoStackTwo {
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
	private static Stack <Character> pila = new Stack<>();
	private static Stack <Character> postFix = new Stack<>();
	
	private static int getPrecedence(char ch) {
		if(ch==EXP)
			return P_THREE;
		else if(ch==MULT || ch==DIV)
			return P_TWO;
		else if(ch==ADD || ch==SUB)
			return P_ONE;
		return P_ZERO;
	}
	
	private static int getPrecedence(Character ch) {
		return getPrecedence(ch.charValue());
	}
	
	public static void checkPila() {
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
	
	public static void addToPila(char ch) {
		if(ch == LEFT_PAR || ch == ADD || ch == SUB || ch == MULT || ch == DIV || ch == EXP) {
			if( !pila.isEmpty() && getPrecedence(pila.lastElement()) == getPrecedence(ch) ) 
				postFix.push( pila.pop() );
			pila.push( Character.valueOf(ch) );
		}
		else if(ch == RIGHT_PAR) {
			pila.push( Character.valueOf(ch) );
			checkPila();
		}
		else {
			postFix.push( Character.valueOf(ch) );
		}
	}
	
	public static void inToPost(String str) {
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			addToPila(ch);
		}
		if(!pila.isEmpty())
			checkPila();
		
		System.out.println(postFix);
	}

	
	public static void main(String[] args) {
		
		String inFix = "A+B*C/D";
		inToPost(inFix);

	}
}
