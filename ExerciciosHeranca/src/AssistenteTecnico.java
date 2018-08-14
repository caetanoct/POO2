import javax.swing.JOptionPane;

public class AssistenteTecnico extends Assistente {
	private double bonusSalarial;

	public AssistenteTecnico() {

	}
	
	public AssistenteTecnico(String matricula, String nome, String dataDeNascimento, double bonusSalarial) {
		super(matricula, nome, dataDeNascimento);
		this.bonusSalarial = bonusSalarial;
	}

	@Override
	public void exibeDados() {
		JOptionPane.showMessageDialog(null,
				"Nome: " + super.getNome() + "\nData de Nascimento: " + super.getDataDeNascimento() + "\nMatricula: "
						+ super.getMatricula() + "\nBônus Salarial: " + bonusSalarial);
	}
	
	public double calculeSalario() {
		return super.getSalario() + bonusSalarial;
	}
}
