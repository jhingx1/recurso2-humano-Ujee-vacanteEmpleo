package principal.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListSimple {
	
	public static void usoArrayListSimple(){
		
		List<String> meses = new ArrayList<>();
		
		meses.add("Enero");
		meses.add("Febreo");
		meses.add("Marzo");
		
		//obtener el ultimo elemento
		
		int ultimoElemento = meses.size() - 1;
		String ultimoMes = meses.get(ultimoElemento);
		System.out.println("Imprimiendo el Ultimo Elemento");
		System.out.println(ultimoElemento + " elemento " + ultimoMes);
		
		//modo debug
		System.out.println("Imprimiendo modo Debug");
		System.out.println(meses);
		
		//agregando un elemento
		meses.add(0, "Abril");
		meses.add("Abril");
		System.out.println(meses);
		
		imprimeCollection(meses);
		
		
	}
	
	static void imprimeCollection(Collection col){
		Iterator iter = col.iterator();
		System.out.println();
		System.out.println();

		while(iter.hasNext()){
			String mes = (String)iter.next();
			System.out.println(mes);
		}
	}
	
}
