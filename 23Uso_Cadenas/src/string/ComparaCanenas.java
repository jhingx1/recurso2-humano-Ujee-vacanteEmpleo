package string;

public class ComparaCanenas {
	
	public void comparandoString(){
		
		String nombre = "Juan";
		if(nombre.equals("Juan")){ //if(nombre.equalsIgnoreCase("Juan")){
			//System.out.println("Si corresponde al nombre");
		}else{
		//	System.out.println("No corresponde al nombre");
		}
		
		nombre = "";
		if(nombre.isEmpty()){ //La longuitud es 0
			//System.out.println("La cadena esta vacia");
		}else{
			//System.out.println("Tiene una loguitud mayor");
		}
		
		nombre = "JUAN MANUEL PEREZ";
		if(nombre.startsWith("pp")){ //si la cadena empieza con la palabra
			System.out.println("El nombre de la persona comienza con la palabra JUAN");
		}
		
		nombre = "JUAN MANUEL PEREZ";
		if(nombre.endsWith("PEREZ")){ //si la cadena empieza con la palabra
			System.out.println("El nombre de la persona comienza con la palabra PEREZ");
		}
		
		//tamaño de una cadena
		String miCadena = "Este es mi primer curso de Java";
		int lenght = miCadena.length();
		System.out.println("El tamaño de mi cadena es : " + lenght);
		
		miCadena = "";
		if(miCadena.length() == 0){
			System.out.println("Cadena Vacia");
		}
		
		//Buscar una cadena
		miCadena="Este es mi primer curso de Java";
		String cadenaBuscada="Es";
		int indice = miCadena.indexOf(cadenaBuscada);
		System.out.println("La posicion donde se encontro mi cadena : " + indice);
		
		//Busca caracter
		
		char caracter=miCadena.charAt(2);
		System.out.println("El caracter en la posicion 2 es " + caracter);
		
		//limpiar cadena con espacios
		String cadenaConEspacios = "   esta es una cedena con espacios   ";
		System.out.println(cadenaConEspacios);
		System.out.println(cadenaConEspacios.trim());
				
		//Extraer subcadena
		String numCta = "7897 4512 4853 8423";
		String cuatroUltimosCaracteres = numCta.substring(5, 9);
		System.out.println(cuatroUltimosCaracteres);
		
	}

}
