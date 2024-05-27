package certificados;

import java.util.List;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;
import org.neodatis.odb.core.query.criteria.Where;


public class AppCRUD {

    private static final String DB_PATH = "certificados.db";

    
    //de la lista de certificados cuyo tipo es de resindencial e insertamos en la BOO
    public static ODB insertarCertificadosBOO(List<Certificado> certificadosBOO2) {
         ODB odb = ODBFactory.open(DB_PATH);
    	for (Certificado certificado : certificadosBOO2) {
            odb.store(certificado);
		}
    	odb.commit();
		return odb;

    }
   
	
	public static void leerCertificadosBOO(ODB odb) {
        Objects<Certificado> certificados = odb.getObjects(Certificado.class);
        while (certificados.hasNext()) {
            Certificado certificado = certificados.next();
            System.out.println("Certificados tipo Residencial en BOO :"+certificado);

        }
        
        odb.close();

        
	}
	
	   // Método para vaciar la base de datos
    public void vaciarBaseDeDatos() {
        ODB odb = ODBFactory.open(DB_PATH);
        Objects<Certificado> certificados = odb.getObjects(new CriteriaQuery(Certificado.class));
        while (certificados.hasNext()) {
            odb.delete(certificados.next());
        }
        odb.commit();
        odb.close();
    }
}

