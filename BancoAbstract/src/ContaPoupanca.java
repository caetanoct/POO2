import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta implements Imprimivel {

	public double limite;

	public ContaPoupanca(String numero, double limite) {
		this.numero = numero;
		this.limite = limite;
		this.saldo = 0;
	}
	
	@Override
	public void sacar(double valor) {
		if (this.saldo - valor >= -limite) {
			this.saldo -= valor;
		} else {
			JOptionPane.showMessageDialog(null, "Saque inválido(saldo)");
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void mostrarDados() {
		JOptionPane.showMessageDialog(null, "Número da conta: " + numero + "\nLimite: " + limite + "\nSaldo: " + saldo);

	}

}
