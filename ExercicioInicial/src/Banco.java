import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Banco {
	public static void main(String[] args) {
		ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();

		int opc;
		do {
			opc = Integer.parseInt(
					JOptionPane.showInputDialog("1- Criar conta\n2- Excluir conta\n3- Acessar conta\n4- Sair"));
			switch (opc) {
			case 1:
				String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
				String cpfCliente = JOptionPane.showInputDialog("Digite o CPF do cliente");
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
				boolean chequeEspecial;
				if (JOptionPane.showInputDialog("A conta tem cheque especial(Sim/Não)").toLowerCase()
						.charAt(0) == 's') {
					chequeEspecial = true;
				} else {
					chequeEspecial = false;
				}
				double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta"));
				ContaCorrente conta = new ContaCorrente(nomeCliente, cpfCliente, numero, chequeEspecial, limite);
				contas.add(conta);
				break;
			case 2:
				String cpfProcurado = JOptionPane.showInputDialog("Digite o cpf do dono da conta");
				for (ContaCorrente contacorrente : contas) {
					if (cpfProcurado.equals(contacorrente.getCpfCliente())) {
						contas.remove(contacorrente);
					}
				}
				break;
			case 3:
				cpfProcurado = JOptionPane.showInputDialog("Digite o cpf do dono da conta");
				int counter = 0;
				for (ContaCorrente contacorrente : contas) {
					if (!cpfProcurado.equals(contacorrente.getCpfCliente())) {
						counter++;
					} else {
						int opc1;

						do {
							opc1 = Integer.parseInt(
									JOptionPane.showInputDialog("1- Fazer saque\n2- Fazer depósito\n3- Emitir saldo\n"
											+ "4- Emitir extrato\n5- Fazer transferência\n6- Sair da conta"));

							switch (opc1) {
							case 1:
								double valor = Double
										.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
								if (contacorrente.sacar(valor)) {
									JOptionPane.showMessageDialog(null, "Valor sacado");
								} else {
									JOptionPane.showMessageDialog(null, "Valor inválido");
								}
								break;
							case 2:
								valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
								contacorrente.depositar(valor);
								break;
							case 3:
								JOptionPane.showMessageDialog(null, "Saldo: " + contacorrente.getSaldo());
								break;
							case 4:
								String extrato = "";
								for (Movimentacao movimentacao : contacorrente.getMovimentacoes()) {
									extrato = extrato + movimentacao.printMovimentacao() + "\n";
								}
								JOptionPane.showMessageDialog(null, extrato);
								break;
							case 5:
								String cpf2 = JOptionPane.showInputDialog("Digite o cpf do dono da outra conta");
								int counter2 = 0;
								for (ContaCorrente contacorrente2 : contas) {
									if (!contacorrente2.getCpfCliente().equals(cpf2)) {
										counter2++;
									} else {
										valor = Double.parseDouble(
												JOptionPane.showInputDialog("Digite o valor da transferência"));
										if (contacorrente.sacar(valor)) {
											contacorrente2.depositar(valor);
											JOptionPane.showMessageDialog(null, "Transferência feita com sucesso");
										} else {
											JOptionPane.showMessageDialog(null, "Transferência falhou");
										}
									}
								}
								if (counter2 == contas.size()) {
									JOptionPane.showMessageDialog(null, "CPF inválido");
								}
							}

						} while (opc1 != 6);

					}
				}
				if (counter == contas.size()) {
					JOptionPane.showMessageDialog(null, "CPF Inválido");
				}
			}
		} while (opc != 4);
	}
}
