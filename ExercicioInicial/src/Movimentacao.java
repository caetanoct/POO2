public class Movimentacao {

	String descricao;
	double valor;
	boolean credito;

	public Movimentacao() {

	}

	public Movimentacao(String descricao, double valor, boolean credito) {
		this.descricao = descricao;
		this.valor = valor;
		this.credito = credito;
	}

	public String printMovimentacao() {
		if (credito) {
			return (this.descricao + ": " + this.getValor() + ", crédito");
		} else {
			return (this.descricao + ": " + this.getValor() + ", débito");
		}
	}

	public double getValor() {
		return this.valor;
	}
}
