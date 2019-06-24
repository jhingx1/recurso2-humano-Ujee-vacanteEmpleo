package string;

public class UsoCadenas {
	
	public void mostrarCadenas(){		
		//System.out.println("Saludo desde Clase UsoCadenas y desde el metodo MostrarCadenas");
		
		String mensaje1 = "Entrada de Datos o Cadena Valida";
		String mensaje2 ="";
		String mensaje3 =null;
		//System.out.println(mensaje3);
		
		mensaje1+=" esta es una concatenacion";
		
		//uniendo String
		
		String nombre = "Juan";
		String apeliido = "Perez";
		String nombreCompleto = nombre + " " + apeliido;
		//System.out.println(nombreCompleto);
		
		//concatenacion cadenas y numero
		double precio = 100.60;
		String mensaje = "Precio :" + precio;
		//System.out.println(mensaje);
		
		/*Caracteres Especiales de String
		  \n nueva linea
		  \t tabulacion
		  \r retorno de carro
		  \" comillas dobles
		  \\backslash
		*/
		
		String caracteresEspeciales;
		caracteresEspeciales = "CODIGO: JSP\nPrecio: $50.00";
		caracteresEspeciales = "CODIGO:\tJSP\r\nPrecio:\t$50.00";
		caracteresEspeciales = "precionar la letrar 'X' para salir";
		caracteresEspeciales = "precionar la letrar \"X\" para salir";
		
		caracteresEspeciales="c\\system\\program\\demos";
		
		System.out.println(caracteresEspeciales);
	}

}
