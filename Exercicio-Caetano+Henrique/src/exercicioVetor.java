import java.util.Arrays;
import java.util.Random;


public class exercicioVetor {
	
	public static void imprimirVetor(int vet[]){
		for(int i = 0 ; i<vet.length ; i++){
			System.out.println("Elemento ("+i+") = "+vet[i]);
		}
	}
	public static void main(String[] args){
		int vet5[] = new int[5];
		int vet10[] = new int[10];
		int matriz[][] = new int[4][3];
		Random gerador = new Random();
		for(int i = 0 ; i < vet5.length ; i++){
			vet5[i] = gerador.nextInt(10); 
		}
		System.out.println("Vetor 1:");
		exercicioVetor.imprimirVetor(vet5);
		
		for(int i = 0 ; i < vet10.length ; i++){
			vet10[i] = gerador.nextInt(10); 
		}
		System.out.println("Vetor 2:");
		exercicioVetor.imprimirVetor(vet10);
		//Preencher matriz
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j< 3 ; j++){
				matriz[i][j] = gerador.nextInt(10);
			}
		}
		System.out.println("Matriz original:");
		//Imprimir matriz
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j < 3; j++){
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println("");
		}
		//Achar menor
		int menor = Integer.MAX_VALUE;
		for(int i = 0 ; i < vet5.length;i++){
			if(vet5[i] < menor){
				menor = vet5[i];
			}
		}
		//Achar maior
		int maior = Integer.MIN_VALUE;
		for(int i = 0 ; i < vet10.length ; i++){
			if(vet10[i] > maior){
				maior = vet10[i];
			}
		}
		int resultado = maior * menor;
		System.out.println("Maior:"+maior);
		System.out.println("Menor:"+menor);
		System.out.println("Multiplicação:"+resultado);
		int matrizResultante[][] =  new int[4][3];
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j< 3 ; j++){
				matrizResultante[i][j] = matriz[i][j] + resultado;
			}
		}
		System.out.println("Matriz resultante:");
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j < 3; j++){
				System.out.print(matrizResultante[i][j]+ " ");
			}
			System.out.println("");
		}
		int somaLinha[] = new int[4];
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0; j<3;j++){
				if(matrizResultante[i][j]%2 == 0){
					somaLinha[i] += matrizResultante[i][j];
				}
			}
		}
		int qnt = 0;
		int[] qntColuna = new int[3];
		for(int i = 0 ; i < 3; i++){
			for(int j = 0 ; j < 4; j++){
				if(matrizResultante[j][i]>1 && matrizResultante[j][i]<5){
					qntColuna[i]++;
				}
			}
		}
		System.out.println("Soma das linhas:");
		exercicioVetor.imprimirVetor(somaLinha);
		System.out.println("A quantidade de	elementos entre	1 e	5 em cada coluna da	matriz resultante:");
		exercicioVetor.imprimirVetor(qntColuna);
	}
}
