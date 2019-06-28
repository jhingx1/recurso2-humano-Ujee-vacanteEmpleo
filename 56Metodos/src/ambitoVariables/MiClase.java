package ambitoVariables;

public class MiClase {
	
	private int edad;
	
	static String nacionalidad = "peruano"; //atribulo de clase
	
	public int getEdad(){
		return edad;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public String mayorDeEdad(int ed){
		int faltante;
		faltante = 0;
		System.out.println(edad);//Variable global
		if(ed >= 18)
			return "mayor de edad y tu nacionalidad es : " + nacionalidad;
		else{
			faltante=18-ed;
			return "Te faltan : " + faltante + " para se mayor y tu nacionalidad es :"+ nacionalidad;
		}			
	}
}
