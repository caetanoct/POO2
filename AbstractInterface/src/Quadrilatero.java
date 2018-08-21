
public abstract class Quadrilatero implements FormaGeometrica {

	private double[] lados;
	private double perimetro;
	private double area;

	public Quadrilatero() {

	}

	public Quadrilatero(double[] lados) {
		this.lados = lados;
	}

	public double calcularPerimetro() {
		this.perimetro = 0;
		for (double i : lados) {
			this.perimetro += i;
		}
		return perimetro;
	}

	public double[] getLados() {
		return lados;
	}

	public void setLados(double[] lados) {
		this.lados = lados;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
