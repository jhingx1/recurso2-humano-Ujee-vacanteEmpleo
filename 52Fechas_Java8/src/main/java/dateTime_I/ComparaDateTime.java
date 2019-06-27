package dateTime_I;

import java.time.LocalDate;
import java.time.Month;

public class ComparaDateTime {

	public static void main(String[] args) {
		ComparaDateTime objeto = new ComparaDateTime();
		objeto.isBefore();
		objeto.isAfter();
		objeto.compareTo();
	}

	// para comparar dos fechas, regresar true si la fecha actual es
	// menor(antes) que
	// la fecha que se va a pasar
	public void isBefore() {

		LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.of(2010, Month.OCTOBER, 31);

		if (fecha1.isBefore(fecha2)) { // si fecha1 estubiese antes que fecha2
			System.out.println("El dia " + fecha1 + " SI esta ANTES de " + fecha2);
		} else {
			System.out.println("El dia " + fecha1 + " NO esta ANTES de " + fecha2);
		}

	}

	// para comparar dos fechas, regresar true si la fecha actual es
	// mayor(despues) que
	// la fecha que se va a pasar
	public void isAfter() {

		LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.of(2010, Month.OCTOBER, 31);

		if (fecha1.isAfter(fecha2)) { // si fecha1 estubiese antes que fecha2
			System.out.println("El dia " + fecha1 + " SI esta DESPUES de " + fecha2);
		} else {
			System.out.println("El dia " + fecha1 + " NO esta DESPUES de " + fecha2);
		}

	}
	
	//comparando fecha
	public void compareTo() {
		LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.of(2019, Month.JUNE, 26);

		if(fecha1.compareTo(fecha2)<0){
			System.out.println("La fecha " +  fecha1 + " esta antes de " +  fecha2);
		}else if(fecha1.compareTo(fecha2)>0){
			System.out.println("La fecha " +  fecha1 + " esta despues de " +  fecha2);
		}else{
			System.out.println("La fecha " +  fecha1 + " es igual a " +  fecha2);
		}
		
	}

}
