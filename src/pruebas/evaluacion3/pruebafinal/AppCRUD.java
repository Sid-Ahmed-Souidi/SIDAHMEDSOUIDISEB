package pruebas.evaluacion3.pruebafinal;

import java.util.List;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;
import org.neodatis.odb.core.query.criteria.Where;


public class AppCRUD {

    private static final String DB_PATH = "pagos.db";

    
    //de la lista de certificados cuyo tipo es de resindencial e insertamos en la BOO
    public static ODB insertarPagosBOO(Pago pago) {
         ODB odb = ODBFactory.open(DB_PATH);
  
            odb.store(pago);
		
    	odb.commit();
		return odb;

    }
   
	
	public static void leerPagosBOO(ODB odb) {
        Objects<Pago> pagos = odb.getObjects(Pago.class);
        while (pagos.hasNext()) {
        	Pago pago = pagos.next();
            System.out.println("Pagos en BOO :"+pago);

        }
        

        
	}
	
	   // Método para vaciar la base de datos
    public void vaciarBaseDeDatos() {
        ODB odb = ODBFactory.open(DB_PATH);
        Objects<Pago> pagos = odb.getObjects(new CriteriaQuery(Pago.class));
        while (pagos.hasNext()) {
            odb.delete(pagos.next());
        }
        odb.commit();
        odb.close();
    }
}

