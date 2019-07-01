package com.domain;

import javax.swing.JOptionPane;

public class ProfesorOverride extends EmpreadoOverride{
	@Override
	public void datos(String nomb) {
		JOptionPane.showMessageDialog(null, "Nombre Profesor: " + nomb);
	}

	@Override
	public void labores(String labores) {
		JOptionPane.showMessageDialog(null, "Labores de un Profesor: " + labores);		
	}

	@Override
	public void sueldo(double sueldo) {
		JOptionPane.showMessageDialog(null, "Sueldo Profesor: " + sueldo);		
	}
}
