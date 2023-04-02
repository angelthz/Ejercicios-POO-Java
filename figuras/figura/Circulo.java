package figuras.figura;

import java.util.Stack;

import calculadora.NotationExpresion;
import figuras.calculadora.CalcularFigura;

public class Circulo extends Figura{
	private float radio;
	
	public Circulo(float radio) {
		super("π*r^2", "r*2");
		this.radio = radio;
	}

	/**
	 * @return the radio
	 */
	public float getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	protected Stack<String> replaceValues(Stack<Character> exp) {
		Stack <String> res = new Stack<>();
		for(int i=0; i<exp.size(); i++) {
			if(exp.elementAt(i).equals('π'))
				res.add(Float.toString((float)Math.PI));
			else if(exp.elementAt(i).equals('r'))
				res.add(Float.toString(this.radio));
			else
				res.add(Character.toString(exp.elementAt(i)));
		}
		return res;
	}

	@Override
	public Stack<String> getAreaInfix() {
		// TODO Auto-generated method stub
		return replaceValues(NotationExpresion.inFixToPost(this.formulaArea));
	}

	@Override
	public Stack<String> getPerimetroInfix() {
		// TODO Auto-generated method stub
		return replaceValues(NotationExpresion.inFixToPost(this.formulaPerimetro));
	}
	
	public static void main(String[] args) {
		Circulo cir = new Circulo(6.0f);
		System.out.println(cir.getFormulaArea());
		System.out.println(cir.getFormulaPerimetro());
		System.out.println(cir.getAreaInfix());
		System.out.println(cir.getPerimetroInfix());
		System.out.println(CalcularFigura.getArea(cir));
		System.out.println(CalcularFigura.getPerimetro(cir));
	}
}
