package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class MainSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String opcion;
		
		do {
			System.out.println("Escoja la opcion: ");	
			System.out.println("1. Realizar transferencia: ");
			System.out.println("2. Consultar pagos: ");
			System.out.println("3. SALIR: ");
			opcion=teclado.nextLine();
			
			switch(opcion) {
			case "1":
				System.out.println("Ingresar numero de cuenta: ");
				System.out.println();
				break;
			case "2":
				System.out.println("No existen pagos ");
				break;
			case "3":
				System.out.println("Cerrando el sistema ");
				break;
			default:
				System.out.println("No ha elejido ninguna opcion valida");
				break;
			}
			
		}while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");
	}
}
