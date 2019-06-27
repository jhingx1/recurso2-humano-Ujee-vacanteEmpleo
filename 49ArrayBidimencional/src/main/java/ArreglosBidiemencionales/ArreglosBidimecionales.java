package ArreglosBidiemencionales;

public class ArreglosBidimecionales {		

	int[][] matrizDeEnteros = new int[3][4];

	//int[][] matrizDeEnteros = {{1,3,5,7},{5,4,1,16},{7,9,61,13}};
	
	public static void main(String args[]){
		ArreglosBidimecionales objeto = new ArreglosBidimecionales();
		objeto.asignaValores();
		objeto.leerArregloBidimensional();
	}
		
	// otra sintaxi

	public void asignaValores() {
		matrizDeEnteros[0][0] = 1;
		matrizDeEnteros[0][1] = 3;
		matrizDeEnteros[0][2] = 5;
		matrizDeEnteros[0][3] = 7;

		matrizDeEnteros[1][0] = 5;
		matrizDeEnteros[1][1] = 4;
		matrizDeEnteros[1][2] = 1;
		matrizDeEnteros[1][3] = 16;

		matrizDeEnteros[2][0] = 7;
		matrizDeEnteros[2][1] = 9;
		matrizDeEnteros[2][2] = 61;
		matrizDeEnteros[2][3] = 13;

	}
	/*
	public void leerArregloBidimensional() {
		for (int i = 0; i < matrizDeEnteros.length; i++) {
			for (int j = 0; j < matrizDeEnteros.length; j++) {
				System.out.println(matrizDeEnteros[i][j]);
			}	
		}
	}
	*/
	
	//uso de for earch
	public void leerArregloBidimensional() {
		for(int[] i:matrizDeEnteros){
			for(int j:i){		
				System.out.print(j + " ");				
			}
			System.out.print("\n");
		}
	}
	
	
	

}
