package objetos;

public class ComparacionObjetos {

	public static void main(String[] args) {
		
		String cad1="abcd";
		String cad2="abcd";
		
		String cad3=new String("abcd");
		
		//comprando la referencia ==
		if(cad1==cad2)
			System.out.println("Comparando referencia cad1=cad2");
		if(cad1==cad3)
			System.out.println("Comparando referencia cad1=cad3");
		
		System.out.println("Comparando valor-equas");
		
		//Comparando Valor
		if(cad1.equals(cad2))
			System.out.println("Comparando referencia cad1=cad2");
		if(cad1.equals(cad3))
			System.out.println("Comparando referencia cad1=cad3");

	}

}
