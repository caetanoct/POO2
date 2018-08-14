import java.util.ArrayList;
import java.util.Scanner;


public class Aluno {
	private int nota1;
	private int nota2;
	private int aulasAssistidas;
	public Aluno(){
		
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getAulasAssistidas() {
		return aulasAssistidas;
	}
	public void setAulasAssistidas(int aulasAssistidas) {
		this.aulasAssistidas = aulasAssistidas;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Aluno> arrayAlunos = new ArrayList<Aluno>();
		System.out.println("Digite o tamanho da turma: ");
		int tamanho = in.nextInt();
		//Cadastrar alunos
		for(int i = 0 ; i < tamanho ; i++){
			Aluno novoAluno = new Aluno();
			System.out.println("Digite a nota 1 do aluno "+i);
			novoAluno.nota1 = in.nextInt();
			System.out.println("Digite a nota 2 do aluno "+i);
			novoAluno.nota2 = in.nextInt();
			System.out.println("Digite o número de aulas assistidas:");
			novoAluno.aulasAssistidas = in.nextInt();
			arrayAlunos.add(novoAluno);
		}
		//Calcular e mostrar notas de todos alunos, mostrar se foi aprovado ou reprovado
		for(int i = 0 ; i < arrayAlunos.size() ; i++){
			double media = (arrayAlunos.get(i).getNota1() + arrayAlunos.get(i).getNota2())/2;
			System.out.println("Média do aluno "+i+" :");
			System.out.println(media);
			double frequencia = arrayAlunos.get(i).getAulasAssistidas()/18;
			System.out.println("Frequencia do aluno "+i+" :");
			System.out.println(frequencia);
			if(frequencia >= 0.75){
				if(media >= 6){
					System.out.println("Aprovado");
				}
				else{
					System.out.println("Reprovado");
				}
			}
			else System.out.println("Reprovado por frequencia");
		}
		
	}
}
