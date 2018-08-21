
public class Canarinho extends Ave {

	public Canarinho(int tamanhoPasso, int alturaVoo) {
		super(tamanhoPasso, alturaVoo);
	}
	
	public Canarinho() {
		this.setTamanhoPasso(-1);
	}

	public String cantar() {
		return "Canarinho" + this.produzirSom() + "Som: PIU";
	}
}
