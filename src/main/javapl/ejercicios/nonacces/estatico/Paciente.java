package ejercicios.nonacces.estatico;

public class Paciente {
	
	private String nombre;
	private int edad;
	
	private static String nacionalidad="Ecuatoriano";
	private static int edadLimite=65;
	
	public void registrar(String nombre) {
		System.out.println("Paciente "+nombre+" registrado");
	}
	
	public static void consultarNacionalidad() {
		System.out.println("Nacionalidad del paciente: "+nacionalidad);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int i) {
		this.edad = i;
	}
	public static String getNacionalidad() {
		return nacionalidad;
	}
	public static void setNacionalidad(String nacionalidad) {
		Paciente.nacionalidad = nacionalidad;
	}
	public static int getMesesAnio() {
		return mesesAnio;
	}
	public static void setMesesAnio(int mesesAnio) {
		Paciente.mesesAnio = mesesAnio;
	}
	public static int getEdadLimite() {
		return edadLimite;
	}
	public static void setEdadLimite(int edadLimite) {
		Paciente.edadLimite = edadLimite;
	}
	
	

}
