import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		AssistenteAdministrativo administrativo = new AssistenteAdministrativo("18102714", "Henrique", "20/04/2000",
				"dia", "sem");
		AssistenteTecnico tecnico = new AssistenteTecnico("12345678", "Joao", "01/01/2001", 300);

		administrativo.exibeDados();
		tecnico.exibeDados();

		int opc = Integer.parseInt(JOptionPane.showInputDialog("1- Normal\n2- VIP"));

		switch (opc) {
		case 1:
			Normal normal = new Normal(50);
			normal.imprimeNormal();
			normal.imprimeValor();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Ingresso VIP");
			int opc1 = Integer.parseInt(JOptionPane.showInputDialog("1- Camarote Superior\n2- Camarote Inferior"));
			switch (opc1) {
			case 1:
				JOptionPane.showMessageDialog(null, "Camarote Superior");
				CamaroteSuperior superior = new CamaroteSuperior(50, 50, 50);
				JOptionPane.showMessageDialog(null, "Preço: " + superior.getValor());
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Camarote Inferior");
				CamaroteInferior inferior = new CamaroteInferior(50, 50, "42B");
				JOptionPane.showMessageDialog(null,
						"Localizacao: " + inferior.getLocalizacao() + "\nPreço: " + inferior.getValorTotal());
				break;
			}
		}

		opc = Integer.parseInt(JOptionPane.showInputDialog("1- Novo\n2- Velho"));

		switch (opc) {
		case 1:
			Novo novo = new Novo("Endereço", 100000, 10000);
			novo.imprimePreco();
			break;
		case 2:
			Velho velho = new Velho("Endereço", 100000);
			velho.imprimeDesconto();
			break;
		}

		Gerente gerente = new Gerente("Gerente", "Nascimento Gerente", "Senha Gerente");

		for (int i = 0; i < 3; i++) {
			gerente.adicionarEmpregado(new Empregado(("Empregado " + i), ("Nascimento Empregado" + i),
					("Matricula Empregado " + i), ("CPF Empregado " + i), i));
		}
		gerente.relatorioEmpregados();
		JOptionPane.showMessageDialog(null, "Gerente: "+gerente.getNome()+"\nSenha: "+gerente.getSenha());
		
		
		JOptionPane.showMessageDialog(null, "Salario Assistente Administrativo: "+ administrativo.calculeSalario());
		JOptionPane.showMessageDialog(null, "Salário Assistente Técnico: "+tecnico.calculeSalario());
	}

}
