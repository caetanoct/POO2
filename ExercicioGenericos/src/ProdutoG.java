
public class ProdutoG<T> {
	private T codigo;
	private String descricao;
	private double preco;

	public ProdutoG(T cod, String descricao, double preco) {
		this.codigo = cod;
		this.descricao = descricao;
		this.preco = preco;
	}

	public T getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public String toString() {
		return "ProdutoG{" + "código = " + codigo + ", descricao = " + descricao + ", preco = " + preco + "}";
	}
}
