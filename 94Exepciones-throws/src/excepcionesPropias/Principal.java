package excepcionesPropias;

public class Principal {

	public static void main(String[] args) {
		
		int resultado;
		try {
			resultado = division(6, 0);
			System.out.println("El resultado es : " + resultado);
		} catch (MiExcepcion e) {
			System.out.println("Error : ");
			e.printStackTrace();
		}
		
		
	}

	
	static int division(int numerador, int denominador) throws MiExcepcion{
		if(denominador==0){
			throw new MiExcepcion("Estas dividiendo un numero por cero");
		}
		
		int resultado = numerador/denominador;
		return resultado;
	}

}
