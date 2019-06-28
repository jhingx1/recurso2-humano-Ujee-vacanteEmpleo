package metodosEstaticosDinamicos;

public class Alumno {
	
	/*
	
	 Atributos y metodos pertenecientes a la clase mas no al objeto.
	 Se invoca sin que exista la instancia
	 Existe el comcepto de estatico(De clase) y dinamico(Objetos)
	 El contexto dinamico puede acceder al estatico y el estatico no puede acceder al dinamico
	 -> De lo anterir en primera instancia se crea lo estatico y lo dinamico se crear cuando 
	 se ejecutar o se crear el objeto por esta razon el estatico no puede acceder a los dinamico
	 
	*/
	
	int calificacion;
	String nombre;
	
	static double cuotaSemestral;//atributo de la clase
	
	//Constructor
	public Alumno(int cal,String nomb){
		calificacion = cal;
		nombre = nomb;
	}

	public void muestraInformacionAlumno(){
		System.out.print("Nombre : " + nombre);
		System.out.println("Calificacion : " + calificacion);
		//System.out.println("La cuota semestral es : " + cuotaSemestral);
		Alumno.muestraCuotasSemestral();
	}
	
	public static void muestraCuotasSemestral(){
		System.out.println("La cuota semestral es : " + cuotaSemestral);
	}
	
}
