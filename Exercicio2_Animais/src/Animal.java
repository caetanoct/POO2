
public abstract class Animal {
	private int tamanhoPasso;

	public Animal() {

	}

	public Animal(int tamanhoPasso) {
		this.tamanhoPasso = tamanhoPasso;
	}

	public String mover() {
		return "Animal: Deslocou " + tamanhoPasso;
	}

	public String produzirSom() {
		return ": Produz Som: ";
	}

	public int getTamanhoPasso() {
		return tamanhoPasso;
	}

	public void setTamanhoPasso(int tamanhoPasso) {
		this.tamanhoPasso = tamanhoPasso;
	}
}
