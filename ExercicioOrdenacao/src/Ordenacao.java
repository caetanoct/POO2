/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
import javax.swing.JOptionPane;

public class Ordenacao {
    
    private int[] array;
    
    public Ordenacao() {
    	
    }
    /**
     * Recebe o array com o conteudo a ser ordenado
     * @param arrayParaOrdenar contem o conteudo a ser ordenado
     */
    public Ordenacao(int[] arrayParaOrdenar){
    	
     this.array = arrayParaOrdenar;
     
    }
    
    /**
     * Realiza a ordenacao do conteudo do array recebido no construtor
     * @return array com o conteudo ordenado
     */
    public void ordenaCrescente() {
        //Coloque aqui o seu codigo que vai realizar a ordenacao
    	
    	for (int i = 0; i < this.array.length; i++) {
    		for (int j = 0; j < this.array.length; j++) {
    			if (this.array[i] < this.array[j]) {
    				int temp = this.array[i];
    				this.array[i] = this.array[j];
    				this.array[j] = temp;
    			}
    		}
    	}
    }
    
    public String ordenaDecrescente(int[] vetor) {
    	
    	for (int i = 0; i < vetor.length; i++) {
    		for (int j = 0; j < vetor.length; j++) {
    			if (vetor[i] > vetor[j]) {
    				int temp = vetor[i];
    				vetor[i] = vetor[j];
    				vetor[j] = temp;
    			}
    		}
    	}
    	this.array = vetor;
    	
    	return this.toString();
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
        //Coloque aqui o seu codigo que converte em String e formata o conteudo do array
        String arrayString = "\"";
        
        for (int i = 0; i < this.array.length; i++) {
        	if ( i != this.array.length-1) {
            	arrayString += this.array[i] +", ";	
        	} else {
        		arrayString += this.array[i] + "\"";
        	}
        }
        
        return arrayString;
    }
    
    public void imprimirMaiorMenor() {
    	int maior = 0;
    	int menor = this.array[0];
    	
    	for (int i = 0; i < this.array.length; i++) {
    		if (this.array[i] > maior) {
    			maior = this.array[i];
    		} else if (this.array[i] < menor) {
    			menor = this.array[i];
    		}
    	}
    	
    	JOptionPane.showMessageDialog(null, "Maior elemento: "+maior+"\nMenor elemento: "+menor);
    }
    
    public int maioresDez() {
    	int quant = 0;
    	
    	for (int i = 0; i < this.array.length; i++) {
    		if (this.array[i] > 10) {
    			quant++;
    		}
    	}
    	
    	return quant;
    }
    
    public void soma() {
    	int soma = 0;
    	
    	for (int i = 0; i < this.array.length; i++) {
    		soma += this.array[i];
    	}
    	JOptionPane.showMessageDialog(null, "Soma dos elementos do vetor: "+soma);
    }
    
}