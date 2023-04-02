package figuras.figura;

import java.util.Stack;

import calculadora.NotationExpresion;
import figuras.calculadora.CalcularFigura;

public class Cuadrado extends Figura {
	private float lado;
	
	/**
	 * Instancia un cuadrado
	 * @param lado, la longitud del lado del cuadrado
	 */
	public Cuadrado(float lado) {
		super("L*L","L+L+L+L");
		this.lado = lado;
	}
	
	/*
	 * Permite cambiar la longitud del lado del cuadrado instanciado
	 */
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	/**
	 * Devuelve la longitud del lado del cuadrado
	 * @lado : float
	 */
	public float getLado() {
		return this.lado;
	}
	
	@Override
	protected Stack <String> replaceValues(Stack<Character> exp) {
		Stack <String> res = new Stack<>();
		for(int i=0 ; i<exp.size(); i++) {
			if(exp.elementAt(i).equals('L'))
				res.add(Float.toString(this.getLado()));
			else
				res.add(Character.toString(exp.elementAt(i)));
		}
		return res;
	}
	
	@Override
	public Stack<String> getAreaInfix() {
		Stack<Character> exp = NotationExpresion.inFixToPost(this.formulaArea);
		return replaceValues(exp);
	}

	@Override
	public Stack<String> getPerimetroInfix() {
		Stack<Character> exp = NotationExpresion.inFixToPost(this.formulaPerimetro);
		return replaceValues(exp);
	}
	
	//Demo cuadrado
	public static void main(String[] args) {
		Cuadrado cuad = new Cuadrado(5.0f);
		System.out.println("Formula del Area: " + cuad.formulaArea);
		System.out.println("Formula del Perimetro: " +cuad.formulaPerimetro);
		System.out.println("Formula del Area Notacion Infija: " + cuad.getAreaInfix());
		System.out.println("Formula del Perimetro Notacion Infija: " + cuad.getPerimetroInfix());
		
		System.out.println( "Area: " + CalcularFigura.getArea(cuad) );
		System.out.println( "Perimetro: " + CalcularFigura.getPerimetro(cuad) );
	}
}
