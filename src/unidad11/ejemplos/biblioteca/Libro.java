package unidad11.ejemplos.biblioteca;

public class Libro {

	  private String titulo;
	    private String autor;
	    private int anoPublicacion;
	    private String editorial;
	    private String isbn;
	    private double precio;

	    
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public int getAnoPublicacion() {
			return anoPublicacion;
		}

		public void setAnoPublicacion(int anoPublicacion) {
			this.anoPublicacion = anoPublicacion;
		}

		public String getEditorial() {
			return editorial;
		}

		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		
		  @Override
		    public String toString() {
		        return "Libro{" +
		                "titulo='" + titulo + '\'' +
		                ", autor='" + autor + '\'' +
		                ", anoPublicacion=" + anoPublicacion +
		                ", editorial='" + editorial + '\'' +
		                ", isbn='" + isbn + '\'' +
		                ", precio=" + precio +
		                '}';
		    }
}
