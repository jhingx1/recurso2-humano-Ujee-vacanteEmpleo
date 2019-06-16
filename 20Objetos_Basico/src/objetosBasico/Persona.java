package objetosBasico;

public class Persona {

		private String nombre;
		private String apellido;
		private int edad;
		private String genero;
		
		public Persona(String nombreP, String apellidoP, int edadP, String generoP) {			
			nombre = nombreP;
			apellido = apellidoP;
			edad = edadP;
			genero = generoP;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}
		
		
}
