
public class Retangulo extends Quadrilatero {

	private double base;
	private double altura;

	public Retangulo(double[] lados, double base, double altura) {
		this.setLados(lados);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}
}
