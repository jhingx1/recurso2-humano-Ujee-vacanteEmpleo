package com.test;
import com.domain.*;
public class Principal {

	public static void main(String[] args) {
	
		Animal oso = new Animal();
		oso.setRaza("Oso-Pardo");	
		Persona persona =new Persona();		
		Hombre juan = new Hombre();
		Caballo caballo = new Caballo();
		
		queTipoDeObjetoEs(caballo);
		queTipoDeObjetoEs(juan);
	}
	
	public static void queTipoDeObjetoEs(Object objeto){
		
		if(objeto instanceof Caballo){
			System.out.println("Soy una instancia de caballo");
		}
		
		if(objeto instanceof Persona){
			System.out.println("Soy una instancia de Persona");
		}
		
		if(objeto instanceof Object){
			System.out.println("Soy una instancia de Objeto");
		}
		
	}
	

}
