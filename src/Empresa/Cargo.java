package Empresa;

public class Cargo {
	int id;
	String 	Nombre;
	String 	SueldoB;
	public Cargo() {
		super();
	}
	public Cargo(int id, String nombre, String sueldoB) {
		super();
		this.id = id;
		Nombre = nombre;
		SueldoB = sueldoB;
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
	public String getSueldoB() {
		return SueldoB;
	}
	public void setSueldoB(String sueldoB) {
		SueldoB = sueldoB;
	}
	


}
