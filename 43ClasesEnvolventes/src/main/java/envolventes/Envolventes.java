package envolventes;

public class Envolventes {

	public static void main(String[] args) {
		
		Envolventes objeto = new Envolventes();
		//objeto.xxxValue();
		//objeto.parseValueOf();
		objeto.metodoToString();
	}
	
	public void xxxValue(){
		Integer var = new Integer(42);
		byte b = var.byteValue(); //para pasar de un objeto a un tipo primitivo.
		short s = var.shortValue();
		double d = var.doubleValue();
		
		System.out.println("El valor de var = " + var);
		System.out.println("El valor de var = " + b);
		System.out.println("El valor de var = " + s);
		System.out.println("El valor de var = " + d);
		
	}
	
	public void parseValueOf(){  //para pasar a string de un numero, si se puede
		double d4 = Double.parseDouble("3.14");
		System.out.println(d4);
		System.out.println("Es un numero " + (d4+1));
		
		long d5 = Long.parseLong("323"); //de un String a un tipo primitivo long
		System.out.println(d5 + 1);
		
		Long objetoLong = Long.valueOf("456"); //de un objeto a una cadena
		System.out.println(objetoLong);
		
	}
	
	public void metodoToString(){  //para convertir un numero a una cadena
		Double d = new Double(12.34);
		String dCadena = d.toString();
		System.out.println(dCadena+"as");
	}

}
