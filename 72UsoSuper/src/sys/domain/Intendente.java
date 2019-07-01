package sys.domain;

public class Intendente extends Persona{

	private String areaLimpiesa;
	
	public Intendente(String areaLimpiesa,String nombre){
		super(nombre);
		this.areaLimpiesa = areaLimpiesa;
	}
	
	public Intendente(String areaLimpiesa,String nombre,int edad){
		super(edad,nombre);
		this.setAreaLimpiesa(areaLimpiesa);
	}
	
	public Intendente(String areaLimpiesa,int edad,String nombre,String sexo){
		super(edad,nombre,sexo);
		//Para asignar los atributos
		this.setAreaLimpiesa(areaLimpiesa);//this : llama a la clase herrada		
	}
	
	public void muestraInfoIntendente(){
		System.out.println();
		System.out.println("----INFORMACION INTENDENTE------");
		System.out.println("Escuela : " + Persona.getNombreEscuela());
		System.out.println("Clave de Limpiesa " + this.getAreaLimpiesa());
		System.out.println("Nombre " + this.getNombre());
		System.out.println("Edad " + this.getEdad());
		System.out.println("Sexo " + this.getSexo());
	}

	public String getAreaLimpiesa() {
		return areaLimpiesa;
	}

	public void setAreaLimpiesa(String areaLimpiesa) {
		this.areaLimpiesa = areaLimpiesa;
	}
	
}
