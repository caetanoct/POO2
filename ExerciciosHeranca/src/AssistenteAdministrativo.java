import javax.swing.JOptionPane;

public class AssistenteAdministrativo extends Assistente {

	private String turno;
	private String adicionalNoturno;

	public AssistenteAdministrativo() {

	}

	public AssistenteAdministrativo(String matricula, String nome, String dataDeNascimento, String turno, String adicionalNoturno) {
		super(matricula, nome, dataDeNascimento);
		this.turno = turno;
		this.adicionalNoturno = adicionalNoturno;
	}
	
	@Override
	public void exibeDados() {
		JOptionPane.showMessageDialog(null,
				"Nome: " + super.getNome() + "\nData de Nascimento: " + super.getDataDeNascimento() + "\nMatrícula: "
						+ super.getMatricula() + "\nTurno: " + turno + "\nAdicional Noturno: " + adicionalNoturno);

	}
	
	public double calculeSalario() {
		return super.getSalario();
	}

}
