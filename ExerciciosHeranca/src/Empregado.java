import javax.swing.JOptionPane;

public class Empregado extends Funcionario {

	private String matricula;
	private String cpf;
	private int tempoServico;

	public Empregado() {

	}

	public Empregado(String nome, String dataDeNascimento, String matricula, String cpf, int tempoServico) {
		super(nome, dataDeNascimento);
		this.matricula = matricula;
		this.cpf = cpf;
		this.tempoServico = tempoServico;
	}

	@Override
	public void exibeDados() {
		JOptionPane.showMessageDialog(null,
				"Nome: " + super.getNome() + "\nData de Nascimento: " + super.getDataDeNascimento() + "\nMatricula: "
						+ matricula + "\nCPF: " + cpf + "\nTempo de Servico: " + tempoServico);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
