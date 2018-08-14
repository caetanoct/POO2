import javax.swing.JOptionPane;


public class Primo {
	public static boolean ehPrimo(int num){
		if(num == 1){
			return true;
			
		}
		for(int i = 2 ; i < num ; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
		if(Primo.ehPrimo(num) == true){
			System.out.println("é primo");
		}
		else System.out.println("Não é primo");
	}
}
