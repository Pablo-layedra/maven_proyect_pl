package proyecto.finnal.auto;

import java.time.LocalDate;

public class Carro {
	
	private String placaAuto;
	private String modeloAuto;
	private String marcaAuto;
	private String añoAuto;
	private String paisFabricacionAuto;
	private String cilindrajeAuto;
	private String precioAuto;
	private String estadoAuto;
	private LocalDate fechaReservaAuto;
	private LocalDate fechaEntregaAuto;
	
	public String getPrecioAuto() {
		return precioAuto;
	}


	public void setPrecioAuto(String precioAuto) {
		this.precioAuto = precioAuto;
	}

	public String getPlacaAuto() {
		return placaAuto;
	}


	public void setPlacaAuto(String placaAuto) {
		this.placaAuto = placaAuto;
	}


	public String getModeloAuto() {
		return modeloAuto;
	}


	public void setModeloAuto(String modeloAuto) {
		this.modeloAuto = modeloAuto;
	}


	public String getMarcaAuto() {
		return marcaAuto;
	}


	public void setMarcaAuto(String marcaAuto) {
		this.marcaAuto = marcaAuto;
	}


	public String getAñoAuto() {
		return añoAuto;
	}


	public void setAñoAuto(String añoAuto) {
		this.añoAuto = añoAuto;
	}


	public String getPaisFabricacionAuto() {
		return paisFabricacionAuto;
	}


	public void setPaisFabricacionAuto(String paisFabricacionAuto) {
		this.paisFabricacionAuto = paisFabricacionAuto;
	}


	public String getCilindrajeAuto() {
		return cilindrajeAuto;
	}


	public void setCilindrajeAuto(String cilindrajeAuto) {
		this.cilindrajeAuto = cilindrajeAuto;
	}


	public String getEstadoAuto() {
		return estadoAuto;
	}


	public void setEstadoAuto(String estadoAuto) {
		this.estadoAuto = estadoAuto;
	}


	public LocalDate getFechaReservaAuto() {
		return fechaReservaAuto;
	}


	public void setFechaReservaAuto(LocalDate fechaReservaAuto) {
		this.fechaReservaAuto = fechaReservaAuto;
	}


	public LocalDate getFechaEntregaAuto() {
		return fechaEntregaAuto;
	}


	public void setFechaEntregaAuto(LocalDate fechaEntregaAuto) {
		this.fechaEntregaAuto = fechaEntregaAuto;
	}


	@Override
	public String toString() {
		return "Auto: [Placa: " + placaAuto + "- Modelo: " + modeloAuto + "- Marca: " + marcaAuto
				+ "- Año: " + añoAuto + "- Estado: " + estadoAuto + "- Fecha de entrega: " + fechaEntregaAuto
				+ "]";
	}

}
