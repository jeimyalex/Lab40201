package Empresa;

public class Empresario {
	int id;
	String Codigo ;
	String 	Nombre;
	String 	Rsocial;
	String nruc;
	String Topera;
	String Pais;
	public Empresario() {
		super();
	}
	public Empresario(int id, String codigo, String nombre, String rsocial, String nruc, String topera, String pais) {
		super();
		this.id = id;
		Codigo = codigo;
		Nombre = nombre;
		Rsocial = rsocial;
		this.nruc = nruc;
		Topera = topera;
		Pais = pais;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getRsocial() {
		return Rsocial;
	}
	public void setRsocial(String rsocial) {
		Rsocial = rsocial;
	}
	public String getNruc() {
		return nruc;
	}
	public void setNruc(String nruc) {
		this.nruc = nruc;
	}
	public String getTopera() {
		return Topera;
	}
	public void setTopera(String topera) {
		Topera = topera;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	@Override
	public String toString() {
		return "Empresario [id=" + id + ", Codigo=" + Codigo + ", Nombre=" + Nombre + ", Rsocial=" + Rsocial + ", nruc="
				+ nruc + ", Topera=" + Topera + ", Pais=" + Pais + "]";
	}
	
}
