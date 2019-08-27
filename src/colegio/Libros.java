package colegio;

public class Libros {
	//Facilitacion de prestamos
	int id;
	String titulo ;
	String autor ;
	String npaginas ;
	String nisbn ;
	
	public Libros() {
		super();
	}
	public Libros(int id, String titulo, String autor, String npaginas, String nisbn) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.npaginas = npaginas;
		this.nisbn = nisbn;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getNpaginas() {
		return npaginas;
	}
	public void setNpaginas(String npaginas) {
		this.npaginas = npaginas;
	}
	public String getNisbn() {
		return nisbn;
	}
	public void setNisbn(String nisbn) {
		this.nisbn = nisbn;
	}
	@Override
	public String toString() {
		return "Libros [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", npaginas=" + npaginas + ", nisbn="
				+ nisbn + "]";
	}
	
	
	
	
	
}
