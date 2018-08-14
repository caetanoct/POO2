import javax.swing.JOptionPane;

public class Assistente extends Funcionario {

	private String matricula;

	public Assistente() {

	}

	public Assistente(String matricula, String nome, String dataDeNascimento) {
		super(nome, dataDeNascimento);
		this.matricula = matricula;
	}

	@Override
	public void exibeDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + super.getNome() + "\nData de Nascimento: "
				+ super.getDataDeNascimento() + "\nNúmero de matrícula: " + matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
