package metodosEstaticosDinamicos;

public class Calificaciones {

	public double totalCalificaiones = 0.0;
	
	public double sumaCalificacion(Alumno a){
		
		totalCalificaiones = totalCalificaiones + a.calificacion;
		
		return totalCalificaiones; 
	}
	
}
