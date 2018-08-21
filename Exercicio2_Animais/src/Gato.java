
public class Gato extends Mamifero {

	public Gato() {
		this.setTamanhoPasso(2);
		this.setVolumeSom(2);
	}

	public String miar() {
		return "Gato" + this.produzirSom() + "MIAU";
	}
}
