package metodoArray;

import java.util.Arrays;

public class ArrayClass {

	//int[] cantidades = new int[5];
	int[] cantidades = {5,4,2,3,1};
	String[] nombre = {"e","d","c","b","a"};
	
	
	public static void main(String[] args) {
		
		ArrayClass objeto = new ArrayClass();
		//Ordenar valores
		//objeto.ordenarValores();
		//objeto.leerArreglo();
		
		//Rellenar numero en todos los elementos del arreglo
		//objeto.rellenarValores();
		//objeto.leerArregloRelleno();		
		
		
		objeto.buscarValorString();
		

	}
	
	//Sort : Para ordenar los valores de un arreglo
	public void ordenarValores(){
		Arrays.sort(cantidades);
		Arrays.sort(nombre);
	}
	
	//fill: Para rellenar las los elementos numericos de un arreglo
	public void rellenarValores(){
		Arrays.fill(cantidades,10);
		
	}

	//Para leer el arreglo	
	public void leerArregloOrden(){
		for(int valor:cantidades){
			System.out.println(valor);
		}
		
		System.out.println("--------------------------");
		for(String valorNom:nombre){
			System.out.println(valorNom);
		}
		
	}
	
	//Leer el arreglo con filar rellenar con metodo
	public void leerArregloRelleno(){
		for(int val:cantidades){
			System.out.println(val);
		}
	}
	
	//buscar valores en un arreglo ordenado
	public void buscarValorString(){
		String[] nombresEmpleados = {"Pedro","Maria","Juan"}; //Array de cadenas.
		Arrays.sort(nombresEmpleados);  //Ordena lo elemetos del array		
		
		for(String valorNom:nombresEmpleados){
			System.out.println(valorNom);
		}
		System.out.println("--------------------------");
		
		int index = Arrays.binarySearch(nombresEmpleados, "Pedro");//nombresEmpleados : cadena; "Pedro":cadena a buscar.
		System.out.println("La palabra la encontre : " + index + " Posicion");
	}
	
}
