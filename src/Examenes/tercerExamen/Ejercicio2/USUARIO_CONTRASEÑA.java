package Examenes.tercerExamen.Ejercicio2;

public enum USUARIO_CONTRASEÑA {
	
	user("Sid", "12345"),
	user1("Sara", "6789"),
	user2("Tigma", "1011");



    private final String usuario;
    private final String contraseña;

    USUARIO_CONTRASEÑA(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    

    public String getUsername() {
        return usuario;
    }

    public String getPassword() {
        return contraseña;
    }	

}
