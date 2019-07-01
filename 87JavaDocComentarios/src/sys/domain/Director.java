package sys.domain;

public class Director extends Persona{

	private String claveSector;
	
	public Director(){
		
	}
	
	public Director(String claveSector,String nombre,int edad,String sexo){
		//Para asignar los atributos
		this.setClaveSector(claveSector);//this : llama a la clase herrada
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setSexo(sexo);
	}

	public void muestraInfoDirector(){
		System.out.println();
		System.out.println("----INFORMACION DIRECTOR------");
		System.out.println("Escuela : " + Persona.getNombreEscuela());
		System.out.println("Clave de Director " + this.getClaveSector());
		System.out.println("Nombre " + this.getNombre());
		System.out.println("Edad " + this.getEdad());
		System.out.println("Sexo " + this.getSexo());
	}
	
	public String getClaveSector() {
		return claveSector;
	}

	public void setClaveSector(String claveSector) {
		this.claveSector = claveSector;
	}
	
	
	
}
