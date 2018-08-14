import javax.swing.JOptionPane;


public class Alunos {
	
	public static double media(double n1, double n2){
		double soma = n1 + n2;
		return soma/2;
	}
	public static int Situacao(double media){
		System.out.println("Média: "+media);
		if(media >= 6){
			System.out.println("Aprovado");
			return 1;
			
		}
		else{
			if(media >= 3){
				System.out.println("Rec");
				return 2;
			}
			else{
				System.out.println("Reprovado");
				return 3;
			}
		}
	}
	
	public static void main(String[] args){
		int aprovados,rec,reprovados;
		aprovados = 0; rec = 0; reprovados = 0;
		double mediatotal = 0;
		for(int i = 0 ; i < 6 ; i++){
			
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1 do aluno("+(i+1)+")"));
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2 do aluno("+(i+1)+")"));
			double media = Alunos.media(n1, n2);
			
			mediatotal += media;
			System.out.println("Aluno "+(i+1)+":");
			int sit = Alunos.Situacao(media);
			if(sit == 1){
				aprovados++;
			}
			if(sit == 2){
				rec++;
			}
			if(sit == 3){
				reprovados++;
			}
		}
		System.out.println("Media da classe: "+mediatotal/6);
		System.out.println("Reprovados: "+reprovados);
		System.out.println("Aprovados: "+aprovados);
		System.out.println("Em rec: "+rec);
	}
}
