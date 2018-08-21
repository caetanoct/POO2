import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();

		int option;
		do {
			String[] menu = { "Criar conta", "Selecionar conta", "Remover conta", "Gerar relatório", "Finalizar" };
			option = JOptionPane.showOptionDialog(null, "Selecione a Operação", "Menu",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, menu, null);

			switch (option) {
			case 0:
				String[] contas = { "Conta corrente", "Conta poupança" };
				int opt2 = JOptionPane.showOptionDialog(null, "Selecione o tipo de conta", "Menu",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, contas, null);
				String numero = JOptionPane.showInputDialog("Digite o número da conta");
				switch (opt2) {
				case 0:
					double taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de operação"));
					banco.inserirConta(new ContaCorrente(numero, taxa));
					break;
				case 1:
					double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta"));
					banco.inserirConta(new ContaPoupanca(numero, limite));
					break;
				}
				break;

			case 1:
				numero = JOptionPane.showInputDialog("Digite o número da conta");
				if (banco.procurarConta(numero) == null) {
					JOptionPane.showMessageDialog(null, "Conta inexistente");
				} else {
					String[] menuConta = { "Depositar", "Sacar", "Transferir", "Gerar Relatório", "Retornar" };
					Conta conta = banco.procurarConta(numero);
					int optionConta;
					do {
						optionConta = JOptionPane.showOptionDialog(null, "Selecione a operação",
								"Conta " + conta.numero, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
								null, menuConta, null);
						switch (optionConta) {
						case 0:
							double valor = Double
									.parseDouble(JOptionPane.showInputDialog("Digite o valor para depositar"));
							conta.depositar(valor);
							break;
						case 1:
							valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para sacar"));
							conta.sacar(valor);
							break;
						case 2:
							valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para transferir"));
							numero = JOptionPane.showInputDialog("Digite o número da conta para transferir");
							Conta conta2 = banco.procurarConta(numero);
							if (banco.getContas().contains(conta2) && conta.saldo >= valor) {
								conta.transferir(valor, conta2);
							} else {
								JOptionPane.showMessageDialog(null, "Transferência inválida", "ERRO", JOptionPane.PLAIN_MESSAGE);
							}
							break;
						case 3:
							conta.mostrarDados();
						}

					} while (optionConta != 4);

				}
				break;

			case 2:
				numero = JOptionPane.showInputDialog("Digite o numero da conta");
				Conta conta = banco.procurarConta(numero);
				if (banco.getContas().contains(conta)) {
					banco.removerConta(conta);
					JOptionPane.showMessageDialog(null, "Conta removida com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Conta inexistente");
				}
				break;

			case 3:
				for (Conta acc : banco.getContas()) {
					acc.mostrarDados();
				}
				break;
			}
		} while (option != 4);
	}
}
