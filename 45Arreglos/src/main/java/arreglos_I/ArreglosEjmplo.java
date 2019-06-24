
package arreglos_I;

import java.util.Scanner;

public class ArreglosEjmplo {
	
	private final int BIMESTRE = 6;
	private final int CALIFICACION_APROBATORIA;
	private double calificaciones[] = new double[6];

	public static void main(String[] args) {
		
		ArreglosEjmplo objeto = new ArreglosEjmplo(70);//asignando al contructor la varible final CALIFICACION_APROBATORIA

		objeto.solicitaCalificaciones();
		objeto.imprimeCalificacionBimestre();
		System.out.println("El promedio semestrar es : " + objeto.calculaPromedio());		
	}


	//El constructo para inicializar la variable final
	public ArreglosEjmplo(int calificacionAprobatoria) {

		CALIFICACION_APROBATORIA = calificacionAprobatoria;
	}

	// metodo solicita informacion
	public void solicitaCalificaciones() {
		Scanner entrada = new Scanner(System.in);
		double calificacion; // guarda las calificaciones en el arreglo
		for (int i = 0; i < calificaciones.length; i++) {
			System.out.println("Calificaciones para el bimestre" + (i + 1));
			calificacion = entrada.nextDouble();
			calificaciones[i] = calificacion;
		}

	}

	public void imprimeCalificacionBimestre() {
		for (int i = 0; i < calificaciones.length; i++) {
			if(calificaciones[i] < CALIFICACION_APROBATORIA ){
				System.out.println("CON UN " + calificaciones[i] + " REPRUEBAS EL BIMESTRE " + (i+1) );
			}else{
				System.out.println("CON UN " + calificaciones[i] + " APRUEBAS EL BIMESTRE " + (i+1) );
			}
		}
	}

	public double calculaPromedio(){
		double suma=0;
		for(double calificacion:calificaciones){   //uso del forEach
			suma+=calificacion; //calificacion es una variable diferente.
		}
		return suma/BIMESTRE;
	}
	
}
