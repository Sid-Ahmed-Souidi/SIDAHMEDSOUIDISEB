package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	
	private int ide ;
     private List<Paquete> listaPaquete = new ArrayList<Paquete>();
     
     
     
	public int getIde() {
		return ide;
	}
	public void setIde(int ide) {
		this.ide = ide;
	}
	public List<Paquete> getListaPaquete() {
		return listaPaquete;
	}
	public void setListaPaquete(List<Paquete> listaPaquete) {
		this.listaPaquete = listaPaquete;
	}
	

     
     
     
}
