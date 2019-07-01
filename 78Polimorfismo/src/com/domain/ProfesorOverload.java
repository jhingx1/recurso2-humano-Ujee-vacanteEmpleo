package com.domain;

import javax.swing.JOptionPane;

public class ProfesorOverload {
	
	//Utilizando Polimorfismo oveload
	
	public void datos(String nom){
		JOptionPane.showMessageDialog(null, "Nombre : " + nom);
	}
	
	public void labores(String lab){
		JOptionPane.showMessageDialog(null, "Funciones Director : " + lab);
	}
	
	public void sueldo(double pago){
		JOptionPane.showMessageDialog(null, "El pago es : " + pago);
	}

}
