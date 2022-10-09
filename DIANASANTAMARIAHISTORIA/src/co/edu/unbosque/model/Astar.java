package co.edu.unbosque.model;

public class Astar extends Heroe {

	public Astar() {
		super.velocidadDeVuelo = 20;
		super.estatura = 3;
	}

	public String luchar() {
		return "Lucha contra los enemigos de Cynux X1.";
	}

	public String defender() {
		return "Defiende al planeta y sus habitantes.";
	}

	public String volar() {
		return "Vuela por los aires.";
	}

	public String crearFuego() {
		return "Crea fuego con sus manos.";
	}

	public String detenerElTiempo() {
		return "Puede detener el tiempo.";
	}

	public String habitarPlaneta() {
		return "Habita al norte del planeta Cynux X1.";
	}

	public String sentir() {
		return "Puede sentirse a si mismo(a) y a seres de otros mundos.";
	}

	public float getVelocidadDeVuelo() {
		return velocidadDeVuelo;
	}

	public void setVelocidadDeVuelo(float velocidadDeVuelo) {
		this.velocidadDeVuelo = 20;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = 3;
	}
}
