package co.edu.unbosque.model;

public abstract class Airplane extends Vehicle implements Flyer{
	
	protected String cabina;
	
	public abstract String iniciarMotor();
}
