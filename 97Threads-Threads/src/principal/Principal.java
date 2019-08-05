package principal;

import theads.BucleThead;
import theads.LeerArchivoThread;

public class Principal {
	
	public static void main(String[] args) {
		
		//Creando nuestro primer hilo
		Thread t1 = new BucleThead("HILO 1");
		Thread t2 = new BucleThead("HILO 2");
		Thread t3 = new BucleThead("HILO 3");
		
		//Inicializar el Hilo, con esto es suficiente
		t1.start();
		t2.start();
		
		
		Thread t0 = new LeerArchivoThread("D:/REPO_JAVA_SE_JEE/controlArchivos/archivo.txt","HILO 0");//ruta de mi archivo de texto
		t0.start();
		
	}

}
