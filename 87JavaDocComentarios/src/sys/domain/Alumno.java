package sys.domain;

/**
 * 
 * @author Mark1
 *
 */

public class Alumno extends Persona{
	
	private int numeroAlumno;
	
	public Alumno(){
		
	}
	
	public Alumno(int numeroAlumno,String nombre,int edad,String sexo){
		//Para asignar los atributos
		this.setNumeroAlumno(numeroAlumno);//this : llama a la clase herrada
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setSexo(sexo);
	}
	
	public void muestraInfoAlumno(){
		System.out.println();
		System.out.println("----INFORMACION ALUMNO------");
		System.out.println("Escuela : " + Persona.getNombreEscuela());
		System.out.println("Numero de alumno " + this.getNumeroAlumno());
		System.out.println("Nombre " + this.getNombre());
		System.out.println("Edad " + this.getEdad());
		System.out.println("Sexo " + this.getSexo());
	}

	public int getNumeroAlumno() {
		return numeroAlumno;
	}

	public void setNumeroAlumno(int numeroAlumno) {
		this.numeroAlumno = numeroAlumno;
	}
	
}
