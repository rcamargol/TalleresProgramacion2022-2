package co.edu.unbosque.model;

public abstract class Airplane extends Vehicle implements Flyer {

	protected double tamaņoDeHelices;
	
	public Airplane() {
		super.gasolina = "";
		this.tamaņoDeHelices = 0.0;
	}
	
	@Override
	public String movilizarCargamento() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toFly() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toLand() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toTakeOff() {
		// TODO Auto-generated method stub
		return null;
	}
}
