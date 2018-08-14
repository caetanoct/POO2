
public class Vip extends Ingresso {
	
	private double adicional;
	
	public Vip() {
		
	}
	
	public Vip(double valor, double adicional) {
		super(valor);
		this.adicional = adicional;
	}
	
	@Override
	public void imprimeValor() {
		System.out.println("Valor: "+(super.getValor() + adicional));
	}
	
	public double getAdicional() {
		return adicional;
	}
	
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public double getValorTotal() {
		return (super.getValor()+adicional);
	}
}
