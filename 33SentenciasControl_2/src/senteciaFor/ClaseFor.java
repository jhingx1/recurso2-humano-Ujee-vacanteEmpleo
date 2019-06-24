package senteciaFor;

public class ClaseFor {

	public static void main(String[] args) {
		
		ClaseFor cfor = new ClaseFor();
		//cfor.concatenarNumero();
		cfor.imprimirTabla();
		
	}

	public void concatenarNumero(){
		
		String numeros = "";
		for (int i=0;i<5;i++) {
			numeros+=i + " ";
			//numeros+=" ";
			System.out.println(numeros);			
		}
		
		//imprimir una tabla de multiplicar
		
		int numeroDeTabla = 2;
		System.out.println("Tabla del " + numeroDeTabla);
		
		for(int j=1;j<=10;j++){
			System.out.println(numeroDeTabla + " * " + j + " = " + numeroDeTabla*j);
		}
		
	}
	
	//Realiza las tablas de multiplicar hasta N numeros
	public void imprimirTabla(){
		
		int cuantasTablas = 3;
		
		
		for(int i=1;i<=cuantasTablas;i++){
			
			for(int j=1;j<=10;j++){
				System.out.println(i + " * " + j + " = " + i*j);
							
			}
			
		}
		
	}
	
}
