package sobreCarga;

public class Alumno {
	
	private double calificacion;
	private String nombre;
	private int edad;	
	static double cuotaSemestral;//atributo de la clase
	
	//Constructor
	public Alumno(){
		
	}
	
	public Alumno(String nom){
		nombre = nom;
	}
	
	public void setDatosAlumno(String nombre){
		//nombre=this.nombre;
		this.nombre = nombre; //this : para indicarle que es el atributo de la clase
	}
	
	//metodos sobrecargados
	
	public void setDatosAlumno(double cal){
		//nombre=this.nombre;
		this.calificacion = cal; //this : para indicarle que es el atributo de la clase
	}
	
	public void setDatosAlumno(String nom,int ed){
		nombre = nom;
		edad = ed;
	}
	
	public void setDatosAlumno(String nom,int ed,double cal){
		nombre = nom;
		edad = ed;
		this.calificacion = cal;
	}
	
	public static void muestraCuotasSemestral(){
		System.out.println("La cuota semestral es : " + cuotaSemestral);
	}	
	
	public void muestraInformacionAlumno(){
		System.out.print("Nombre : " + nombre);
		System.out.println("	Calificacion : " + calificacion);
		System.out.println("    Edad: " + edad);
		muestraCuotasSemestral();
	}
		
}
