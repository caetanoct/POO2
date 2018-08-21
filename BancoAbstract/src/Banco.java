import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Banco {
	ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void inserirConta(Conta conta) {
		contas.add(conta);
		JOptionPane.showMessageDialog(null, "Conta inserida com sucesso");
	}
	
	public boolean removerConta(Conta conta) {
		return contas.remove(conta);
	}
	
	public Conta procurarConta(String numero) {
		Conta achada = null;
		
		for (Conta conta: contas) {
			if (contas.contains(conta)) {
				achada = conta;
			}
		}
		return achada;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
}
