package com.domain;

public interface AccionesGlobales {
	public void caminar();
	public void comer();
	public void dormir();
}


/*
 
 Interfacez
Coleccion de metodos abstractos y propiedades constantes
Uso para la herencia multiple
Obliga a que ciertas clases utilicen los mismos metodos(nombres y parametros)
Establecer relaciones entre clases que no esten relacionadas.

La declaracion de los metodos de una interfaz siempre son publicoos abstrac(se puede omitir).


Notaciones-Diagrama
AccionesPersonas(interfaz) ----> Personas(Clase) : la clase persona implementa los metodos de la interfaz AccionesPersonas.
						La notacion es una linea punteada con cabeza de triangulo vacion que va desde
						la clase hacia la interfaz.
Persona(Clase)---->Hombre(Clase) : Herencia. 
					Diagrama : es una linea negra con cabeza de triangulo. La linea va desde la clase hija
					hacia la clase padre.
						

 */