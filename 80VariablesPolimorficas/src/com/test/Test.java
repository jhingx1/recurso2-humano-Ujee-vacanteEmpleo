package com.test;

import com.cualidades.*;

public class Test {

	public static void main(String[] args) {
		Amable amable = new Amable();
		Disiplinado disiplinado = new Disiplinado();
		Flojo flojo = new Flojo();
		Puntual puntual = new Puntual();
		
		//Declarando una variable polimorfica
		//Un objeto polimorfico es el que contiene objetos
		Cualidades objCualidades[] = new Cualidades[4];
		
		objCualidades[0] = amable;
		objCualidades[1] = disiplinado;
		objCualidades[2] = flojo;
		objCualidades[3] = puntual;
		
		//uso de la varible polimorfica.
		//Se comporta segun lo que se le indique
		objCualidades[0].describir();
		objCualidades[1].describir();
		objCualidades[2].describir();
		objCualidades[3].describir();
		
	}

}
