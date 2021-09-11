package ejercicios.nonaccess.finnal;

public final class EstudianteCiencias extends Estudiante{
	
	private String velocidadInternet;
	
	public final String horarioDeEntrada="08:00";
	public String ciudadNatal="Quito";
	
	public EstudianteCiencias() {
		
		//No se puede reasignar un valor final
		horarioDeEntrada="08:15";
		ciudadNatal="Guayaqui";
		
	}

}
