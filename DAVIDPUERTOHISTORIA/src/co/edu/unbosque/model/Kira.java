package co.edu.unbosque.model;

public class Kira extends Heroe {
	
	public Kira() {
		super.estatura = 3;
		super.colorOjos = "Azul";
	}

	@Override
	public String volar() {
		return "Puedo volar por los aires";
	}

	@Override
	public String crearFuego() {
		return "Puedo crear fuego con mis manos";
	}

	@Override
	public String detenerTiempo() {
		return "Puedo detener el tiempo";
	}
	
	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
}
