package dateTime_I;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime_I {

	public static void main(String[] args) {
		
		DateTime_I objeto = new DateTime_I();
		//objeto.usarNow();
		//System.out.println("---------------------");
		objeto.usarOff();
		//System.out.println("---------------------");
		//objeto.usarParse();
		//System.out.println("---------------------");
		//objeto.regresaPartesDateTime();
	}
	
	public void usarNow(){
		//objeto, metodo estatico now()
		LocalDate fechaLocal = LocalDate.now();		
		LocalTime tiempoActual = LocalTime.now();
		LocalDateTime fechaTiempoActual = LocalDateTime.now();
		
		//imprimir en pantalla.
		System.out.println("Utilizando LocalDate: " + fechaLocal);
		System.out.println("Utilizando LocalTime: " + tiempoActual);
		System.out.println("Utilizando LocalDateTime: " + fechaTiempoActual);
		
	}
	
	//metodo estatico 
	public void usarOff(){
		LocalDate fecha1 = LocalDate.of(2018, Month.OCTOBER, 31);
		System.out.println("Uso de off: "+fecha1);
		
		LocalDate fecha2 = LocalDate.of(2018,10, 31);
		System.out.println("Uso de off: "+fecha2);
		
		LocalTime tiempo1 = LocalTime.of(14, 32);
		System.out.println("Uso de localTime : " + tiempo1);
		
		LocalTime tiempo2 = LocalTime.of(14, 32, 45);
		System.out.println("Uso de localTime : " + tiempo2);
		
		LocalTime tiempo3 = LocalTime.of(14, 32, 45,123456789); //nano segundos
		System.out.println("Uso de localTime : " + tiempo3);
		
		LocalDateTime fechaHora = LocalDateTime.of(1981, 10,16,14,32);
		System.out.println("Haciendo uso de LocalDateTime_: " + fechaHora);
	}
	
	public void usarParse(){
		LocalDate fecha = LocalDate.parse("2018-10-31"); //toma como cadena pero regresa como objeto
		System.out.println(fecha);
		LocalTime tiempo1 = LocalTime.parse("02:32:45");
		System.out.println(tiempo1);
		LocalDateTime fechaTiempo = LocalDateTime.parse("2015-10-31T02:32:45.123456789");
		System.out.println(fechaTiempo);
	}
	
	public void regresaPartesDateTime(){
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		System.out.println("La fecha y hora actual es : "+fechaHoraActual);
		System.out.println("El metodo getYear() muestra el año actual (regresa un entero) " + fechaHoraActual.getYear());
		System.out.println("El metodo getMonth() muestra el mes actual (regresa un objeto) " + fechaHoraActual.getMonth());
		System.out.println("El metodo getMonthValue() muestra el mes actual (regresa un entero) " + fechaHoraActual.getMonthValue());
		System.out.println("El metodo getDayOfMonth() muestra el dia actual (regresa un entero) " + fechaHoraActual.getDayOfMonth());
		System.out.println("El metodo getDayOfYear() muestra el dia del año (regresa un entero) " + fechaHoraActual.getDayOfYear());
		System.out.println("El metodo getDayOfWeek() muestra el dia del semana (regresa un objeto) " + fechaHoraActual.getDayOfWeek());
		
		Month mes = fechaHoraActual.getMonth(); //esta numeracion se puede almacenar en un objeto
		System.out.println(mes);
		
		DayOfWeek dia = fechaHoraActual.getDayOfWeek();
		System.out.println(dia);
		
		System.out.println("El metodo getHoue() muestra la hora del dia (regresa un entero) " + fechaHoraActual.getHour());
		System.out.println("El metodo getMinute() muestra el minuto del dia (regresa un entero) " + fechaHoraActual.getMinute());
		System.out.println("El metodo getSecond() muestra el segundos del dia (regresa un entero) " + fechaHoraActual.getSecond());
		System.out.println("El metodo getNano() muestra el nanosegundos del dia (regresa un entero) " + fechaHoraActual.getNano());		
		
	}

}
