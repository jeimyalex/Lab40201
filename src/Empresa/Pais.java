package Empresa;

public class Pais {
	int id;
	String 	Nombre;
	String 	Descripcion;
	public Pais() {
		super();
	}
	public Pais(int id, String nombre, String descripcion) {
		super();
		this.id = id;
		Nombre = nombre;
		Descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Pais [id=" + id + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + "]";
	}
	

}
