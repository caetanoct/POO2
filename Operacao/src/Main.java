import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Operacao operacao = new Operacao();
        Scanner input = new Scanner(System.in);
        
        operacao.soma();
        
        double n1,n2;
        System.out.println("Digite o primeiro numero inteiro");
        n1 = input.nextInt();  
        System.out.println("Digite o segundo numero inteiro");
        n2 = input.nextInt(); 
        operacao.calculaMedia(n1,n2);
        
        int resposta;
        resposta = operacao.multiplicacao();
        System.out.println("O produto dos numeros e " + resposta);
        
        double num1,num2, resposta2;
        System.out.println("Digite o dividendo");
        num1 = input.nextInt();  
        System.out.println("Digite o divisor");
        num2 = input.nextInt(); 
        resposta2 = operacao.divisao(num1, num2);
        System.out.println("O resultado da divisao dos numeros e " + resposta2);
        
        operacao.subtracao();
        
        System.out.println("Digite o primeiro valor da media ponderada");
        n1 = input.nextDouble();
        System.out.println("Digite o peso do primeiro valor da media ponderada");
        double p1 = input.nextDouble();
        System.out.println("Digite o segundo valor da media ponderada");
        n2 = input.nextDouble();
        System.out.println("Digite o peso do segundo valor da media ponderada");
        double p2 = input.nextDouble();
        resposta2 = operacao.mediaPonderada(n1, p1, n2, p2);
        System.out.println("Media ponderada: "+resposta2);
        
        System.out.println("Digite o numero para o fatorial");
        int nFat = input.nextInt();
        operacao.fatorial(nFat);
    }
    
}