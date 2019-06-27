package arreglos_I;

public class ArreglosBasico {

	public static void main(String[] args) {
		
		//Declaracion tipo de array unidimencional
		
		int[] arrNombres;
		arrNombres = new int[5];  
		
		//int[] arrNombres = {5,4,2,3,1};
		
		//int[] arrNombres = new int[5]; //Otra forma de declarar.
		
		arrNombres[0] = 10;
		arrNombres[1] = 20;
		arrNombres[2] = 30;
		arrNombres[3] = 40;
		arrNombres[4] = 50;
		
		for(int i=0;i<5;i++){
			System.out.println(arrNombres[i]);
		}
		
		System.out.println("-------------------");
		
		//Otra forma de declarar
		
		String a[] = {"Avila", "Burgos", "León", "Palencia", "Salamanca"};
		 
		for (int x=0;x<a.length;x++)
		 System.out.println(a[x]);
		
		//Uso de for-each
		
		System.out.println("--------Uso de for-each------");
		
		for (String elemento: a)
		  System.out.println(elemento);
		
		
	}

}
