
public class Codigo<T, U> {
	private T setor;
	private U codSequencial;

	public Codigo(T setor, U codSequencial) {
		this.setor = setor;
		this.codSequencial = codSequencial;
	}

	public T getSetor() {
		return setor;
	}

	public U getCodSequencial() {
		return codSequencial;
	}

	public void setCodSequencial(U codSequencial) {
		this.codSequencial = codSequencial;
	}

	public void setSetor(T setor) {
		this.setor = setor;
	}
}
