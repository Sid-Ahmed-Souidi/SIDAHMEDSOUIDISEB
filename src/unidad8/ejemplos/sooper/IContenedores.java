package unidad8.ejemplos.sooper;

import unidad8.ejemplos.sooper.Contenedores.Producto;
import unidad8.ejemplos.sooper.Enum.TipoContenedor;

public interface IContenedores {

	
	String getReferencia();
	int getVolumen();
	int getVolumenDisponible();
	int getResistencia();
	Producto[] getProductos();
	TipoContenedor getTipo();
	boolean meter(Producto producto);
	boolean resiste(Producto producto);
	int getSuperficie();
	
	
	
}
