import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		ArrayList<CarbonFootprint> carbon = new ArrayList<CarbonFootprint>();

		int opc;
		do {
			opc = Integer.parseInt(
					JOptionPane.showInputDialog("1- Prédio\n2- Carro\n3- Bicicleta\n4- Informações\n5- Sair"));

			switch (opc) {
			case 1:
				int pessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas no prédio"));
				int lampada = Integer
						.parseInt(JOptionPane.showInputDialog("Digite a quantidade de lampadas no prédio"));
				boolean renovavel = Boolean.parseBoolean(
						JOptionPane.showInputDialog("true- usa energia renovavel\nfalse- não usa energia renovavel"));
				boolean arcondicionado = Boolean.parseBoolean(
						JOptionPane.showInputDialog("true- usa ar-condicionado\nfalse- não usa ar-condicionado"));

				carbon.add(new Building(pessoas, renovavel, lampada, arcondicionado));
				break;

			case 2:
				String combustivel = JOptionPane
						.showInputDialog("Digite o tipo de combustivel(GNV, Diesel, Gasolina, Flex)");
				int tamanhoTanque = Integer
						.parseInt(JOptionPane.showInputDialog("Digite o tamanho do tanque do carro"));
				double mediaKilometragem = Double
						.parseDouble(JOptionPane.showInputDialog("Digite a média de kilometragem mensal do carro"));

				carbon.add(new Car(combustivel, tamanhoTanque, mediaKilometragem));
				break;

			case 3:
				int kmRodado = Integer.parseInt(JOptionPane.showInputDialog("Digite os km rodados da bicicleta"));
				String marca = JOptionPane.showInputDialog("Digite a marca da bicicleta");

				carbon.add(new Bicycle(kmRodado, marca));
				break;

			case 4:
				for (CarbonFootprint i : carbon) {
					i.informacoes();
					JOptionPane.showMessageDialog(null, "Pegada de carbono: " + i.getCarbonFootprint());
				}
			}
		} while (opc != 5);
	}
}
