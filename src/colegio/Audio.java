package colegio;

public class Audio {
	//Facilitacion de prestamos
			int id;
			String titulo ;
			String 	Autor;
			String 	Lugar;
			String Duracion;
			public Audio() {
				super();
			}
			public Audio(int id, String titulo, String autor, String lugar, String duracion) {
				super();
				this.id = id;
				this.titulo = titulo;
				Autor = autor;
				Lugar = lugar;
				Duracion = duracion;
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
				return Autor;
			}
			public void setAutor(String autor) {
				Autor = autor;
			}
			public String getLugar() {
				return Lugar;
			}
			public void setLugar(String lugar) {
				Lugar = lugar;
			}
			public String getDuracion() {
				return Duracion;
			}
			public void setDuracion(String duracion) {
				Duracion = duracion;
			}
			@Override
			public String toString() {
				return "Audio [id=" + id + ", titulo=" + titulo + ", Autor=" + Autor + ", Lugar=" + Lugar
						+ ", Duracion=" + Duracion + "]";
			}
			
}

