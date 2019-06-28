package pasoParametros;

public class Alumno {
	
	int calificacion;
	String nombre;
	
	//Constructor
	public Alumno(int cal,String nomb){
		calificacion = cal;
		nombre = nomb;
	}

	public void muestraInformacionAlumno(){
		System.out.print("Nombre : " + nombre);
		System.out.println("Calificacion : " + calificacion);
	}
	
}
