package mathClase;

public class EjerciciosMath {

	public static void main(String[] args) {
		
		EjerciciosMath ejm =new EjerciciosMath();
		//ejm.numerosAleatorios();
		//ejm.maximoMinimo();
		//ejm.mayorMenorParametro();
		ejm.redondero();
	}

	public void numerosAleatorios(){
		for(int i=0;i<10;i++){
			int aletorio = (int)(Math.random()*10+1);
			System.out.println(aletorio);
			
		}
	}
	
	public void maximoMinimo(){
		int numero1 = 1000;
		int numero2 = 999;
		
		System.out.println("El mayor de los dos numero es :" + Math.max(numero1, numero2));
		System.out.println("El menor de los dos numero es :" + Math.min(numero1, numero2));
	}
	
	public void mayorMenorParametro(){//Entero mayor mas cercano
		double numero = 5.1;
		System.out.println("El entero mayor del numero es : " + Math.ceil(numero));
		System.out.println("El entero menos del numero es : " + Math.floor(numero));
	}
	
	public void redondero(){
		
		double a = 5.8;
		double b = 5.3;
		System.out.println("El redondeo del numero : " + Math.round(a));
		System.out.println("El redondeo del numero : " + Math.round(b));		
		
	}
	
}
