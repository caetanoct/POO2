import javax.swing.JFrame;

public class Calculator {
	public static void main(String[] args) {
		CalculatorGUI calculator = new CalculatorGUI();
		
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.setSize(225, 200);
		calculator.setVisible(true);
		
	}
}
