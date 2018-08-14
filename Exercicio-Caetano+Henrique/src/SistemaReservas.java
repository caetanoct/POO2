import java.util.Arrays;

import javax.swing.JOptionPane;

public class SistemaReservas {

	public static void main(String[] args) {
		boolean[] arrayAssentos = new boolean[10];
		Arrays.fill(arrayAssentos, false);
		System.out.println(Arrays.toString(arrayAssentos));
		boolean a = true;
		int prox = 0;
		int prox2 = 5;
		while (a == true) {
			String[] menu = { "Ocupar 1 classe", "Ocupar 2 classe",
					"Imprimir array", "Sair" };
			int option = JOptionPane.showOptionDialog(null, "Menu", "Menu",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, menu, null);

			switch (option) {
			case 0:
				boolean temDisponivel = false;
				for (int i = 0; i < 5; i++) {
					if (arrayAssentos[i] == false) {
						temDisponivel = true;
					}
				}
				
				if (temDisponivel == true) {
					arrayAssentos[prox] = true;
					prox++;
					JOptionPane.showMessageDialog(null,
							Arrays.toString(arrayAssentos));
				}
				break;
			case 1:
				boolean temDisponivel2 = false;
				for (int i = 5; i < 10; i++) {
					if (arrayAssentos[i] == false) {
						temDisponivel2 = true;
					}
				}
				
				if (temDisponivel2 == true) {
					arrayAssentos[prox2] = true;
					prox2++;
					JOptionPane.showMessageDialog(null,
							Arrays.toString(arrayAssentos));
				}
				break;
			case 2:
				JOptionPane.showMessageDialog(null,
						Arrays.toString(arrayAssentos));
				break;
			case 3:
				a = false;
				break;
			}
		}
	}
}
