package tipoDatos;

public class Doble_Float {
	
	public static void main(String[] args) {
		
		int valorEntero = 10/3;
		float valorFlotante = 10f/3f;  //32 bits
		double valorDouble  = 10d/3d;  //64 bits
		
		System.out.println("Valor entero  : " + valorEntero);
		System.out.println("Valor flotante  : " + valorFlotante);
		System.out.println("Valor double  : " + valorDouble);
		
		System.out.println("---------------------");
		System.out.println("Tipo\tMinimo\tMaximo");
		System.out.println("Byte\t" + Byte.MAX_VALUE + "\t" + Byte.MAX_VALUE);
		System.out.println("Short\t" + Short.MAX_VALUE + "\t" + Short.MAX_VALUE);
		System.out.println("Integer\t" + Integer.MAX_VALUE + "\t" + Integer.MAX_VALUE);
		System.out.println("long\t" + Long.MAX_VALUE + "\t" + Long.MAX_VALUE);
		System.out.println("Float\t" + Float.MAX_VALUE + "\t" + Float.MAX_VALUE);
		System.out.println("Double\t" + Double.MAX_VALUE + "\t" + Double.MAX_VALUE);
			
	}

}
