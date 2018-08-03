public class Conta {

	String nomeCliente;
	String cpfCliente;

	public Conta() {

	}

	public Conta(String nomeCliente, String cpfCliente) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}

	public String getCpfCliente() {
		return this.cpfCliente;
	}
}
