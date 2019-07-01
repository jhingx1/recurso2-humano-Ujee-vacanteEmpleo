package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

/*

Error en tiempo de compilacion : Sintaxis
Error en Tiempo de ejecucion :
	Ejm : No podemos conectarnos a la base de datos.
	      No podemos acceder a los archivos

Tipos de Excepciones
No Controladas
	Clases ERROR o RuntimeException
	No es necesario capturarlas ni controlarlas

Controladas
	Clases Exception - No RuntimeException
	Es obligatorio a capturarla.

*/
public class Ejecutar {

	static int miArreglo[]= new int[3];
	
	public static void main(String[] args) {
		
		llenarArreglo();
		//mostrarArreglo();
		sumarArreglo();

	}

	public static void llenarArreglo() {
		Scanner	entrada = new Scanner(System.in);
		
		try {
			int numero;
			for(int i = 0;i<=3;i++){
				System.out.println("Introduce el numero en la posicion : " + i);
				numero = entrada.nextInt();
				miArreglo[i] = numero;
			}	
		} catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Algún valor de los ingresados, no son validos");
		}
		
			
	}
	
	public static void mostrarArreglo(){
		for(int i =0;i<=2;i++){
			System.out.println(miArreglo[i]);
			//System.out.println(miArreglo.length);
		}
	}
	
	public static void sumarArreglo() {
		int suma = 0;
		for(int i=0;i<=2;i++){
			suma = suma + miArreglo[i];
		}
		System.out.println("La suma de suma de numero : " + suma);
	}

}
