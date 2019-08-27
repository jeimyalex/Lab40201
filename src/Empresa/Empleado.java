package Empresa;

public class Empleado {
	int id;
	String 	Nombre;
	String 	Apellido;
	String DNI;
	String Edad;
	String Fingreso;
	public Empleado() {
		super();
	}
	public Empleado(int id, String nombre, String apellido, String dNI, String edad, String fingreso) {
		super();
		this.id = id;
		Nombre = nombre;
		Apellido = apellido;
		DNI = dNI;
		Edad = edad;
		Fingreso = fingreso;
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
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
	public String getFingreso() {
		return Fingreso;
	}
	public void setFingreso(String fingreso) {
		Fingreso = fingreso;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", DNI=" + DNI + ", Edad="
				+ Edad + ", Fingreso=" + Fingreso + "]";
	}
	

}
