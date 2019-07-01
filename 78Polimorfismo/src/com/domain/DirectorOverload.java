package com.domain;

import javax.swing.JOptionPane;

public class DirectorOverload extends EmpleadoOverload{
	
	//Utilizando Polimorfismo oveload
	
	public void datos(String nom,String ape){
		JOptionPane.showMessageDialog(null, "Nombre : " + nom + " \nApellidos : " + ape);
	}
	
	public void labores(String lab){
		JOptionPane.showMessageDialog(null, "Funciones Director : " + lab);
	}
	
	public void sueldo(int horas,double pagoH){
		JOptionPane.showMessageDialog(null, "El pago es : " + horas*pagoH);
	}
	
}
