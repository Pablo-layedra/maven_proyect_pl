package ejercicios.clase.string;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//contains
		
		
		String frase="Al que madruga Dios le ayuda";
		Scanner teclado=new Scanner(System.in);

		String palabra= teclado.nextLine();
		
	    boolean resultado=frase.contains(palabra);
	    System.out.println(resultado);
	    
	    boolean resultado2=frase.contains(palabra);
	    System.out.println(resultado2);
	    
	    boolean resultado3=frase.contains(palabra);
	    System.out.println(resultado3);

	    
	    //equals
	    System.out.println();
	    System.out.println();
	    System.out.println("Ingresar frase 1");
	    String cadena1=teclado.nextLine();
	    System.out.println("Ingresar frase 2");
	    String cadena2=teclado.nextLine();
	    
	    boolean comparacion=cadena1.equals(cadena2);
	    
	    System.out.println(comparacion);
	    
	    //Upper & Lower
	    
	    System.out.println();
	    System.out.println();
	    System.out.println("Ingresar nombre en minusculas");
	    
	    String nombreMin1=teclado.nextLine();
	    String nombreMay=nombreMin1.toUpperCase();
	    
	    System.out.println(nombreMay);
	    
	    System.out.println("Ingresar nombre en mayusculas");
	    String nombreMay1=teclado.nextLine();
	    String nombreMin=nombreMay1.toLowerCase();
	    
	    System.out.println(nombreMin);
	}

}
