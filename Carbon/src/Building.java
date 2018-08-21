import javax.swing.JOptionPane;

public class Building implements CarbonFootprint {

	private int pessoas;
	private boolean renovavel;
	private int lampadas;
	private boolean arcondicionado;

	public Building(int pessoas, boolean renovavel, int lampadas, boolean arcondicionado) {
		this.pessoas = pessoas;
		this.renovavel = renovavel;
		this.lampadas = lampadas;
		this.arcondicionado = arcondicionado;
	}

	@Override
	public double getCarbonFootprint() {
		double multiplicador = 0;
		double carbon;

		if (arcondicionado) {
			multiplicador += 10;
		}

		if (renovavel) {
			multiplicador -= 4;
		}

		multiplicador += lampadas * 3;

		carbon = pessoas * multiplicador;

		return carbon;
	}

	@Override
	public void informacoes() {
		JOptionPane.showMessageDialog(null, "Tipo: Prédio\nNumero de pessoas: " + pessoas + "\nRenovavel: " + renovavel
				+ "\nLampadas: " + lampadas + "\nAr-Condicionado: " + arcondicionado);
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}

	public boolean isRenovavel() {
		return renovavel;
	}

	public void setRenovavel(boolean renovavel) {
		this.renovavel = renovavel;
	}

	public int getLampadas() {
		return lampadas;
	}

	public void setLampadas(int lampadas) {
		this.lampadas = lampadas;
	}

	public boolean isArcondicionado() {
		return arcondicionado;
	}

	public void setArcondicionado(boolean arcondicionado) {
		this.arcondicionado = arcondicionado;
	}
}
