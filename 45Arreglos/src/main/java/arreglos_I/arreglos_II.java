package arreglos_I;

public class arreglos_II {
	
	public static void main(String[] args) {
		arreglos_II a = new arreglos_II();
		a.dameNumero();
	}
	
	public Integer[] dameNumero(){
		Integer numero[] = new Integer[5];
		numero[0] = 1;
		numero[1] = 2;
		numero[2] = 3;
		numero[3] = 4;
		numero[4] = 5;
		
		for(int i=0;i<5;i++){
			System.out.println(numero[i]);
		}
		
		return numero;		
	}

}
