package colegio;

public class Cinta {
	//Facilitacion de prestamos
		int id;
		String titulo ;
		String Director;
		String 	Actores;
		String Duracion;
		public Cinta() {
			super();
		}
		public Cinta(int id, String titulo, String director, String actores, String duracion) {
			super();
			this.id = id;
			this.titulo = titulo;
			Director = director;
			Actores = actores;
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
		public String getDirector() {
			return Director;
		}
		public void setDirector(String director) {
			Director = director;
		}
		public String getActores() {
			return Actores;
		}
		public void setActores(String actores) {
			Actores = actores;
		}
		public String getDuracion() {
			return Duracion;
		}
		public void setDuracion(String duracion) {
			Duracion = duracion;
		}
		@Override
		public String toString() {
			return "Cinta [id=" + id + ", titulo=" + titulo + ", Director=" + Director + ", Actores=" + Actores
					+ ", Duracion=" + Duracion + "]";
		}
		

}
