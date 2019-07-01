package com.domain;

public class Persona implements AccionesGlobales,AccionesPersonas{
	
	private String numControl;
	
	//Metodos propios
	public void pensar(){
		System.out.println("La persona esta pensando con numero control" + numControl);
	}

	//Interface Accesiones Personas
	@Override
	public void bailar(String nombre) {
		System.out.println(nombre +  " esta bailando");
		
	}

	@Override
	public void trabajar(String nombre, String numControl) {
		System.out.println(nombre + " Esta trabajando " + " con numero de control " + numControl);
		
	}

	@Override
	public void estudiar() {
		// TODO Auto-generated method stub
		
	}
	
	//Interface Acciones GLobale

	@Override
	public void caminar() {
		System.out.println("La persona esta caminando con numero control" + numControl);
		
	}

	@Override
	public void comer() {
		System.out.println("La persona esta comiendo con numero control" + numControl);
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	public String getNumControl() {
		return numControl;
	}

	public void setNumControl(String numControl) {
		this.numControl = numControl;
	}

}
