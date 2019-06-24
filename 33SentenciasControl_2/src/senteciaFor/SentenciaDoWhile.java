package senteciaFor;

public class SentenciaDoWhile {

	public static void main(String[] args) {
		
		SentenciaDoWhile objeto = new SentenciaDoWhile();
		objeto.regresaPares();

	}
	
	public void regresaPares(){
		int i = 1;
		do{
			i++;
			
			if(i%2 == 0){
				System.out.println(i);
			}			
		}while(i<100);
	}

}
