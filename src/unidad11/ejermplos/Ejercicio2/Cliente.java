package unidad11.ejermplos.Ejercicio2;

public class Cliente {

	
	private String name;
	private String email;
	private int edad;
	private String phone;
	private String city;
	private boolean hasCreditCard;

	
	


	public Cliente(String name, String email, int edad, String phone, String city, boolean hasCreditCard) {
		super();
		this.name = name;
		this.email = email;
		this.edad = edad;
		this.phone = phone;
		this.city = city;
		this.hasCreditCard = hasCreditCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isHasCreditCard() {
		return hasCreditCard;
	}

	public void setHasCreditCard(boolean hasCreditCard) {
		this.hasCreditCard = hasCreditCard;
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + ", email=" + email + ", edad=" + edad + ", phone=" + phone + ", city=" + city
				+ ", hasCreditCard=" + hasCreditCard + "]";
	}
	
	
    
    

}
