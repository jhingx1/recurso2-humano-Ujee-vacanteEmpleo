package com.domain;

import javax.swing.JOptionPane;

public class IntendenteOverload {

	//Utilizando Polimorfismo oveload
	
	public void datos(String nom,String ape,String direccion){
		JOptionPane.showMessageDialog(null, "Nombre : " + nom + " \nApellidos : " + ape + " \nDireccion : " + direccion);
	}
	
	public void labores(String lab,String horas){
		JOptionPane.showMessageDialog(null, "Funciones Director : " + lab+ " \nHoras : " + horas);
	}
	
	public void sueldo(int horas,double pagoH,double incentivo){
		JOptionPane.showMessageDialog(null, "El pago es : " + horas*pagoH+" \nIncentivo : " + incentivo);
	}
	
}
