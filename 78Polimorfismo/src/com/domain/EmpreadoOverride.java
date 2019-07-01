package com.domain;

public abstract class EmpreadoOverride {
	
	/*
	Polimorfismo

	Overload(Sobrecarga)
	Polimorfismo con respuesta de acuerdo a los parametros,
	pudieron agregar o quitar parametros.
	
	Overload(sobre escritura)
	Polimorfismo sobrescribiendo los metodos heredados tal cual. 
	*/

	abstract public void datos(String nomb);
	abstract public void labores(String labores);
	abstract public void sueldo(double sueldo);
	
}
