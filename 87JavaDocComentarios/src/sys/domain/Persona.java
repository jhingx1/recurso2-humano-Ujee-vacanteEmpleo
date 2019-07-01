package sys.domain;

public class Persona {
	
	/**
	 * Las clase Persona es la clase Base de la demas clases. Esta va a ser heredada en la demas clases
	 * @Jean Huaringa
	 * @version 1.0
	 */
	
	private static String nombreEscuela;
	private int edad;
	private String nombre;
	private String sexo;
	
	public static String getNombreEscuela() {
		return nombreEscuela;
	}
	
	/**
	 * Este metodo asigna un valor para el nombre de la escuela
	 * @param nombreEscuela
	 */
	public static void setNombreEscuela(String nombreEscuela) {
		Persona.nombreEscuela = nombreEscuela;
	}
	
	/**
	 * Estos son los metodos gets y seters de los atributos de la clase.
	 * @return
	 */
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
