import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorGUI extends JFrame {
	
	private JTextArea text;
	
	private JPanel panel;
	
	private JButton[] buttons;
	
	private static final String[] names = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
	
	public CalculatorGUI() {
		super("Calculator");
		setLayout(new BorderLayout());
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		
		buttons = new JButton[16];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(names[i]);
			panel.add(buttons[i]);
		}
		
		text = new JTextArea("");
		add(text, BorderLayout.NORTH);
		
		add(panel);
	}
	
	private class buttonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			
			
		}
		
	}
}
