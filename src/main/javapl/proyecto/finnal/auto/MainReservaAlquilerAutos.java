package proyecto.finnal.auto;

import java.util.ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import deber.busqueda.Estudiante;

public class MainReservaAlquilerAutos extends Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		Scanner teclado4 = new Scanner(System.in);
		String opcion1;
		String opcion2;

		List<Carro> cantidadCarros = new ArrayList<Carro>();
		List<Cliente> reservaCliente = new ArrayList<Cliente>();

		LocalDate today = LocalDate.now();
		System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		LocalDate diaDeEntrega = today.plusDays(2);
		System.out.println(diaDeEntrega.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		LocalDate diaDisponibilidad = diaDeEntrega.plusDays(1);
		System.out.println(diaDisponibilidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

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
		carro3.setFechaEntregaAuto(diaDeEntrega);
		// Reserva de cliente
		Cliente cliente1 = new Cliente();
		cliente1.setCedula("1709609505");
		cliente1.setCarro(carro3);

		Carro carro4 = new Carro();
		carro4.setPlacaAuto("APR-1770");
		carro4.setModeloAuto("Fiesta");
		carro4.setMarcaAuto("Ford");
		carro4.setAñoAuto("2004");
		carro4.setEstadoAuto("Alquilado");
		carro4.setFechaEntregaAuto(diaDeEntrega);
		// ReservaCliente
		Cliente cliente2 = new Cliente();
		cliente2.setCedula("175693544");
		cliente2.setCarro(carro4);

		Carro carro5 = new Carro();
		carro5.setPlacaAuto("PWI-9480");
		carro5.setModeloAuto("Arteon");
		carro5.setMarcaAuto("Wolkswagen");
		carro5.setAñoAuto("2018");
		carro5.setEstadoAuto("Reservado");
		carro5.setFechaEntregaAuto(diaDeEntrega);
		// Reserva de Cliente
		Cliente cliente3 = new Cliente();
		cliente3.setCedula("1755693579");
		cliente3.setCarro(carro5);

		Carro carro6 = new Carro();
		carro6.setPlacaAuto("MLR-886");
		carro6.setModeloAuto("i10 Sedan");
		carro6.setMarcaAuto("Hyundai");
		carro6.setAñoAuto("2020");
		carro6.setEstadoAuto("Disponible");
		carro6.setFechaEntregaAuto(null);

		cantidadCarros.add(carro1);
		cantidadCarros.add(carro2);
		cantidadCarros.add(carro3);
		cantidadCarros.add(carro4);
		cantidadCarros.add(carro5);
		cantidadCarros.add(carro6);

		reservaCliente.add(cliente1);
		reservaCliente.add(cliente2);
		reservaCliente.add(cliente3);

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
				System.out.println();
				System.out.println("a: Consultar lista de autos ");
				System.out.println("b: Reservar auto ");
				String opcion1C = teclado.nextLine();
				if (opcion1C.equals("a")) {
					System.out.println("Ingresar modelo o marca del auto");
					String autoEscrito = teclado2.nextLine();

					boolean comparacion = false;

					for (int i = 0; i < cantidadCarros.size(); i++) {
						Carro carroComparar = cantidadCarros.get(i);
						String carroExistente = carroComparar.getModeloAuto();
						boolean comparacionLocal = autoEscrito.equals((carroExistente));

						if (comparacionLocal == true) {
							comparacion = true;
							System.out.println();
							System.out.println(cantidadCarros.get(i));
						} else {

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
						} else {

						}
					}

				} else if (opcion1C.equals("b")) {
					System.out.println("Ingresar placa del auto (ejemplo PPP-9999)");
					String placaEscrita = teclado2.nextLine();

					System.out.println("Ingresar su cédula: ");
					String cedulaCliente = teclado2.nextLine();

					boolean comparacion = false;

					for (int i = 0; i < cantidadCarros.size(); i++) {
						Carro carroComparar = cantidadCarros.get(i);

						Cliente nuevoCliente = new Cliente();
						nuevoCliente.setCedula(cedulaCliente);
						nuevoCliente.setCarro(carroComparar);

						String carroExistente = carroComparar.getPlacaAuto();
						boolean comparacionLocal = placaEscrita.equals((carroExistente));

						if (comparacionLocal == true) {
							comparacion = true;
							String disponibilidadCarro = carroComparar.getEstadoAuto();
							System.out.println();
							System.out.println("Datos del auto a reservar: ");
							System.out.println(cantidadCarros.get(i));

							if (disponibilidadCarro.equals("Disponible")) {
								cantidadCarros.get(i).setEstadoAuto("Reservado");
								System.out.println();
								System.out.println(
										"Auto reservado exitosamente, favor pasar a retirar el carro en la concesionaria");
								System.out.println();
								cantidadCarros.get(i).setFechaEntregaAuto(diaDeEntrega);
								System.out.println();
								System.out.println("El auto será entregado el dia: " + diaDeEntrega);
								System.out.println(cantidadCarros.get(i));

								reservaCliente.add(nuevoCliente);

							} else {
								System.out.println();
								System.out.println("Auto reservado anteriormente");
								System.out.println("El auto estará disponible para el diá " + diaDisponibilidad);
								System.out.println();
							}

						} else {

						}

					}

				}

				System.out.println();
				break;
			case "2":

				System.out.println("Seleccione acción que desea realizar: ");
				System.out.println();
				System.out.println("a: Ingresar auto ");
				System.out.println("b: Alquilar un auto ");
				System.out.println("c. Aplazar fecha de entrega ");
				String opcion2C = teclado.nextLine();

				switch (opcion2C) {
				case "a":
					System.out.println();
					System.out.println("Ingrese la siguiente información: ");
					System.out.println();
					System.out.println("Ingresar Placa del vehículo: ");
					String placaAuto = teclado3.nextLine();
					System.out.println("Ingresar Modelo del vehículo: ");
					String modeloAuto = teclado3.nextLine();
					System.out.println("Ingresar Marca del auto");
					String marcaAuto = teclado3.nextLine();
					System.out.println("Ingresar Año de fabricacion del auto");
					String añoAuto = teclado3.nextLine();
					System.out.println("Ingresar País de fabricación del auto");
					String paísAuto = teclado3.nextLine();
					System.out.println("Ingresar cilindraje del auto");
					String cilindrajeAuto = teclado3.nextLine();
					System.out.println("Ingresar avalúo (precio) del auto");
					String precioAuto = teclado3.nextLine();

					System.out.println();
					System.out.println("Seleccionar el tipo de auto: ");
					System.out.println("1. Automóvil");
					System.out.println("2. Camioneta");
					int seleccionAuto = teclado4.nextInt();

					Carro nuevoCarro = new Carro();

					if (seleccionAuto == 1) {
						System.out.println();
						System.out.println("Escribir número de puertas del vehiculo: ");
						int numPuertas = teclado4.nextInt();

					} else if (seleccionAuto == 1) {
						System.out.println();
						System.out.println("Escribir peso máximo que soporta el vehiculo: ");
						int pesoAguante = teclado4.nextInt();
					}

					nuevoCarro.setPlacaAuto(placaAuto);
					nuevoCarro.setModeloAuto(modeloAuto);
					nuevoCarro.setMarcaAuto(marcaAuto);
					nuevoCarro.setAñoAuto(añoAuto);
					nuevoCarro.setPaisFabricacionAuto(paísAuto);
					nuevoCarro.setCilindrajeAuto(cilindrajeAuto);
					nuevoCarro.setPrecioAuto(precioAuto);
					nuevoCarro.setEstadoAuto("Disponible");
					nuevoCarro.setFechaEntregaAuto(null);

					System.out.println("La información del auto ha sido guardada exitosamente");

					cantidadCarros.add(nuevoCarro);

					break;
				case "b":
					System.out.println();
					System.out.println("Ingresar placa del auto (ejemplo PPP-9999)");
					String placaEscrita = teclado2.nextLine();

					boolean comparacion = false;

					for (int i = 0; i < cantidadCarros.size(); i++) {
						Carro carroComparar = cantidadCarros.get(i);
						String carroExistente = carroComparar.getPlacaAuto();
						boolean comparacionLocal = placaEscrita.equals((carroExistente));

						if (comparacionLocal == true) {
							comparacion = true;
							String disponibilidadCarro = carroComparar.getEstadoAuto();
							System.out.println();

							if (disponibilidadCarro.equals("Reservado")) {
								
								System.out.println("Datos del auto reservado");
								System.out.println(reservaCliente.get(i));
								System.out.println();
								System.out.println("Escoja la opcion: ");
								System.out.println("Alquilar");
								System.out.println("No alquilar");
								System.out.println();
								String alquiler=teclado3.nextLine();
								
								if (alquiler.equals("Alquilar")) {
									cantidadCarros.get(i).setEstadoAuto("Alquilado");
									System.out.println();
									System.out.println("El auto fue alquilado exitosamente");
									System.out.println("Fecha de entrega del vehiculo: "+cantidadCarros.get(i).getFechaEntregaAuto());
									
								}else if (alquiler.equals("No alquilar")) {
									System.out.println();
									System.out.println("El auto no fue alquilado");
									System.out.println();
								}
							}
						}
					}

					break;
				case "c":
					System.out.println();
					break;
				}
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
