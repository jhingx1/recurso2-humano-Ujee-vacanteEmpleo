package objetosBasico;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hola");

		Persona p1 = new Persona("Tony", "Stark", 18, "Masculino");
		Persona p2 = new Persona("Maria", "Hernandez", 30, "Femenino");
		
		p1 = p2; //Los objeto apuntan a la misma referencia de memoria
		
		System.out.println(p1.getNombre() + " " + p1.getApellido() + " " + p1.getEdad() + " "+ p1.getGenero());
		
		p1.setNombre("Paciencia");
		
		System.out.println(p1.getNombre() + " " + p1.getApellido() + " " + p1.getEdad() + " "+ p1.getGenero());
		
		System.out.println("----String es un Objeto----");
		
		String v1 = "hola";//Misma referencia
		String v2 = "hola";
		String v3 = new String("hola"); //Referencia distinta
		
		
	}

}
