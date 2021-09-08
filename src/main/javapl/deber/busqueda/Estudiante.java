package deber.busqueda;

public class Estudiante {
	

	public String cedula;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + "]";
	}
	
	

}
