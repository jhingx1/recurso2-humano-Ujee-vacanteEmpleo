package sys.domain;

public class Alumno extends Persona{
	
	/*
	super : para heredar los contructores de los padres.
	Para su uso en el contructor debe de esta primero

	*/
	
	private int numeroAlumno;
	
	public Alumno(int numeroAlumno,String nombre){
		super(nombre);
		this.numeroAlumno = numeroAlumno;
	}
	
	public Alumno(int numeroAlumno,String nombre,int edad){
		super(edad,nombre);
		this.setNumeroAlumno(numeroAlumno);
	}
	
	public Alumno(int numeroAlumno,String nombre,int edad,String sexo){
		super(edad,nombre,sexo);
		this.setNumeroAlumno(numeroAlumno);//this : llama a la clase herrada		
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
