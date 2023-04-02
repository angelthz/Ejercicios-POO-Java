package calculadora;

import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

import figuras.figura.Figura;
import figuras.figura.Rectangulo;

public class Calculator {
	
	private static float doOperation(char ch, float a, float b) {

		switch(ch) {
			case '^':{
				return (float) Math.pow(a, b);
			}
			case '*':{
				return (a * b);
			}
			case '/':{
				return (a / b);
			}
			case '+':{
				return (a + b);
			}
			case '-':{
				return (a - b);
			}
			default:
				return 0.0f;
		}
	}
	
	private static void calculator(Stack <String> pila) {
		float a = 0f;
		float b = 0f;
		char operator;
		int count = 0;

		while(pila.size() != 1) {
			if(!pila.elementAt(count).matches("^\\d*\\.?\\d*$")) {
				
				
				a = Float.valueOf( pila.elementAt(count-2) );
				b = Float.valueOf( pila.elementAt(count-1) );
				operator = pila.elementAt(count).charAt(0);
				
				pila.remove(count-2);
				pila.remove( count-2 );
				pila.remove(count-2);
				
				String res = String.valueOf(doOperation(operator, a, b));
				
				pila.insertElementAt(res, count-2);;
				
				System.out.println(pila);
				count = 0;
			}
			else
				count++;
		}

	}

	public static float calculateInfix(Stack <String> p) {
		Stack <String> pila = p;
		float a = 0f;
		float b = 0f;
		char operator;
		int count = 0;

		while(pila.size() != 1) {
			if(!pila.elementAt(count).matches("^\\d*\\.?\\d*$")) {
				a = Float.valueOf( pila.elementAt(count-2) );
				b = Float.valueOf( pila.elementAt(count-1) );
				operator = pila.elementAt(count).charAt(0);
				
				pila.remove(count-2);
				pila.remove( count-2 );
				pila.remove(count-2);
				
				String res = String.valueOf(doOperation(operator, a, b));
				
				pila.insertElementAt(res, count-2);;
				
				count = 0;
			}
			else
				count++;
		}
		return Float.valueOf(pila.pop());
	}
	
	
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(6.5555f, 5.534f);
		Stack <String> formula = r1.getAreaInfix();
		System.out.println(formula);
		System.out.println(calculateInfix(formula));
		
	}
}
