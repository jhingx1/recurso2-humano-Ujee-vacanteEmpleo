package com.test;

import com.domain.Rectangulo;
import com.domain.Triangulo;

public class Principal {

	public static void main(String[] args) {
		
		Rectangulo objRec = new Rectangulo();
		objRec.mostrarDatos();
		objRec.setAlto(10);
		objRec.setAncho(20);
		objRec.mostrarDatos();
		System.out.println("El area es " + objRec.getArea());
		
		
		System.out.println("---------------------------");
		
		Triangulo objTriangulo = new Triangulo();
		objTriangulo.mostrarDatos();

	}

}
