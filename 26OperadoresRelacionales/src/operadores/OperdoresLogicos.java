package operadores;

public class OperdoresLogicos {

	public static void main(String[] args) {
		
		String sexo = "hombre";
		int edad = 18;
		
		//USO DE OPERADOR && (AND)
		
		if(sexo.equalsIgnoreCase("hombre") && edad==18){
			System.out.println("La persona es un hombre");
		}else{
			System.out.println("La persona no es un hombre o no tiene 18 años");
		}
		
		//USO DE OPERADOR OR
		
		if(sexo.equalsIgnoreCase("hombre") || edad==18){
			System.out.println("La persona es un hombre O tiene 18 años");
		}else{
			System.out.println("La persona no es un hombre o no tiene 18 años");
		}

		//OPERACION NEGACION !
		
		if(!sexo.equals("hombre")){
			System.out.println("El personaje es diferente de hombre - Negacion");
		}else{
			System.out.println("Es igual a hombre");
		}
		
		
		
	}

}
