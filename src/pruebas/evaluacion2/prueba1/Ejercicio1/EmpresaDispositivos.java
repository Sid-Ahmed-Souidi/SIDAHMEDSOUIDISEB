package pruebas.evaluacion2.prueba1.Ejercicio1;


//subString
public class EmpresaDispositivos {
	
	
	static int dell = 0;
	static int cisco = 0;
	static int HP = 0;
	static String mac [] = {"00-0C-29-DC-8E-F2",
            "00-14-22-D8-CF-DB-C5",
            "00-0B-0E-32-0E-81-72",
            "00-14-22-1C-BE-35-AE",
            "00-14-22-7F-D4-31-EA",
            "00-0B-0E-31-EA-4B-20",
            "00-14-22-15-D3-97-2C",
            "00-0C-29-BF-09-53-33",
            "00-0C-29-0A-FB-14-D7",
            "00-0C-29-49-C2-94-F9",
            "00-0B-0E-41-EA-BE-64",
            "00-14-22-8F-0F-14-BE",
            "00-14-22-10-83-A5-61",
            "00-0B-0E-D8-8D-65-5B",
            "00-0C-29-60-B5-FF-9E",
            "00-0C-29-A4-75-CC-12",
            "00-14-22-3E-0A-FF-FF",
            "00-14-22-48-E0-CE-08",
            "00-0B-0E-ED-BA-BE-0B",
            "00-0B-0E-7A-97-1C-D5",
            "00-0B-0E-90-E6-81-70",
            "00-14-22-09-24-80-07",
            "00-0C-29-42-FA-03-45",
            "00-0B-0E-32-E9-4D-19",
            "00-14-22-7D-6B-BE-5F",
            "00-0C-29-63-8A-50-BD",
            "00-14-22-D1-CE-6A-7C",
            "00-14-22-3C-CF-B4-17",
            "00-14-22-5A-BD-CB-57",
            "00-14-22-B2-D2-40-65"};
	

	public static void main(String[] args) {
		
		System.out.println("PROCESO IVP6");
		identificarMac(mac);
		System.out.print("Numero de dispositivos del fabricante Dell : ");
		System.out.println(dell);
		System.out.print("Numero de dispositivos del fabricante Cisco : ");
		System.out.println(cisco);
		System.out.print("Numero de dispositivos del fabricante HP : ");
		System.out.println(HP);
  
		

	}
	public static void identificarMac(String [] array) {
		String ciclos[] = null;
		for(int i =0 ; i< mac.length; i++) {
			ciclos = mac[i].split(",");
			for(int j = 0 ; j < ciclos.length ; j++) {
			//System.out.println(ciclos[j]);
			identificarFabricante(ciclos[j]);
			procesoEUI64(ciclos[j]);
			
			}
		}
		
	}
	
	// nos queda realizar el proceso de ipv6 
	private static void procesoEUI64(String string) {
		
	String cadena = string.substring(0 ,8);
	String cadena2 = "-FF-FE-"+(string.substring(10 ,17));

	String resultado = cadena.concat(cadena2);
	
	System.out.println(resultado);
	
	}
	private static void identificarFabricante(String string) {
		
		
		
		String cadena = string.substring(0 ,8);
		//System.out.println(cadena);
		if(cadena.equals("00-0C-29")) {
			dell ++;
			
		}if(cadena.equals("00-0B-0E")) {
			cisco ++;
			
		}if(cadena.equals("00-14-22")) {
			HP ++;
			
		}
	}
	
	}

	


