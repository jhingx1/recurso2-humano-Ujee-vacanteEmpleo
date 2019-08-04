package Clases;

public class Agenda {
	
	private String edad;
	private String nombre;
	private String telefono;
	
	public Agenda(String edad, String nombre, String telefono) {		
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/*
	public boolean equals(Object obj){
		if(obj instanceof Agenda){
			Agenda  parametroObj = (Agenda)obj;
			if(this.getTelefono() == parametroObj.telefono){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	
}
