package figuras.calculadora;

import java.util.Stack;

import calculadora.Calculator;
import figuras.figura.Figura;
import figuras.figura.Rectangulo;

public class CalcularFigura {
	public static float getArea(Figura f) {
		return Calculator.calculateInfix(f.getAreaInfix());
	}
	
	public static float getPerimetro(Figura f) {
		return Calculator.calculateInfix(f.getPerimetroInfix());
	}
	
	public static void main(String[] args) {
		//float area = CalcularFigura.getArea(new Rectangulo(5.5f, 6.0f));
		float per = CalcularFigura.getPerimetro(new Rectangulo(5.5f, 6.0f));
		//System.out.println(area);
		System.out.println(per);
	}
}
