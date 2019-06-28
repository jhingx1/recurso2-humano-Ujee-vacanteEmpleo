package envioParametrosMain;

public class Principal {
	
	public static void main(String args[]) {
		
		if(args.length <= 0){
			System.out.println("No se enviaron parametros");
		}
		
		for(int i=0;i<args.length;i++){
			if(isNumber(args[i]))
				System.out.println("Parametros " + i + " = " + args[i] + " es un numero");
			else
				System.out.println("Parametros " + i + " = " + args[i] + " No es un numero");
		}

	}

	//Devuelve un true si es un numero
	//Devuelve un false si no es un numero
	public static boolean isNumber(String cadena){
		
		//valida si la cadena no esta vacia
		if(cadena.isEmpty() || cadena == null){
			return false;
		}
		
		int i=0;
		if(cadena.charAt(i)=='-'){ //Si adelante del numero existe un negativo
			if(cadena.length() > 1){//validar si envio un numero negativo
				i++;
			}
			else{
				return false;
			}
		}
		
		//El for enpiesa en 1 si existe un signo negativo
		for(;i<cadena.length();i++){
			if(!Character.isDigit(cadena.charAt(i))){ //Si no es un digito
				return false;
			}
		}
		
		return true;
		
	}
	
	
}
