package com.test;
import com.domain.*;
public class Principal {

	public static void main(String[] args) {
	
		Animal oso = new Animal();
		oso.setRaza("Oso-Pardo");;
		oso.cazar();
		oso.caminar();
		oso.dormir();
		
		System.out.println("-------------------------------");
		
		Persona persona =new Persona();
		persona.setNumControl("10101010101010");
		persona.pensar();
		persona.bailar("Juan");
		persona.caminar();
		
		System.out.println("-------------------------------");
		
		Hombre juan = new Hombre();
		juan.setNombre("Juan");
		juan.setNumControl("101001010101");
		juan.trabajar("koko", "101090190");
		
	}

}
