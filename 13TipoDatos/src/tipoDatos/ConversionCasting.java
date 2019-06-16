package tipoDatos;

public class ConversionCasting {

	public static void main(String[] args) {
	
		/*
		int a = 1;
		double b = 2.5;
		System.out.println("El valor de un double es : " + b );
		*/
		
		int a = 1;
		double b = 2.5;		
		a =(int)b;		
		System.out.println("El valor de un double es : " + a );
		
		System.out.println("-----");
		
		//conversion de int a char
		int codigo = 97;
		char codigoASCII = (char)codigo;		
		System.out.println(codigoASCII);
		

	}

}