package com.domain;

public class Animal implements AccionesGlobales{
	
	//Atributos propios
	private String raza;
	
	//Metodo propio
	public void cazar(){
		System.out.println("El animal de raza " + raza + " esta cazando (desde la clase animal)");
	}
	

	//Metodos globales
	@Override
	public void caminar() {
		System.out.println("El animal de raza" + raza);
		
	}

	@Override
	public void comer() {
		System.out.println("El animal de comiendo, raza : " + raza);
		
	}

	@Override
	public void dormir() {
		System.out.println("El animal de comiendo, desde la raza : " + raza);
		
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	

}
