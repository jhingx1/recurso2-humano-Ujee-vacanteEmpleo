package com.test;

import com.domain.*;
public class Pruebas {

	public static void main(String[] args) {
		/*
		DirectorOverload objDir = new DirectorOverload();
		
		objDir.datos("Jean","Huaringa");
		objDir.sueldo(8,300);
		objDir.labores("Organizacion de labores");
		
		IntendenteOverload objIn = new IntendenteOverload();
		objIn.datos("Jean","Huaringa","Calle fatima");
		objIn.sueldo(8,300,50);
		objIn.labores("Organizacion de labores","8");
		
		ProfesorOverload objPr = new ProfesorOverload();
		objPr.datos("Jean Huaringa");		
		objPr.labores("Dictado de clases de ingles");
		objPr.sueldo(1000);
		*/
		
		DirectorOverride dir = new DirectorOverride();
		dir.datos("Juan Carlos");
		dir.labores("Organiza profesores");
		dir.sueldo(1300);
		
	}

}
