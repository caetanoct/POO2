
public abstract class Mamifero extends Animal {

	private int volumeSom;

	public Mamifero() {

	}

	public Mamifero(int tamanhoPasso, int volumeSom) {
		super(tamanhoPasso);
		this.volumeSom = volumeSom;
	}

	public String produzirSom() {
		return ": Produz som: " + volumeSom + ", Som: ";
	}

	public int getVolumeSom() {
		return volumeSom;
	}

	public void setVolumeSom(int volumeSom) {
		this.volumeSom = volumeSom;
	}

}
