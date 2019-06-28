package metodosEstaticosDinamicos;

public class Principal {

	public static void main(String[] args) {
		
		Calificaciones califGrupo = new Calificaciones();
		
		Alumno a1 = new Alumno(10, "Jean");
		Alumno a2 = new Alumno(13, "Mari");
		Alumno a3 = new Alumno(15, "Ana");
		
		//Atributo estatico/de clase estamos moficando
		Alumno.cuotaSemestral=500;
		
		a1.muestraInformacionAlumno();
		a2.muestraInformacionAlumno();
		a3.muestraInformacionAlumno();
		//Alumno.muestraCuotasSemestral();
		
		//Atributo estatico/de clase estamos moficando
		Alumno.cuotaSemestral=800;//Afecta a todos los objetos de toda la clase
		System.out.println("--------------------------------------------");
		a1.muestraInformacionAlumno();
		a2.muestraInformacionAlumno();
		a3.muestraInformacionAlumno();
		//Alumno.muestraCuotasSemestral();
		
	}

}
