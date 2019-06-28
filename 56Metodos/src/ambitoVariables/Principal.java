package ambitoVariables;

public class Principal {

	public static void main(String[] args) {
		
		MiClase.nacionalidad="mexicana";//Cambia en todos los objetos
		
		MiClase obj = new MiClase();
		MiClase obj2 = new MiClase();
		
		obj.setEdad(10);
		System.out.println("Edad : " + obj.getEdad());			
		
		//System.out.println(obj.mayorDeEdad(20));
		System.out.println(obj.mayorDeEdad(obj.getEdad()));
		
		System.out.println(obj.mayorDeEdad(80));
		
		System.out.println("--------------------------");
		//MiClase.nacionalidad="mexicana";
		obj2.setEdad(30);
		System.out.println("La edad es : " + obj2.getEdad());
		System.out.println(obj2.mayorDeEdad(obj2.getEdad()));
		
	}

}
