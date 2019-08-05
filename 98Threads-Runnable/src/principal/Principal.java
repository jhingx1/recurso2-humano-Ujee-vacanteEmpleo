package principal;

import theads.BucleThead;
import theads.LeerArchivoThread;

public class Principal {
	
	public static void main(String[] args) {
		
		BucleThead obj1 = new BucleThead("HILO 1");
		//Creando el hilo
		Thread hilo1 = new Thread(obj1);
		hilo1.start();
		
		BucleThead obj2 = new BucleThead("HILO 2");
		//Creando el hilo
		Thread hilo2 = new Thread(obj2);
		hilo2.start();
		
		LeerArchivoThread obj3 = new LeerArchivoThread("D:/REPO_JAVA_SE_JEE/controlArchivos/archivo.txt","HILO 0");
		//Creando el hilo
		Thread hilo3 = new Thread(obj3);
		hilo3.start();

	}

}
