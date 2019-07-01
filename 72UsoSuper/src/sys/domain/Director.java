package sys.domain;

public class Director extends Persona{

	private String claveSector;
	
	public Director(String claveSector,String nombre){
		super(nombre);
		this.claveSector = claveSector;
	}
	
	public Director(String claveSector,String nombre,int edad){
		super(edad,nombre);
		this.setClaveSector(claveSector);
	}
	
	public Director(String claveSector,int edad,String nombre,String sexo){
		super(edad,nombre,sexo);
		//Para asignar los atributos
		this.setClaveSector(claveSector);//this : llama a la clase herrada		
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
