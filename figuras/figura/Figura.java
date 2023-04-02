package figuras.figura;

import java.util.Stack;

public abstract class Figura {
	private float area;
	private float perimetro;
	protected String formulaArea;
	protected String formulaPerimetro;
	
	/**
	 * Instancia un objeto de tipo Figura
	 */
	public Figura(String formulaArea, String formulaPerimetro) {
		this.area = 0;
		this.perimetro = 0;
		this.formulaArea = formulaArea;
		this.formulaPerimetro = formulaPerimetro;
	}
	
	/**Devuelve la formula del area de la figura en formato de cadena de texto
	 * @return the formulaArea
	 */
	public String getFormulaArea() {
		return formulaArea;
	}
	/**Devuelve la formula del perimetro de la figura en formato de cadena de texto
	 * @return the formulaPerimetro
	 */
	public String getFormulaPerimetro() {
		return formulaPerimetro;
	}
	
	/**
	 * Remplaza las variables de las formulas por los valores numericos de la figura.
	 * @param exp
	 * @return
	 */
	protected abstract Stack <String> replaceValues(Stack<Character> exp);
	/**
	 * Devuelve la formula del area de la figura en un Stack con los valores 
	 * de las variable remplazados por los parametros de la figura.
	 * @return Stack <String>
	 */
	public abstract Stack<String> getAreaInfix();
	/**
	 * Devuelve la formula del perimetro de la figura en un Stack con los valores 
	 * de las variable remplazados por los parametros de la figura.
	 * @return Stack <String>
	 */
	public abstract Stack<String> getPerimetroInfix();
	
	
}
