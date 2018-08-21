import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o número de formas a serem criadas");
		int qnt = input.nextInt();
		ArrayList<Retangulo> retangulos = new ArrayList<Retangulo>();
		ArrayList<Quadrado> quadrados = new ArrayList<Quadrado>();
		ArrayList<Circulo> circulos = new ArrayList<Circulo>();

		int opc;
		do {
			System.out.println("1- Retângulo\n2- Quadrado\n3- Círculo");
			opc = input.nextInt();

			switch (opc) {
			case 1:
				double[] lados = new double[4];
				for (int i = 0; i < 4; i++) {
					System.out.println("Digite o tamanho do lado " + (i + 1));
					lados[i] = input.nextDouble();
				}

				System.out.println("Digite o tamanho da base");
				double base = input.nextDouble();
				System.out.println("Digite o tamanho da altura");
				double altura = input.nextDouble();
				retangulos.add(new Retangulo(lados, base, altura));
				qnt--;
				break;
			case 2:
				System.out.println("Digite o valor dos lados");
				double lado = input.nextDouble();
				quadrados.add(new Quadrado(lado));
				qnt--;
				break;
			case 3:
				System.out.println("Digite o valor do raio");
				double raio = input.nextDouble();
				Circulo circulo = new Circulo(raio);
				circulos.add(circulo);
				qnt--;
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (qnt > 0);

		for (Retangulo ret : retangulos) {
			JOptionPane.showMessageDialog(null,
					"Forma: Retângulo\nPerímetro: " + ret.calcularPerimetro() + "\nÁrea: " + ret.calcularArea());
		}
		for (Quadrado quadrado : quadrados) {
			JOptionPane.showMessageDialog(null,
					"Forma: Quadrado\nPerímetro: " + quadrado.calcularPerimetro() + "\nÁrea: " + quadrado.calcularArea());
		}
		for (Circulo circulo : circulos) {
			JOptionPane.showMessageDialog(null,
					"Forma: Círculo\nPerímetro: " + circulo.calcularPerimetro() + "\nÁrea: " + circulo.calcularArea());
		}
	}
}
