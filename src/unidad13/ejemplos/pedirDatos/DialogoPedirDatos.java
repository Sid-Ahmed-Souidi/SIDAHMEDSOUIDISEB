package unidad13.ejemplos.pedirDatos;

import javax.swing.JOptionPane;

public class DialogoPedirDatos {

	public static void main(String[] args) {
	
		String nombre = JOptionPane.showInputDialog("Dame el nombre");
		String apellido = JOptionPane.showInputDialog("Dame el apellido");
		String ciudad = JOptionPane.showInputDialog("Dame el nombre");

		
		String mensaje = String.format("Bienvenido,%s %s "
				+ "estas en la ciudad %s", nombre , apellido , ciudad);
		
		JOptionPane.showMessageDialog(null, mensaje);
		
	}

}
