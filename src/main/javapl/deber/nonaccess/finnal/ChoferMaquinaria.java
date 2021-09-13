package deber.nonaccess.finnal;

public class ChoferMaquinaria extends Chofer{
	
	protected void manejarVehiculo(){
		System.out.println("Vehiculo a manejar: Tractor");
		
	}
	
	protected void pagarSalario() {
		salario=1500;
		
		//error debido a que el método es final
	}
}
