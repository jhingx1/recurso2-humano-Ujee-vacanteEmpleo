package eThrows;

public class Principal {

	public static void main(String[] args) {
		try {
			int resultado = division(6, 0);
			System.out.println("El resultado es : " + resultado);
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error");
			e.printStackTrace();
		}
		

	}
	
	/*
	Propagacion de excepciones 
	throws : nos dice el tipo de excepcion que arroja cierto metodo. Esto le dise al metodo que la invoca que debe de controlarla.
	
	Una excepcion que extiende de "Excepcion" SI obliga a declararla en la firma 
	del metodo.

	Una excepcion que extiende de "RuntimeException" No estamos obligados a declararla
	en la firma de metodo.	
	
	*/
	
	static int division(int numerador, int denominador) throws Exception{ //Es una excepcion que si debemos de controlar
		int resultado = numerador/denominador;
		return resultado;
	}

}
