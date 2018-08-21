
public class Instanciacoes {
	public static void main(String[] args) {

		Codigo<String, Integer> codigo = new Codigo<String, Integer>("IMP", 34);

		ProdutoG<Codigo<String, Integer>> produtoG = new ProdutoG<Codigo<String, Integer>>(codigo, "descricao", 102.3);

		ValorM valorM = new ValorM(123.4);

		ProdutoG2<Codigo<String, Integer>, Double, String> produtoG2 = new ProdutoG2<Codigo<String, Integer>, Double, String>(
				codigo, "Descricao", 123.4, "Peso");
	}
}
