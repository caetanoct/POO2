import java.util.Scanner;

public class Operacao {

	Scanner input = new Scanner(System.in);

	public void soma() {
		System.out.println("Digite o primeiro numero da soma: ");
		double n1 = input.nextInt();
		System.out.println("Digite o segundo numero da soma: ");
		double n2 = input.nextInt();

		double resposta = n1 + n2;

		System.out.println("Resultado: " + resposta);
	}

	public void calculaMedia(double n1, double n2) {
		double resposta = (n1 + n2) / 2;

		System.out.println("Resultado: " + resposta);
	}

	public int multiplicacao() {
		System.out.println("Digite o primeiro numero da multiplicacao: ");
		int n1 = input.nextInt();
		System.out.println("Digite o segundo numero da multiplicacao: ");
		int n2 = input.nextInt();

		return n1 * n2;
	}

	public double divisao(double n1, double n2) {
		return n1 / n2;
	}

	public void subtracao() {
		System.out.println("Digite o primeiro numero da subtracao: ");
		double n1 = input.nextInt();
		System.out.println("Digite o segundo numero da subtracao: ");
		double n2 = input.nextInt();

		double resposta = n1 - n2;
		System.out.println("Resposta: " + resposta);
	}

	public double mediaPonderada(double n1, double p1, double n2, double p2) {
		return (n1 * p1 + n2 * p2) / (p1 + p2);
	}

	public void fatorial(int n) {
		double resposta = 1;
		for (int i = n; i > 0; i--) {
			resposta *= i;
		}
		System.out.println("Resposta: " + resposta);
	}
}
