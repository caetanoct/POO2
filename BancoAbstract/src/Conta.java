import javax.swing.JOptionPane;

public abstract class Conta implements Imprimivel {

	String numero;
	double saldo;

	public abstract void sacar(double valor);

	public abstract void depositar(double valor);

	public void transferir(double valor, Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}
}
