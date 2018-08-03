import java.util.ArrayList;

public class ContaCorrente extends Conta {

	int numero;
	double saldo;
	boolean chequeEspecial;
	double limite;
	ArrayList<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();

	public ContaCorrente() {

	}

	public ContaCorrente(String nomeCliente, String cpfCliente, int numero, boolean chequeEspecial, double limite) {
		super(nomeCliente, cpfCliente);
		this.numero = numero;
		this.saldo = 0;
		this.chequeEspecial = chequeEspecial;
		this.limite = limite;
	}

	public boolean sacar(double valor) {
		if (valor <= limite && saldo >= valor) {
			this.saldo -= valor;
			movimentacoes.add(new Movimentacao("saque", valor, false));
			return true;
		} else {
			return false;
		}
	}

	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		movimentacoes.add(new Movimentacao("depósito", valor, true));
	}

	public ArrayList<Movimentacao> getMovimentacoes() {
		return this.movimentacoes;
	}

	public void setSaldo(double valor) {
		this.saldo = valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
