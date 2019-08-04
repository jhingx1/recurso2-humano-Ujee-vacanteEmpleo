package principal.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Clases.Agenda;
public class SetCollection {
	
	public static void ejemploSet(){
		
		Agenda per1 = new Agenda("37", "Jean", "123456");
		Agenda per2 = new Agenda("38", "Pedro", "2135435");
		Agenda per3 = new Agenda("39", "Luis", "23436");
		Agenda per4 = new Agenda("40", "Milton", "313456");
		Agenda per5 = new Agenda("40", "Milton", "313456");
		
		
		Set<Agenda> agendaClientes = new HashSet<Agenda>();
		
		//hashcode y equals
		//per4 = per5;
		if(per4.equals(per5)){
			System.out.println("Persona 4 es igual a persona 5");
			System.out.println(per4.hashCode());
			System.out.println(per5.hashCode());
		}else{
			System.out.println("Persona 4 NO igual a persona 5");
			System.out.println(per4.hashCode());
			System.out.println(per5.hashCode());
		}
		
		
		
		agendaClientes.add(per1);
		agendaClientes.add(per2);
		agendaClientes.add(per3);
		agendaClientes.add(per4);
		agendaClientes.add(per5);
		
		System.out.println("LA agenda contiene el objeto 5 " + agendaClientes.contains(per5));
		agendaClientes.remove(per1);
		
		System.out.println("Tamaño agenda : " + agendaClientes.size());
		imprimeSet(agendaClientes);
		
	}
	
	static void imprimeSet(Collection<Agenda>  col){
		for (Agenda agenda : col) {
			System.out.println(agenda.getNombre());
		}
	}
	
}
