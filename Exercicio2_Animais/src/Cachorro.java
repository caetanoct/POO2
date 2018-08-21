
public class Cachorro extends Mamifero {

	public Cachorro() {
		this.setVolumeSom(3);
		this.setTamanhoPasso(3);
	}
	
	public String latir() {
		return "Cachorro" + this.produzirSom() + "AU";
	}
}
