 
public class CamaroteSuperior extends Vip {
	
	private double adicionalSuperior;
	
	public CamaroteSuperior() {
		
	}
	
	public CamaroteSuperior(double valor, double adicional, double adicionalSuperior) {
		super(valor, adicional);
	}
	
	public double getValor() {
		return (super.getValor()+super.getAdicional()+adicionalSuperior);
	}
}
