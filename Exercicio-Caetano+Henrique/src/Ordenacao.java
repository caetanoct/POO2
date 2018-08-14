
/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

public class Ordenacao {
    
    private int[] array;
    
    
    //Funciona como um setter na hora de instanciar o objeto
    public Ordenacao(int[] arrayParaOrdenar){
    	this.array = arrayParaOrdenar;
    }
    //Getter do array private
    public int[] getArray() {
		return array;
	}
    //Setter do array private
	public void setArray(int[] array) {
		this.array = array;
	}
	//Método para imprimir array qualquer em String
	public void imprimirArray(int[] vetorRecebido){
		setArray(vetorRecebido);
		System.out.println(toString());
	}
	public int[] copiarArray(int[] arrayQueSeraCopiado) {
		int arrayCopiado[] = new int[arrayQueSeraCopiado.length];
		for(int i = 0 ; i<arrayQueSeraCopiado.length;i++) {
			arrayCopiado[i] = arrayQueSeraCopiado[i];
		}
		return arrayCopiado;
	}
	//Imprimir os valores recebidos em ordem crescente (com parâmetros, sem retorno).
	public void imprimirCrescente(int[] vetor){	 	  	  	 		 	  	  	   	  	 	
		int vet[] = copiarArray(vetor);
		for(int i=0;i<vet.length;i++){
			for(int j = i+1;j<vet.length;j++){
				if(vet[j] < vet[i]){
					int aux = 0;
					aux = vet[j];
					vet[j] = vet[i];
					vet[i] = aux;
				}
			}
		}
		
		imprimirArray(vet);
	}
		
	//Imprimir os valores recebidos em ordem decrescente (com parâmetros, com retorno).
	public int[] ordenarDecrescente(int[] vetor){
		int arrayOrdenado[] = copiarArray(vetor);
		for(int i=0;i<arrayOrdenado.length;i++){
			for(int j = i+1;j<arrayOrdenado.length;j++){
				if(arrayOrdenado[j] > arrayOrdenado[i]){
					int aux = 0;
					aux = arrayOrdenado[j];
					arrayOrdenado[j] = arrayOrdenado[i];
					arrayOrdenado[i] = aux;
				}
			}
		}
		return arrayOrdenado;
	}
	
	//Imprimir o maior e menor valor (sem parâmetro, sem retorno).
	public void imprimirMaiorMenor(){
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for(int i = 0;i<array.length;i++){	 	  	  	 		 	  	  	   	  	 	
			if(array[i] >= maior){
				maior = array[i];
			}
			if(array[i] <= menor){
				menor = array[i];
			}
			imprimirArray(array);
			System.out.println("Maior: "+maior);
			System.out.println("Menor: "+menor);
		}
	}
	//Devolver o número de valores maiores que 10 (sem parâmetro, com retorno). 
	public int quantosMaiorQue10() {
		int quantidade = 0;
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] > 10) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	public int somaDoArray(int[] arr) {
		int soma = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			soma += arr[i];
		}
		return soma;
	}
    /**
     * Converte o conteudo do array em String formatado
     * Exemplo: 
     * Para o conteudo do array: [1,2,3,4,5]
     * Retorna: "1,2,3,4,5"
     * @return String com o conteudo do array formatado
     */
    @Override
    public String toString(){	 	  	  	 		 	  	  	   	  	 	
    	String minhaString = "";
        for(int i = 0 ; i < array.length; i++){
        	minhaString += array[i]+",";
        }
        return minhaString;
    }

}
