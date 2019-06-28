package pasoParametros;

public class Principal {

	public static void main(String[] args) {
		
		Calificaciones califGrupo = new Calificaciones();
		
		Alumno a1 = new Alumno(10, "Jean");
		Alumno a2 = new Alumno(13, "Mari");
		Alumno a3 = new Alumno(15, "Ana");
		
		double sumaCalificaciones = califGrupo.sumaCalificacion(a1);
		a1.muestraInformacionAlumno();
		sumaCalificaciones = califGrupo.sumaCalificacion(a2);
		a2.muestraInformacionAlumno();
		sumaCalificaciones = califGrupo.sumaCalificacion(a3);
		a3.muestraInformacionAlumno();
		
		System.out.println("Suma de puntos de Grupo : " + sumaCalificaciones);
		double promedioGrupo = sumaCalificaciones/3;
		System.out.println("El promedio del grupo : " + promedioGrupo);
		
		
	}

}
