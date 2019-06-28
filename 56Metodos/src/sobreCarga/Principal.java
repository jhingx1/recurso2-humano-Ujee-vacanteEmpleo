package sobreCarga;

public class Principal {

	public static void main(String[] args) {
		
		Alumno alumnoUno = new Alumno();
		alumnoUno.muestraInformacionAlumno();
		
		Alumno alumnoDos = new Alumno("Jean");
		alumnoDos.muestraInformacionAlumno();

		//Cambio al alumno a
		alumnoUno.setDatosAlumno("Ana");		
		alumnoUno.setDatosAlumno(95);
		alumnoUno.muestraInformacionAlumno();
	}

}
