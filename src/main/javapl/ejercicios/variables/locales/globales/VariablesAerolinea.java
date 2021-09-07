package ejercicios.variables.locales.globales;

public class VariablesAerolinea {
	
	//Variables globales
	private String aerolinea;
	private String nombrePasajero;
	private int numeroAsiento;
	
	
	
	//Variables locales
	public void impresión() {
		this.aerolinea="Fly Emirates";
		this.nombrePasajero="Esteban";
		this.numeroAsiento=(25);
		System.out.println(aerolinea);
		System.out.println(nombrePasajero);
		System.out.println(numeroAsiento);
		}

}
