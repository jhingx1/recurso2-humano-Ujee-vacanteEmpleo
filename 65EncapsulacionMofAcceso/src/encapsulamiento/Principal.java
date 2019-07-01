package encapsulamiento;

public class Principal {

	public static void main(String[] args) {
		
		Profesor objProf = new Profesor();
		/*
		objProf.nombre = "Jean Raul";
		objProf.sueldo = 4000;
		objProf.identificacion = "001";
		*/
		
		objProf.setNombre("Juan");		
		//System.out.println("Nombre : " + objProf.nombre);
		System.out.println("Nombre : " + objProf.getNombre().toUpperCase());
		
	}

}
