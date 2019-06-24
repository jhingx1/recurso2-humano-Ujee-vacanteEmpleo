package senteciaFor;

public class SentenciaWhile {

	public static void main(String[] args) {
		
		SentenciaWhile swhile = new SentenciaWhile();
		swhile.ejemplo1();
		swhile.tablasDeMultiplicar();

	}
	
	public void tablasDeMultiplicar(){
		int tabla=1;
		int i=1;
		
		while(tabla<=3){
			while(i<=10){
				System.out.println(tabla + " * " + i + " = " + tabla*i);
				i++;
			}
			System.out.println("-----------------");
			i=1;
			tabla++;
		}		
	}

	public void ejemplo1(){
		int i =0;
		while (i>0){
			System.out.println("Esta valor no se ejecutara");
		}
	}
	
}
