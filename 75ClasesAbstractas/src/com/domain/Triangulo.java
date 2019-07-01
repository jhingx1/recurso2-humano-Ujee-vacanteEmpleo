package com.domain;

public class Triangulo extends Figura{
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(int ancho,int alto) {
		super(ancho,alto); //constructor con dos parametros
	}

	@Override
	public float getArea() {
		
		return (this.getAlto()*this.getAncho())/2;
	}

}
