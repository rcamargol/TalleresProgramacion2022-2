package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	public View() {
		
	}
	
	public int leerDato(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}
	public void devolverInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
