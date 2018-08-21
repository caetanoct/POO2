import javax.swing.JOptionPane;

public class Bicycle implements CarbonFootprint {

	private int kmRodado;
	private String marca;

	public Bicycle(int kmRodado, String marca) {
		this.kmRodado = kmRodado;
		this.marca = marca;
	}

	@Override
	public double getCarbonFootprint() {

		return 0;
	}

	@Override
	public void informacoes() {
		JOptionPane.showMessageDialog(null, "Tipo: bicicleta\nKilometros rodados: " + kmRodado + "\nMarca: " + marca);
	}

	public int getKmRodado() {
		return kmRodado;
	}

	public void setKmRodado(int kmRodado) {
		this.kmRodado = kmRodado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
