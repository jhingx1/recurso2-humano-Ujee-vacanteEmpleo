package com.test;

import java.util.Scanner;

import com.clases.Alumno;

public class Principal {

	public static void main(String[] args) {
		
		Alumno  objAl = new Alumno();
		solicitaInformacion(objAl);
		muestraInformacion(objAl);

	}
	
	public static void muestraInformacion(Alumno alumno){
		System.out.println();
		System.out.println("Nombre : " + alumno.getNombre());
		System.out.println("Edad : " + alumno.getEdad());
		System.out.println("Calificacion : " + alumno.getCalificacion());
		System.out.println("Cuota Semetrarl" + Alumno.getCoutaSemestral());
	}
	
	public static void solicitaInformacion(Alumno alumno){
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Nombre Alumno : ");
		String nombre = entrada.nextLine();
		alumno.setNombre(nombre);
		
		System.out.print("Edad de " + alumno.getNombre() +" : ");
		int edad = entrada.nextInt();
		alumno.setEdad(edad);
		
		System.out.print("Calificacion  de " + alumno.getNombre() +" : ");
		double cal = entrada.nextDouble();
		alumno.setCalificacion(cal);
		
	}

}
