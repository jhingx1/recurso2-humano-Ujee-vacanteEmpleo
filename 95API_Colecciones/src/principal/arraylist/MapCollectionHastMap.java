package principal.arraylist;

import java.util.HashMap;
import java.util.Map;

import Clases.Agenda;

public class MapCollectionHastMap {
	
	public void trabajarConMap(){
		
		//crear un mapa
		HashMap<String,Agenda> agenda = new HashMap<String,Agenda>();
		
		agenda.put("001", new Agenda("34", "Jean", "912321321"));
		agenda.put("002", new Agenda("35", "Maria", "099809809"));
		agenda.put("003", new Agenda("31", "Fatima", "99999999"));
		agenda.put("004", new Agenda("32", "Carlos", "98888888"));
		
		imprimeMap(agenda);		
		agenda.remove("002");
		imprimeMap(agenda);
		//reemplazar un elemento
		//agenda.put("001", new Agenda("15", "Julian", "No tiene Elemento"));
		imprimeMap(agenda);
		System.out.println(agenda.keySet());
		
		Agenda ag1 = agenda.get("001");
		ag1.setNombre("Sunat");		
				
		System.out.println(ag1.getNombre());		
		
		imprimeMap(agenda);
		
		
	}
	
	static void imprimeMap(HashMap<String, Agenda> agenda){
		System.out.println();
		
		for(Map.Entry<String, Agenda> ag:agenda.entrySet()){
			System.out.println("Clave : " + ag.getKey() +" - "+ ag.getValue().getNombre()+" " + ag.getValue().getEdad() );
		}
		
	}

}
