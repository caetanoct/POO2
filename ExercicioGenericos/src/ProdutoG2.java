
public class ProdutoG2<T, U, S> {
	private T codigo;
	private String descricao;
	private U preco;
	private S peso;

	public ProdutoG2(T codigo, String descricao, U preco, S peso) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.peso = peso;
	}

	public String toString() {
		return "ProdutoG{" + "código = " + codigo + ", descricao = " + descricao + ", preco = " + preco + ", peso = "
				+ peso + "}";
	}

	public T getCodigo() {
		return codigo;
	}

	public void setCodigo(T codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public U getPreco() {
		return preco;
	}

	public void setPreco(U preco) {
		this.preco = preco;
	}
	
	public S getPeso() {
		return peso;
	}
	
	public void setPeso(S peso) {
		this.peso = peso;
	}

}
