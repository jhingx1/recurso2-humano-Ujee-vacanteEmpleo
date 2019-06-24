package condicionales;

public class CondicionalIf {

	public static void main(String[] args) {
		
		int edad = 15;
		
		if(edad> 18){
			System.out.println("Eres mayor de edad");
		}else if(edad==15){
			System.out.println("Tienes 15 años");
		}else{
			System.out.println("Eres menor de edad");
		}
		
		//Condicion con ternario
		
		String resultado = (edad>=18) ? "Mayor de Edad" : "Menor de Edad";
		System.out.println(resultado);

	}

}
