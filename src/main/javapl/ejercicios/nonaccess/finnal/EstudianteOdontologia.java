package ejercicios.nonaccess.finnal;

public class EstudianteOdontologia extends EstudianteMedicina{
	
	protected void realizarPracticas(){
		
		//no se puede seobreescribir un metodo final del padre
		System.out.println("Realizar 100 horas de practicas");
	}
	
	protected void realizarPasantias() {
		System.out.println("realizar 150 horas de pasantias");
	}
}
