package deber.busqueda;

import java.util.Arrays;
import java.util.Scanner;

public class MainBusqueda extends Estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);

		System.out.println("*************************************");
		System.out.println("");
		System.out.println("       1. Ingresar estudiante");
		System.out.println("       2. Buscar estudiante");
		System.out.println("       3. SALIR");
		System.out.println("");
		System.out.println("*************************************");

		int num = teclado.nextInt();
		int numEstudiante = (-1);

		Estudiante[] datosCedula = new Estudiante[5];

		while (num == 1) {
			System.out.println("Ingresar cédula del estudiante");
			String cedula = teclado2.nextLine();
			numEstudiante = numEstudiante + 1;

			Estudiante cedulaEstudiante = new Estudiante();
			cedulaEstudiante.setCedula(cedula);

			datosCedula[numEstudiante] = cedulaEstudiante;

			System.out.println("*************************************");
			System.out.println("");
			System.out.println("       1. Ingresar estudiante");
			System.out.println("       2. Buscar estudiante");
			System.out.println("       3. SALIR");
			System.out.println("");
			System.out.println("*************************************");

			num = teclado.nextInt();

			while (num == 2) {
				System.out.println("Buscar cedula de estudiante");
				String cedula2 = teclado2.nextLine();

				boolean comparacion = false;

				for (int i = 0; i < 5; i++) {
					Estudiante cedulaComparar = datosCedula[i];
					String cedula1 = cedulaComparar.getCedula();
					boolean comparacionLocal = cedula1.equals(cedula2);

					if (comparacionLocal == true) {
						comparacion = true;
					}

				}
				if (comparacion == true) {
					System.out.println("Estudiante registrado");
					System.out.println("*************************************");
					System.out.println("");
					System.out.println("       1. Ingresar estudiante");
					System.out.println("       2. Buscar estudiante");
					System.out.println("       3. SALIR");
					System.out.println("");
					System.out.println("*************************************");

				} else {
					System.out.println("Estudiante no registrado");
					System.out.println("*************************************");
					System.out.println("");
					System.out.println("       1. Ingresar estudiante");
					System.out.println("       2. Buscar estudiante");
					System.out.println("       3. SALIR");
					System.out.println("");
					System.out.println("*************************************");
				}
				num = teclado.nextInt();
				if (num == 3) {
					System.out.println("Saliendo del sistema");
				}
			}
		}
	}

	@Override
	public String toString() {
		return "MainBusqueda [cedula=" + cedula + "]";
	}

}
