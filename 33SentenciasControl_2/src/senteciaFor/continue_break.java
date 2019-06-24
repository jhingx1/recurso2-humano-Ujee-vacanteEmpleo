package senteciaFor;

public class continue_break {

	public static void main(String[] args) {

		continue_break objeto = new continue_break();

		objeto.utilizaBreak();
		//objeto.utilizandoContinue();

	}

	
	public void utilizaBreak() {
		/*
		// break utlizando for
		String frase = "Anita lava la tina";
		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);
			System.out.println(caracter);

			if ('v' == caracter) {
				System.out.println("Si utilizamos la letra v");
				continue;
			}

		}
		*/
		
		// break utlizando while
		String frase1 = "Anita lava la tina";
		int i = 0;
		while (i < frase1.length()) {
			
			char caracter = frase1.charAt(i);
			System.out.println(caracter);
			i++;
			if('a'==caracter){
				System.out.println("Encontramos a");
				break;
			}
		}
	
	}
	
	public void utilizandoContinue(){
		String frase = "Anita lava la ropa";
		for(int i=0;i<frase.length();i++){
			char caracter = frase.charAt(i);			
			if('A' == caracter){
				continue;
			}
			System.out.println(caracter);
		}
			
	}

}
