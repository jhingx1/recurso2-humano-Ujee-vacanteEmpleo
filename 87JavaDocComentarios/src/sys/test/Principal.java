package sys.test;

import sys.domain.*;

public class Principal {

	public static void main(String[] args) {
		
		Persona.setNombreEscuela("ESC. Jorge Basadre");
		Alumno objAl = new Alumno(1000,"Jorge Rivas",35,"Masculino");
		objAl.muestraInfoAlumno();
		//objAl.setEdad(40);
		//objAl.muestraInfoAlumno();
		
		Director objDir = new Director("1111","Digo Solis",50,"Masculino");
		System.out.println("------------------");
		objDir.muestraInfoDirector();
	
		Intendente objInt = new Intendente("1111","Pedro Pelao",50,"Masculino");
		System.out.println("------------------");
		objInt.muestraInfoIntendente();
		
		Profesor objPro = new Profesor("0909090909","Fisica,","Rafael Porras",24,"Masculino");
		System.out.println("------------------");
		objPro.muestraInfoProfesor();
	
	}

}
