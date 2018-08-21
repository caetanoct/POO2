
public abstract class Ave extends Animal {
	private int alturaVoo;

	public Ave(int tamanhoPasso, int alturaVoo) {
		super(tamanhoPasso);
		this.alturaVoo = alturaVoo;
	}
	
	public Ave() {
		
	}

	public String voar() {
		return "Ave" + this.mover() + " Voando a "+alturaVoo+"m";
	}

	public int getAlturaVoo() {
		return alturaVoo;
	}

	public void setAlturaVoo(int alturaVoo) {
		this.alturaVoo = alturaVoo;
	}

}
