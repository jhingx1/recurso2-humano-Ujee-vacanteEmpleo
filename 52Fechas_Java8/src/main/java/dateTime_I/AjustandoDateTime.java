package dateTime_I;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class AjustandoDateTime {

	public static void main(String[] args) {
		AjustandoDateTime objeto =new AjustandoDateTime();
		objeto.ajusteDateTime();
		objeto.modificarTiempo();

	}
	
	public void ajusteDateTime(){
		LocalDate fecha1 = LocalDate.of(2017, Month.OCTOBER, 16);
		System.out.println("Fecha Actual : " + fecha1);
		
		//cambio del dia
		fecha1 = fecha1.withDayOfMonth(31);
		System.out.println("Fecha cambiando el dia " + fecha1);
		
		fecha1 = fecha1.withMonth(2);
		System.out.println("Fecha cambiando el mes " + fecha1); //detecta el dia de febrero		
		fecha1 = fecha1.withDayOfYear(365);
		System.out.println("Alterando el dia del año " + fecha1);
		
		System.out.println("--------------------------------------------");
		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora Actual es : " + horaActual);
		
		horaActual = horaActual.withHour(10);
		System.out.println("La hora modificada es " + horaActual);
		
		horaActual = horaActual.withMinute(40);
		System.out.println("El minuto modificada es " + horaActual);
		
	}
	
	public void modificarTiempo(){
		LocalDateTime fechaActual = LocalDateTime.now();
		System.out.println("--------------------------------------------");
		System.out.println("Hora Actual" + fechaActual);
		
		fechaActual = fechaActual.plus(3, ChronoUnit.WEEKS); //
		System.out.println("Fecha Modificada sumandole 3 semanas: " + fechaActual);
		
		fechaActual = fechaActual.minus(3,ChronoUnit.WEEKS);
		System.out.println("Fecha Modificada restandole 3 semanas: " + fechaActual);
		
		LocalDateTime fechaNueva = LocalDateTime.now();
		System.out.println("--------------------------------------------");
		System.out.println("fecha Actual" + fechaActual);
		fechaNueva = fechaNueva.plusDays(7);
		System.out.println("Fecha Modificada sumandole 7 dias: " + fechaNueva);
		
	}
	

}
