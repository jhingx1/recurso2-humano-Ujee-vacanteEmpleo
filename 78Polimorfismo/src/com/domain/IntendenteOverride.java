package com.domain;

import javax.swing.JOptionPane;

public class IntendenteOverride extends EmpreadoOverride{

	@Override
	public void datos(String nomb) {
		JOptionPane.showMessageDialog(null, "Nombre Intendente: " + nomb);
	}

	@Override
	public void labores(String labores) {
		JOptionPane.showMessageDialog(null, "Labores de un Intendente: " + labores);		
	}

	@Override
	public void sueldo(double sueldo) {
		JOptionPane.showMessageDialog(null, "Sueldo Intendente: " + sueldo);		
	}
	
}
