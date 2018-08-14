
public class CamaroteInferior extends Vip {

	private String localizacao;

	public CamaroteInferior() {

	}
	
	public CamaroteInferior(double valor, double adicional, String localizacao) {
		super(valor, adicional);
		this.localizacao = localizacao;
	}

	public void imprimeLocalizacao() {
		System.out.println("Localizacao: " + localizacao);
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}
