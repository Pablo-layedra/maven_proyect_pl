package ejercicios.nonaccess.finnal;

public class EstudianteMedicina extends Estudiante{
	
	private String codigoMSP;
	
	protected final void realizarPracticas(){
		System.out.println("50 horas de practicas");
	}
	
	protected void realizarPasantias() {
		System.out.println("realizar 150 horas de pasantias");
	}
}
