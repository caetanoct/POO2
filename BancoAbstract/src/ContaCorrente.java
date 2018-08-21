import javax.swing.JOptionPane;

public class ContaCorrente extends Conta implements Imprimivel {

	double taxaDeOperacao;

	public ContaCorrente(String numero, double taxaDeOperacao) {
		this.numero = numero;
		this.taxaDeOperacao = taxaDeOperacao;
		this.saldo = 0;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= taxaDeOperacao;
		if (this.saldo - valor >= 0) {
			this.saldo -= valor;
		} else {
			JOptionPane.showMessageDialog(null, "Saque inválido(saldo)");
		}

	}

	@Override
	public void depositar(double valor) {
		this.saldo -= taxaDeOperacao;
		this.saldo += valor;
	}

	@Override
	public void mostrarDados() {
		JOptionPane.showMessageDialog(null,
				"Número da conta: " + numero + "\nSaldo: " + saldo + "\nTaxa de Operação: " + taxaDeOperacao);

	}

}
