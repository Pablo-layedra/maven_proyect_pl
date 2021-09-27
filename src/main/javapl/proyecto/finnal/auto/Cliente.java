package proyecto.finnal.auto;

public class Cliente extends Carro{
	
	private String nombre;
	private String apellido;
	private String cedula;
	private Carro carro;
	
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "[Placa: " + carro.getPlacaAuto() + "- Modelo: " + carro.getModeloAuto() + "- Estado: "
				+ carro.getEstadoAuto() + "- Fecha de Entrega: " + carro.getFechaEntregaAuto() + "- Reservado por: "+cedula+"]";
	}
	
	
}
