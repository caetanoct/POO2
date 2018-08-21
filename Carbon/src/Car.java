import javax.swing.JOptionPane;

public class Car implements CarbonFootprint {

	private String combustivel;
	private int tamanhoTanque;
	private double mediaKilometragem;

	public Car(String combustivel, int tamanhoTanque, double mediaKilometragem) {
		this.combustivel = combustivel;
		this.tamanhoTanque = tamanhoTanque;
		this.mediaKilometragem = mediaKilometragem;
	}

	@Override
	public double getCarbonFootprint() {
		double carbon;

		double multiplicador = 0;

		switch (combustivel.toLowerCase()) {
		case "diesel":
			multiplicador += 5;
		case "gasolina":
			multiplicador += 4.5;
		case "gnv":
			multiplicador += 4;
		case "flex":
			multiplicador += 3;
			break;
		default:
			multiplicador = 5;
		}

		carbon = mediaKilometragem * multiplicador;
		return carbon;
	}

	@Override
	public void informacoes() {
		JOptionPane.showMessageDialog(null, "Tipo: carro\nCombustivel: " + combustivel + "\nTamanho do tanque: "
				+ tamanhoTanque + "\nMedia Kilometragem: " + mediaKilometragem);
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public int getTamanhoTanque() {
		return tamanhoTanque;
	}

	public void setTamanhoTanque(int tamanhoTanque) {
		this.tamanhoTanque = tamanhoTanque;
	}

	public double getMediaKilometragem() {
		return mediaKilometragem;
	}

	public void setMediaKilometragem(double mediaKilometragem) {
		this.mediaKilometragem = mediaKilometragem;
	}
}
