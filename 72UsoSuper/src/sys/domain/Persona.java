package sys.domain;

public class Persona {
	
	/*
	super : para heredar los contructores de los padres.
Para su uso en el contructor debe de esta primero

	*/
	
	private static String nombreEscuela;
	private int edad;
	private String nombre;
	private String sexo;
	
	public Persona(int edad, String nombre, String sexo) {
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	public Persona(int edad, String nombre) {
		this(edad,nombre,"Sin definir");
	}
	
	public Persona(String nombre) {
		this(0,nombre,"Sin definir");//Valores por defecto
	}

	public static String getNombreEscuela() {
		return nombreEscuela;
	}
	public static void setNombreEscuela(String nombreEscuela) {
		Persona.nombreEscuela = nombreEscuela;
	}
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
