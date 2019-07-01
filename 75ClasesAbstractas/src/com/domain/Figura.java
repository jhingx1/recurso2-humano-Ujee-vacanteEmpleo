package com.domain;

//Clase abstracta
/*
Una clase abstracta no se puede instanciar, pero si se pueden heredar y las clases
hijas agregan la funcionalidad a los metodos abstractos.

Una clase abstracta pude contener metodos abstractos y no abstratos.
*/
public abstract class Figura {

	private int ancho,alto;
	
	//Creacion el constructor por defaul
	public Figura(){
		this.alto = 0;
		this.ancho = 0;
	}

	public Figura(int ancho,int alto){
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public void mostrarDatos(){
		System.out.println("El ancho capturado es : " + this.ancho);
		System.out.println("El alto capturado es : " + this.alto);
	} 
	
	public abstract float getArea();
	
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}	
	
}
