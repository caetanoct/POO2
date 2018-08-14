
public class Velho extends Imovel {
	private double desconto;

	public Velho(String endereco, double preco) {
		super(endereco, preco);
		desconto = super.getPreco() * 0.15;
	}

	public void imprimeDesconto() {
		System.out.println("Desconto: " + desconto + "\nPreço com o desconto: " + (super.getPreco() - desconto));
	}
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
