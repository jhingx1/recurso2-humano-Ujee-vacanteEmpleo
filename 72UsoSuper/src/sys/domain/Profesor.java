package sys.domain;

public class Profesor extends Persona {

	private String especialidad;
	private String cedulaProfesional;
	
	public Profesor(String especialidad,String cedulaProfesional,String nombre){
		super(nombre);
		this.especialidad = especialidad;
		this.cedulaProfesional = cedulaProfesional;
	}
	
	public Profesor(String especialidad,String cedulaProfesional,String nombre,int edad){
		super(edad,nombre);
		this.setEspecialidad(especialidad);
		this.setCedulaProfesional(cedulaProfesional);
	}
	
	public Profesor(String especialidad,String cedulaProfesional,String areaLimpiesa,int edad,String nombre,String sexo){
		super(edad,nombre,sexo);
		//Para asignar los atributos
		this.setEspecialidad(especialidad);
		this.setCedulaProfesional(cedulaProfesional);
	}
	
	public void muestraInfoProfesor(){
		System.out.println();
		System.out.println("----INFORMACION PROFESOR------");
		System.out.println("Escuela : " + Persona.getNombreEscuela());
		System.out.println("Cedula de Profesor " + this.getCedulaProfesional());
		System.out.println("Especialidad de Profesor " + this.getEspecialidad());
		System.out.println("Nombre " + this.getNombre());
		System.out.println("Edad " + this.getEdad());
		System.out.println("Sexo " + this.getSexo());
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}
	
	
	
}
