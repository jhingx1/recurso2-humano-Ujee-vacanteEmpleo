package metodosEjm;

public class ClaseConDosMetodos {

	//metodo que es llamado
	public int multiplicacion(int num1,int num2){
		return num1*num2;
	}
	
	//metodo que llama
	public void calcula(){
		int x = 4, y =3;
		int z = multiplicacion(x, y);
		System.out.println(x + " X " + y + " es igual a " + z);
	}
	
}
