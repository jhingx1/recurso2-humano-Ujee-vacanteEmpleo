package operadoreAritmeticos;

public class Operadores {

	public static void main(String[] args) {
		
		int i = 12;
		int j = 10;
		
		int suma = i+ j;
		int resta = i - j;
		int multiplicacion = i*j;
		float div = (float)i/(float)j;
		int mod = i%j;
		
		System.out.println("Suma : "+suma);
		System.out.println("resta : "+resta);
		System.out.println("multiplicacion : "+multiplicacion);
		System.out.println("div : "+div);
		System.out.println("mod : "+mod);
		
		System.out.println("-----------");
		
		int num1 = 2;
		int num2 = 2;
		
		System.out.println("Al ejecutar la instruccion num1 vale : ");
		System.out.println(num1++);
		
		System.out.println("Al ejecutar la instruccion num2 vale : ");
		System.out.println(++num2);
		
		System.out.println("Valor actual num1: ");
		System.out.println(num1);
		
		System.out.println("Valor actual num2: ");
		System.out.println(num2);
		
	}

}
