package com.domain;

public class Rectangulo extends Figura{
	
	/* No es necesario llamar al construcor vacion,la clase ya lo esta llamando
	Si no estubiera se tendria que llamar al otro constructor
	public Rectangulo() {
		super();
	}
	*/
	
	@Override
	public float getArea() {		
		//float area = this.getAlto()*this.getAncho();		
		return this.getAlto()*this.getAncho();
	}

}
