package com.domain;

import javax.swing.JOptionPane;

public class DirectorOverride extends EmpreadoOverride{

	@Override
	public void datos(String nomb) {
		JOptionPane.showMessageDialog(null, "Nombre Director: " + nomb);
	}

	@Override
	public void labores(String labores) {
		JOptionPane.showMessageDialog(null, "Labores de un Director: " + labores);		
	}

	@Override
	public void sueldo(double sueldo) {
		JOptionPane.showMessageDialog(null, "Sueldo Director: " + sueldo);		
	}

}
