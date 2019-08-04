package principal.arraylist;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.Iterator;
import java.util.List;

public class ArrayListConGenericos {
	
public static void usoArrayListSimple(){
		
		List<String> meses = new ArrayList<String>();
		
		meses.add("Enero");
		meses.add("Febreo");
		meses.add("Marzo");
		
		//obtener el ultimo elemento
		
		int ultimoElemento = meses.size() - 1;
		String ultimoMes = meses.get(ultimoElemento);
	
		//agregando un elemento
		meses.add(0, "Abril");

		System.out.println(meses);
			
		//VALIDANDO si un elemento esta dentro de nuestro arraylist
		String objetoBuscado = "Abril";
		if(meses.contains(objetoBuscado)){
			System.out.println("En esta lista existe : " + objetoBuscado);
			System.out.println("Se encuentra en la posicion " + meses.indexOf(objetoBuscado));
			meses.remove(objetoBuscado);
			System.out.println(meses);
			
			imprimeCollection(meses);
			
			meses.set(0,"Diciembre");
			
			imprimeCollection(meses);
			meses.clear();
			imprimeCollection(meses);
			
		}else{
			System.out.println("En esta lista no se encuentra " +  objetoBuscado);
		}
		
		
	}
	
	static void imprimeCollection(Collection<String> col){
		//Iterator iter = col.iterator();
		System.out.println();
		
		if(!col.isEmpty()){
			for(String str:col){
				System.out.println(str);
			}
		}else{
			System.out.println("La coleccion esta vacia");
		}
		
		
	}

}
