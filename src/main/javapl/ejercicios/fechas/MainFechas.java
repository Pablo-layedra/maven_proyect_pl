package ejercicios.fechas;

import java.time.LocalDate;
import java.util.Date;

public class MainFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date=new Date(); //sistema deprecado
		
		LocalDate today= LocalDate.now();//fecha actual
		LocalDate finalDay= today.plusDays(15);//fecha final
		
		CursoVacacional curso=new CursoVacacional();
		curso.setNombreCurso("Voley");
		curso.setFechaInicio(today);
		curso.setFechaFin(finalDay);
		
		System.out.println("Nombre curso: "+curso.getNombreCurso());
		System.out.println("Fecha de inicio "+ curso.getFechaInicio());
		System.out.println("Fecha de fin "+ curso.getFechaFin());
		
		
		LocalDate today2= LocalDate.now();//fecha actual
		LocalDate previousDays2= today2.minusDays(2);//fecha anterior
		LocalDate finalDay2=previousDays2.plusDays(20);
		
		CursoVacacional curso2=new CursoVacacional();
		curso2.setNombreCurso("Voley");
		curso2.setFechaInicio(previousDays2);
		curso2.setFechaFin(finalDay2);
		
		System.out.println("Nombre curso: "+curso2.getNombreCurso());
		System.out.println("Fecha de inicio "+ curso2.getFechaInicio());
		System.out.println("Fecha de fin "+ curso2.getFechaFin());
		
		LocalDate fechaEspecInicio= LocalDate.of(2022, 2, 15);
		LocalDate fechaEspecFin= LocalDate.of(2022, 7, 10);
		
		CursoVacacional curso3=new CursoVacacional();
		curso3.setNombreCurso("Voley");
		curso3.setFechaInicio(fechaEspecInicio);
		curso3.setFechaFin(fechaEspecFin);
		
		LocalDate fechaVista= curso3.getFechaFin();
		LocalDate nuevaFecha=fechaVista.plusDays(3);
		
		curso3.setFechaFin(nuevaFecha);
		System.out.println("Nombre curso: "+curso3.getNombreCurso());
		System.out.println("Fecha de inicio "+ curso3.getFechaInicio());
		System.out.println("Fecha de fin "+ curso3.getFechaFin());
	}
}
