package sys.domain;

public class Intendente extends Persona{

	private String areaLimpiesa;
	
	public Intendente(){
		
	}
	
	public Intendente(String areaLimpiesa,String nombre,int edad,String sexo){
		//Para asignar los atributos
		this.setAreaLimpiesa(areaLimpiesa);//this : llama a la clase herrada
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setSexo(sexo);
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
