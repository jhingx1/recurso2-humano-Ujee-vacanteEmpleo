package theads;

public class BucleThead extends Thread {
	
	//Para el nombre del hilo
	public BucleThead(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
	
		for(int i=0;i<=10;i++){
			if(this.getName() == "HILO 1"){
				System.out.println("Ciclo en la posicion : " + i*100+" PROCESO: " + this.getName());
			}else{
				System.out.println("Ciclo en la posicion : " + i +" PROCESO: " + this.getName());
			}
			
			//Para dormir/detener al hilo
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			
		}		
				
		System.out.println("Proceso: " + this.getName() + " terminado");
		
	}
	
}
