package deber.nonaccess.finnal;

public class Chofer extends Trabajador{
	
	private int salario;
	private final String horasDeTrabajo="8";
	
	protected void manejarVehiculo() {
		System.out.println("Vehiculo a manejar: carro");
		
	}
	protected final void pagarSalario() {
		salario=1000;
		
	}
	
	public Chofer() {
		horasDeTrabajo=6;
		//error debido a que el atributo es final
	}
}
