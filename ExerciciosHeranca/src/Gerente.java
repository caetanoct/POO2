import java.util.ArrayList;

public class Gerente extends Funcionario {

	private int numerosDeEmpregadosGerenciados;
	private String senha;
	ArrayList<Empregado> empregados;

	public Gerente() {

	}

	public Gerente(String nome, String dataDeNascimento, String senha) {
		super(nome, dataDeNascimento);
		this.senha = senha;
		numerosDeEmpregadosGerenciados = 0;
		empregados = new ArrayList<Empregado>();
	}

	public void adicionarEmpregado(Empregado empregado) {
		numerosDeEmpregadosGerenciados++;
		empregados.add(empregado);
	}
	
	public void relatorioEmpregados() {
		for (int i = 0; i < numerosDeEmpregadosGerenciados; i++) {
			empregados.get(i).exibeDados();
		}
	}

	public int getNumerosDeEmpregadosGerenciados() {
		return numerosDeEmpregadosGerenciados;
	}

	public void setNumerosDeEmpregadosGerenciados(int numerosDeEmpregadosGerenciados) {
		this.numerosDeEmpregadosGerenciados = numerosDeEmpregadosGerenciados;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Empregado> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(ArrayList<Empregado> empregados) {
		this.empregados = empregados;
	}

}
