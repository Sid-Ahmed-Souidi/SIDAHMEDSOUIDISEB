package unidad12.ejemplos.conexion.salidaEntrada;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabla extends JFrame{
	
	private JTable tabla;
	private JScrollPane panel;
	
	public Tabla(String[][] datos ,String[] cabezera , String titulo) {
		pintarTabla(datos,cabezera);
		setTitle(titulo);
		setSize(500, 300);
	}
	
	private void pintarTabla(String[][] datos ,String[] cabecera) {
		

		
		tabla = new JTable(datos, cabecera);
		panel = new JScrollPane(tabla);

		getContentPane().add(panel,BorderLayout.CENTER);
	}	
		
		
		
	}


