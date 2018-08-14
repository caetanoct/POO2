import java.util.Random;

import javax.swing.JOptionPane;


public class Controle {

	
	public static void main(String[] args) {
		Random gerador = new Random();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do tamanho do array"));
		int[] arrayInteiros = new int[n];
		for(int i  = 0 ; i<arrayInteiros.length;i++){
			arrayInteiros[i] = 	Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do elemento ("+i+")"));
		}
		
		
		Ordenacao ManipuladorDeArray = new Ordenacao(arrayInteiros);
		

		System.out.println("Array Original: ");
		ManipuladorDeArray.imprimirArray(arrayInteiros);
		
		System.out.println("Array Crescente: ");
		ManipuladorDeArray.imprimirCrescente(arrayInteiros);
		
		System.out.println("Array Decrescente: ");
		int arrayNovo[];
		arrayNovo = ManipuladorDeArray.ordenarDecrescente(arrayInteiros);
		ManipuladorDeArray.imprimirArray(arrayNovo);
		
		int qnt = ManipuladorDeArray.quantosMaiorQue10();
		System.out.println("Quantidade de números maior que 10:"+ qnt);
		
		int soma = ManipuladorDeArray.somaDoArray(arrayInteiros);
		System.out.println("Soma do Array: "+ soma);
	}	 	  	  	 		 	  	  	   	  	 	

}
