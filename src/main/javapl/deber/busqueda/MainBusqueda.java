package deber.busqueda;

import java.util.Arrays;
import java.util.Scanner;

public class MainBusqueda{
	
	private long cedula;

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("*************************************");
		System.out.println("");
		System.out.println("       1. Ingresar estudiante");
		System.out.println("       2. Buscar estudiante");
		System.out.println("       3. SALIR");
		System.out.println("");
		System.out.println("*************************************");
		
		int num=teclado.nextInt();
		int numEstudiante=(-1);
		
		MainBusqueda [] datosCedula=new MainBusqueda [5];
		
		while (num==1) {
			System.out.println("Ingresar cédula del estudiante");
			long cedula=teclado.nextLong();
		    numEstudiante=numEstudiante+1;
		    
		    MainBusqueda cedulaEstudiante=new MainBusqueda();
		    cedulaEstudiante.setCedula(cedula);

			datosCedula[numEstudiante]=cedulaEstudiante;
			
			System.out.println("*************************************");
			System.out.println("");
			System.out.println("       1. Ingresar estudiante");
			System.out.println("       2. Buscar estudiante");
			System.out.println("       3. SALIR");
			System.out.println("");
			System.out.println("*************************************");
			
			num=teclado.nextInt();
			
			if (num==2) {
				System.out.println(Arrays.toString(datosCedula));
				System.out.println("Buscar cedula de estudiante");
				long cedula2=teclado.nextLong();
				boolean comparacion=datosCedula[0].equals(cedula2);
				boolean comparacion2=datosCedula[1].equals(cedula2);
				boolean comparacion3=datosCedula[2].equals(cedula2);
				boolean comparacion4=datosCedula[3].equals(cedula2);
				boolean comparacion5=datosCedula[4].equals(cedula2);
				System.out.println(comparacion);
				System.out.println(comparacion2);
				System.out.println(comparacion3);
				System.out.println(comparacion4);
				System.out.println(comparacion5);
			}else{
				System.out.println("Saliendo del sistema");
			}
		
		}
		

		
	}

	@Override
	public String toString() {
		return "MainBusqueda [cedula=" + cedula + "]";
	}

}
