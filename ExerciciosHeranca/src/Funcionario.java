import javax.swing.JOptionPane;

public class Funcionario {
	private String nome;
	private String dataDeNascimento;
	private double salario = 5000;

	public Funcionario() {

	}

	public Funcionario(String nome, String dataDeNascimento) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}

	public void exibeDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nData de Nascimento: " + dataDeNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
