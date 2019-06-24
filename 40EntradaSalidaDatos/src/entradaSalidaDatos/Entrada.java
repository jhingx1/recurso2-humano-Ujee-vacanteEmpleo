package entradaSalidaDatos;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		String nombre;
		int edad;
		double sueldo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Como te llamas?");
		nombre = entrada.nextLine();
		String convertirNombre = nombre.toUpperCase();
		
		
		System.out.println("¿Que edad tienes?");
		edad = entrada.nextInt();
		
		System.out.println("Cual es tu sueldo actual");
		sueldo = entrada.nextDouble();
		
		System.out.println("-------------------------------");
		System.out.println("Tu nombre es :"+convertirNombre);
		System.out.println("Tu edad es : "+edad);
		System.out.println("El proximo año tu edad sera : " + (edad+1));
		System.out.println("Tu sueldo actual : " + sueldo);
		System.out.println("El proximo año tu sueldo seara un 5% mas : "+(sueldo*1.05));
		
	}

}
