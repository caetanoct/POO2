import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		int opc = 0;
		Ordenacao ordenacao = new Ordenacao();
		int[] array = new int[1];
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir novo vetor\n2- Ordenar crescente\n3- Ordenar decrescente\n4- Imprimir maior e menor valor\n5- Quantidade de numeros maiores que 10\n6- Soma do array\n7- Sair"));
			switch(opc) {
			
			case 1:
				int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
				array = new int[tam];
				for (int i = 0; i < tam; i++) {
					array[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição "+(i+1)));
				}
				ordenacao = new Ordenacao(array);
				break;
			
			case 2:
				ordenacao.ordenaCrescente();
				JOptionPane.showMessageDialog(null, ordenacao.toString());
				break;
			
			case 3:
				JOptionPane.showMessageDialog(null, ordenacao.ordenaDecrescente(array));
				
				break;
			
			case 4:
				ordenacao.imprimirMaiorMenor();
				break;
			
			case 5:
				JOptionPane.showMessageDialog(null, "Quantidade de números maiores do que 10: "+ordenacao.maioresDez());
				break;
			
			case 6:
				ordenacao.soma();
				break;
			
			case 7:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;
			}
		}while (opc != 7);
	}
}
