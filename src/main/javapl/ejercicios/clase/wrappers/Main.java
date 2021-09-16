package ejercicios.clase.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte datoByte=2;
		//Byte Wrapper
		Byte byteWrapper=3;
		System.out.println("Dato primitivo: "+datoByte);
		System.out.println("Dato wrapper: "+byteWrapper);
		//conversion
		byte byteConvertir=6;
		Byte byteConvertido=byteConvertir;
		System.out.println("Byte convertido: "+byteConvertido);
		//conversion 2 
		Byte byteConvertir2=6;
		byte byteConvertido2=byteConvertir2.byteValue();
		System.out.println("byte convertido 2: "+byteConvertido2);
		
		short datoShort=1;
		//Short Wrapper
		Short shortWrapper=1;
		System.out.println("Dato primitivo: "+datoShort);
		System.out.println("Dato wrapper: "+shortWrapper);
		//conversion
		short shortConvertir=1;
		Short shortConvertido=shortConvertir;
		System.out.println("Short convertido: "+shortConvertido);
		//conversion2
		Short shortConvertir2=6;
		short shortConvertido2=shortConvertir2.shortValue();
		System.out.println("short convertido 2: "+shortConvertido2);
		
		int edad=45;
		//int Wrapper
		Integer edadWrapper=48;
		System.out.println("Dato primitivo: "+edad);
		System.out.println("Dato wrapper: "+edadWrapper);
		//conversion
		int intConvertir=45;
		Integer intConvertido=intConvertir;
		System.out.println("Integer convertido: "+intConvertido);
		//conversion2
		Integer intConvertir2=23;
		int intConvertido2=intConvertir2.intValue();
		System.out.println("int convertido 2: "+intConvertido2);
		
		long datoLong=1255340;
		//long Wrapper
		Long longWrapper=125340L;
		System.out.println("Dato primitivo: "+datoLong);
		System.out.println("Dato wrapper: "+longWrapper);
		//conversion
		long longConvertir=4500000;
		Long longConvertido=longConvertir;
		System.out.println("Long convertido: "+longConvertido);
		//conversion2
		Long longConvertir2=235000000L;
		long longConvertido2=longConvertir2.longValue();
		System.out.println("boolean convertido 2: "+longConvertido2);
		
		boolean datoBoolean=true;
		//boolean Wrapper
		Boolean booleanWrapper=true;
		System.out.println("Dato primitivo: "+datoBoolean);
		System.out.println("Dato wrapper: "+booleanWrapper);
		//convertir
		boolean booleanConvertir=false;
		Boolean booleanConvertido=booleanConvertir;
		System.out.println("Boolean convertido: "+booleanConvertido);
		//convertir2
		Boolean booleanConvertir2=true;
		boolean booleanConvertido2=booleanConvertir2.booleanValue();
		System.out.println("boolean convertido 2: "+booleanConvertido2);
		
		char datoChar='A';
		//char Wrapper
		Character charWrapper='A';
		System.out.println("Dato primitivo: "+datoChar);
		System.out.println("Dato wrapper: "+charWrapper);
		//convertir
		char charConvertir='B';
		Character charConvertido=charConvertir;
		System.out.println("Character convertido: "+charConvertido);
		//convertir2
		Character charConvertir2='C';
		char charConvertido2=charConvertir2.charValue();
		System.out.println("char convertido 2: "+charConvertido2);
		
		double datoDouble=125.30;
		//double Wrapper
		Double doubleWrapper=125.30;
		System.out.println("Dato primitivo: "+datoDouble);
		System.out.println("Dato wrapper: "+doubleWrapper);
		//convertir
		double doubleConvertir=125.30;
		Double doubleConvertido=doubleConvertir;
		System.out.println("Double convertido: "+doubleConvertido);
		//convertir2
		Double doubleConvertir2=125.30;
		double doubleConvertido2=doubleConvertir2.doubleValue();
		System.out.println("double convertido 2: "+doubleConvertido2);
		
		float datoFloat=150.25F;
		//float Wrapper
		Float floatWrapper=125.30F;
		System.out.println("Dato primitivo: "+datoFloat);
		System.out.println("Dato wrapper: "+floatWrapper);
		//convertir
		float floatConvertir=125.30F;
	    Float floatConvertido=floatConvertir;
		System.out.println("Float convertido: "+floatConvertido);
		//convertir2
		Float floatConvertir2=125.30F;
		float floatConvertido2=floatConvertir2.floatValue();
		System.out.println("float convertido 2: "+floatConvertido2);
		
	}

}
