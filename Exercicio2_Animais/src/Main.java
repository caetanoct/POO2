import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		Canarinho canarinho = new Canarinho();

		int opt;
		String[] options = { "Cachorro", "Gato", "Canarinho", "Sair" };
		do {
			opt = JOptionPane.showOptionDialog(null, "Escolha a ação", "Animais", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, options, null);

			switch (opt) {
			case 0:
				String[] optionsDog = { "Latir", "Andar", "Retornar" };
				int opt2;
				cachorro = new Cachorro();
				do {
					opt2 = JOptionPane.showOptionDialog(null, "Escolha a ação", "Cachorro",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, optionsDog, null);
					switch (opt2) {
					case 0:
						JOptionPane.showMessageDialog(null, cachorro.latir(), "Cachorro", JOptionPane.PLAIN_MESSAGE);
						break;
					case 1:
						JOptionPane.showMessageDialog(null, cachorro.mover(), "Cachorro", JOptionPane.PLAIN_MESSAGE);
						break;
					}
				} while (opt2 != 2);
				break;

			case 1:
				String[] optionsCat = {"Miar","Andar","Retornar"};
				gato = new Gato();
				do {
					opt2 = JOptionPane.showOptionDialog(null, "Escolha a ação", "Gato", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, optionsCat, null);
					switch(opt2) {
					case 0:
						JOptionPane.showMessageDialog(null, gato.miar(), "Gato", JOptionPane.PLAIN_MESSAGE);
						break;
					case 1:
						JOptionPane.showMessageDialog(null, gato.mover(), "Gato", JOptionPane.PLAIN_MESSAGE);
						break;
					}
				} while (opt2 != 2);
				break;
				
			case 2:
				String[] optionsBird = {"Novo Canarinho", "Cantar", "Voar", "Retornar"};
				do {
					if (canarinho.getTamanhoPasso() == -1) {
						opt2 = 0;
					} else {
						opt2 = JOptionPane.showOptionDialog(null, "Escolha a ação", "Canarinho", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, optionsBird, null);
					}
					switch(opt2) {
					case 0:
						int tamanhoPasso = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho de passo do canarinho"));
						int alturaVoo = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura de voo do canarinho"));
						canarinho = new Canarinho(tamanhoPasso, alturaVoo);
						break;
					case 1:
						JOptionPane.showMessageDialog(null, canarinho.cantar(), "Canarinho", JOptionPane.PLAIN_MESSAGE);
						break;
					case 2:
						JOptionPane.showMessageDialog(null, canarinho.voar(), "Canarinho", JOptionPane.PLAIN_MESSAGE);
					}
				}while (opt2 != 3);
			}
		} while (opt != 3);

	}
}
