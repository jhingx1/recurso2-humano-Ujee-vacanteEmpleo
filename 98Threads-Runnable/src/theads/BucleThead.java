package theads;

public class BucleThead implements Runnable {
	
	private String nombre;
	
	//Para el nombre del hilo
	public BucleThead(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run() {
	
		for(int i=0;i<=10;i++){
			if(nombre == "HILO 1"){
				System.out.println("Ciclo en la posicion : " + i*100+" PROCESO: " + nombre);
			}else{
				System.out.println("Ciclo en la posicion : " + i +" PROCESO: " + nombre);
			}
			
			//Para dormir/detener al hilo
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			
		}		
				
		System.out.println("Proceso: " + Thread.currentThread().getName() + " terminado");
		
	}
	
}
