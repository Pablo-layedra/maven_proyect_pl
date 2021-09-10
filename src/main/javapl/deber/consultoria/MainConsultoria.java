package deber.consultoria;

import java.util.Arrays;
import java.util.Scanner;

public class MainConsultoria extends Paciente{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("*************************************");
		System.out.println("");
		System.out.println("       1. Registrar paciente");
		System.out.println("       2. Imprimir reporte");
		System.out.println("       3. SALIR");
		System.out.println("");
		System.out.println("*************************************");
		
		int num = teclado.nextInt();
		System.out.println("Ingresar cantidad de pacientes en el día");
		
		int numPacientes = teclado.nextInt();
		int NP=(-1);
		
		Paciente[] pacientes=new Paciente[numPacientes];
		
		while (num==1) {
		
			System.out.println("Ingresar nombre del paciente");
			String nombre = teclado.nextLine();
			System.out.println("Ingresar apellido del paciente");
			String apellido = teclado.nextLine();
			System.out.println("Ingresar edad del paciente");
			int edad = teclado.nextInt();
			System.out.println("Ingresar sintoma del paciente");
			String sintoma = teclado.nextLine();
			
			NP=NP+1;
			
			Paciente paciente=new Paciente();
			paciente.setNombre(nombre);
			paciente.setApellido(apellido);
			paciente.setEdad(edad);
			paciente.setSintoma(sintoma);
			
			pacientes[NP]=paciente;
			
			System.out.println("*************************************");
			System.out.println("");
			System.out.println("       1. Registrar paciente");
			System.out.println("       2. Imprimir reporte");
			System.out.println("       3. SALIR");
			System.out.println("");
			System.out.println("*************************************");
			
			num = teclado.nextInt();
			
			while (num==2){
				
				Arrays.sort(pacientes);
				
				System.out.println(Arrays.toString(pacientes));
				
				System.out.println("*************************************");
				System.out.println("");
				System.out.println("       1. Registrar paciente");
				System.out.println("       2. Imprimir reporte");
				System.out.println("       3. SALIR");
				System.out.println("");
				System.out.println("*************************************");
				
				num = teclado.nextInt();
				
				if (num==3) {
					System.out.println("SALIENDO DEL SISTEMA");
				}
			}
		}

	}

}
