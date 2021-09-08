package ejercicios.variables.locales.globales;

import java.util.Scanner;

public class MainVariablesEstaticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		int C=teclado.nextInt();
		
		VariableEstatica estudiante1=new VariableEstatica();
		estudiante1.setNombre("Nombre1");
		estudiante1.setCedula(C);
		System.out.println("Pais: "+VariableEstatica.pais);
		System.out.println("Pais: "+VariableEstatica.provincia);
		
		VariableEstatica estudiante2=new VariableEstatica();
		estudiante1.setNombre("Nombre2");
		estudiante2.setCedula(C);
		System.out.println("Pais: "+VariableEstatica.pais);
		System.out.println("Pais: "+VariableEstatica.provincia);
		
		VariableEstatica estudiante3=new VariableEstatica();
		estudiante1.setNombre("Nombre3");
		estudiante3.setCedula(C);
		System.out.println("Pais: "+VariableEstatica.pais);
		System.out.println("Pais: "+VariableEstatica.provincia);
		
		VariableEstatica estudiante4=new VariableEstatica();
		estudiante1.setNombre("Nombre4");
		estudiante4.setCedula(C);
		System.out.println("Pais: "+VariableEstatica.pais);
		System.out.println("Pais: "+VariableEstatica.provincia);

	}

}
