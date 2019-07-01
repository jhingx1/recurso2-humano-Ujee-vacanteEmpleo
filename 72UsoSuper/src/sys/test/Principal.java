package sys.test;

import sys.domain.*;

public class Principal {

	public static void main(String[] args) {
		
		Persona.setNombreEscuela("ESC. Jorge Basadre");
		Alumno objAl = new Alumno(1000,"Jorge Rivas",35,"Masculino");
		objAl.muestraInfoAlumno();
		//objAl.setEdad(40);
		//objAl.muestraInfoAlumno();
		
		Director objDir = new Director("1111",50,"Digo Solis","Masculino");
		System.out.println("------------------");
		objDir.muestraInfoDirector();
	
		Intendente objInt = new Intendente("Edificios","Pedro Pelao");//Constructor con 2 args
		System.out.println("------------------");
		objInt.muestraInfoIntendente();
		
		Profesor objPro = new Profesor("FISICA","09090909","Edificio",20,"Jean","Macho");
		System.out.println("------------------");
		objPro.muestraInfoProfesor();
	
	}

}
