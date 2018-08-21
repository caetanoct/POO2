
public class Quadrado extends Quadrilatero {

	public Quadrado(double lado) {
		double[] temp = new double[4];
		for (int i = 0; i < 4; i++) {
			temp[i] = lado;
		}
		this.setLados(temp);
	}

	@Override
	public double calcularArea() {
		return this.getLados()[0] * this.getLados()[0];
	}

}
