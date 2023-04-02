package figuras.figura;

public abstract class Triangulo extends Figura{
	private float base;
	private float altura;
	private float l1;
	private float l2;
	
	
	public Triangulo(float base, float l1, float l2, float altura) {
		super("(B*H)/2", "(B+L1+L2)");
		this.base = base;
		this.l1 = l1;
		this.l2 = l2;
		this.altura = altura;
	}
}
