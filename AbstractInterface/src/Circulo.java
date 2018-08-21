
public class Circulo implements FormaGeometrica {

	private double raio;
	private double perimetro;
	private double area;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularPerimetro() {
		perimetro = 2 * Math.PI * raio;
		return perimetro;
	}

	@Override
	public double calcularArea() {
		area = Math.PI * raio * raio;
		return area;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
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
