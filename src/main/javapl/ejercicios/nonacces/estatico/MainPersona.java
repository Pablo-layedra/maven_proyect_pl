package ejercicios.nonacces.estatico;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente paciente1=new Paciente();
		paciente1.setNombre("Juan Carlos Bodoque");
		paciente1.setEdad(40);
		
		paciente1.registrar(paciente1.getNombre());
		Paciente.consultarNacionalidad();

	}
}
