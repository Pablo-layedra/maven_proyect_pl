package proyecto.finnal.auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import deber.busqueda.Estudiante;

public class MainReservaAlquilerAutos extends Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String opcion1;
		String opcion2;

		Carro carro1 = new Carro();
		carro1.setPlacaAuto("PSG-1500");
		carro1.setModeloAuto("Aveo");
		carro1.setMarcaAuto("Chevrolet");
		carro1.setAñoAuto("2015");
		carro1.setEstadoAuto("Disponible");
		carro1.setFechaEntregaAuto(null);

		Carro carro2 = new Carro();
		carro2.setPlacaAuto("PJY-6520");
		carro2.setModeloAuto("Grand Vitara");
		carro2.setMarcaAuto("Chevrolet");
		carro2.setAñoAuto("2018");
		carro2.setEstadoAuto("Disponible");
		carro2.setFechaEntregaAuto(null);

		Carro carro3 = new Carro();
		carro3.setPlacaAuto("PPS-174");
		carro3.setModeloAuto("850");
		carro3.setMarcaAuto("Volvo");
		carro3.setAñoAuto("1999");
		carro3.setEstadoAuto("Reservado");
		carro3.setFechaEntregaAuto("15/10/2021");

		Carro carro4 = new Carro();
		carro4.setPlacaAuto("APR-1770");
		carro4.setModeloAuto("Fiesta");
		carro4.setMarcaAuto("Ford");
		carro4.setAñoAuto("2004");
		carro4.setEstadoAuto("Alquilado");
		carro4.setFechaEntregaAuto("24/09/2021");

		Carro carro5 = new Carro();
		carro5.setPlacaAuto("PWI-9480");
		carro5.setModeloAuto("Arteon");
		carro5.setMarcaAuto("Wolkswagen");
		carro5.setAñoAuto("2018");
		carro5.setEstadoAuto("Reservado");
		carro5.setFechaEntregaAuto("27/09/2021");

		Carro carro6 = new Carro();
		carro6.setPlacaAuto("MLR-886");
		carro6.setModeloAuto("i10 Sedan");
		carro6.setMarcaAuto("Hyundai");
		carro6.setAñoAuto("2020");
		carro6.setEstadoAuto("Disponible");
		carro6.setFechaEntregaAuto(null);

		List<Carro> cantidadCarros = new ArrayList<Carro>();
		cantidadCarros.add(carro1);
		cantidadCarros.add(carro2);
		cantidadCarros.add(carro3);
		cantidadCarros.add(carro4);
		cantidadCarros.add(carro5);
		cantidadCarros.add(carro6);

		do {
			System.out.println("*************************************");
			System.out.println("METROCARD: ALQUILER Y RESERVA DE AUTOS");
			System.out.println();
			System.out.println("Seleccionar tipo de usuario: ");
			System.out.println();
			System.out.println("          1. Cliente");
			System.out.println("          2. Empleado");
			System.out.println("          3. SALIR");
			System.out.println("");
			System.out.println("*************************************");
			opcion1 = teclado.nextLine();

			switch (opcion1) {
			case "1":
				System.out.println("Seleccione acción que desea realizar: ");
				System.out.println("a: Consultar lista de autos ");
				System.out.println("b: Reservar auto ");
				String opcion1C = teclado.nextLine();
				if (opcion1C.equals("a")) {
					System.out.println("Ingresar modelo o marca del auto");
					String autoEscrito = teclado.nextLine();

					boolean comparacion = false;

					for (int i = 0; i < cantidadCarros.size(); i++) {
						Carro carroComparar = cantidadCarros.get(i);
						String carroExistente = carroComparar.getModeloAuto();
						boolean comparacionLocal = autoEscrito.equals((carroExistente));

						if (comparacionLocal == true) {
							comparacion = true;
							System.out.println();
							System.out.println(cantidadCarros.get(i));
						}else {
							
						}
					}
					
					for (int i = 0; i < cantidadCarros.size(); i++) {
						Carro carroComparar = cantidadCarros.get(i);
						String carroExistente = carroComparar.getMarcaAuto();
						boolean comparacionLocal = autoEscrito.equals((carroExistente));

						if (comparacionLocal == true) {
							comparacion = true;
							System.out.println();
							System.out.println(cantidadCarros.get(i));
						}else {
							
						}
					}

				} else if (opcion1C.equals("b")) {

				}

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
		} while (!opcion1.equals("3"));
	}
}
