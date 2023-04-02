package figuras.figura;

import java.util.Iterator;
import java.util.Stack;

import calculadora.NotationExpresion;

public class Rectangulo extends Figura {
	private float base;
	private float altura;
	/**
	 * 
	 * @param base
	 * @param altura
	 */
	public Rectangulo(float base, float altura) {
		super("(B*H)","(B*B)+(H*H)");
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @return the base
	 */
	public float getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(float base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	protected Stack <String> replaceValues(Stack<Character> exp) {
		Stack <String> res = new Stack<>();
		for(int i = 0; i<exp.size(); i++) {
			if(exp.elementAt(i).equals('B') )
				res.add(Float.toString(this.base));
			else if(exp.elementAt(i).equals('H') )
				res.add(Float.toString(this.altura));
			else
				res.add(Character.toString(exp.elementAt(i)));
		}
		return res;
	}
	
	@Override
	public Stack<String> getAreaInfix(){
		Stack<Character> exp = NotationExpresion.inFixToPost(this.formulaArea);
		return replaceValues(exp);
	}

	@Override
	public Stack<String> getPerimetroInfix() {
		Stack<Character> exp = NotationExpresion.inFixToPost(this.formulaPerimetro);
		return replaceValues(exp);
	}
	
	public static void main(String[] args) {
		//demo rectangulo
		Rectangulo r = new Rectangulo(5.5f, 6.0f);
		System.out.println(r.getPerimetroInfix());
		System.out.println(r.getAreaInfix());
	}
}
