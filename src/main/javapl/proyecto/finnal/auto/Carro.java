package proyecto.finnal.auto;

public class Carro {
	
	private String placaAuto;
	private String modeloAuto;
	private String marcaAuto;
	private String añoAuto;
	private String estadoAuto;
	private String fechaEntregaAuto;
	
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
	
	public String getEstadoAuto() {
		return estadoAuto;
	}
	public void setEstadoAuto(String estadoAuto) {
		this.estadoAuto = estadoAuto;
	}
	
	public String getFechaEntregaAuto() {
		return fechaEntregaAuto;
	}
	public void setFechaEntregaAuto(String fechaEntregaAuto) {
		this.fechaEntregaAuto = fechaEntregaAuto;
	}
	@Override
	public String toString() {
		return "Auto: [Placa: " + placaAuto + "- Modelo: " + modeloAuto + "- Marca: " + marcaAuto
				+ "- Año: " + añoAuto + "- Estado: " + estadoAuto + "- Fecha de entrega: " + fechaEntregaAuto
				+ "]";
	}
	
	

}
