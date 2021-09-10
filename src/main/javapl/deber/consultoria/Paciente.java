package deber.consultoria;

public class Paciente {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String sintoma;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		
		if (this.edad< o.getEdad()) {
			return -1;
		}else if (this.edad==o.getEdad()) {
			return 0;
		}else{
			return (1);
		}
	}	
	
	@Override
	public String toString() {
		return "Paciente [nombre:" + nombre + ", apellido:" + apellido + ", edad:" + edad + ", sintoma:" + sintoma
				+ "]";
	}

}
