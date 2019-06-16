package tipoDatos;

public class Byte_short_int_log {
	
	byte miByteValorMin = -127;				//8bits
	byte miByteValorMax = 127;

	short miShotValorMin = -32768;             //16 bits
	short miShotValorMax = 32767;
	
	int miIntValorMin =  -2147483648;             //32 bits
	int miIntValorMax =  2147483647;
	
	long myLongValorMin = -9223372036854775808L;  //64 bits
	long myLongValorMax = -9223372036854775807L;
	
	public void mostrarInformacion(){
		System.out.println("Valor minimo de un byte : " + miByteValorMin + " valor maximo = " + miByteValorMax + " y utiliza 8 bits");
		System.out.println("Valor minimo de un byte : " + miShotValorMin + " valor maximo = " + miShotValorMax + " y utiliza 16 bits");
		System.out.println("Valor minimo de un byte : " + miIntValorMin + " valor maximo = " + miIntValorMax + " y utiliza 32 bits");
		System.out.println("Valor minimo de un byte : " + myLongValorMin + " valor maximo = " + myLongValorMax + " y utiliza 64 bits");		
	}
	
	public static void main(String[] args) {
		
		Byte_short_int_log ejem = new Byte_short_int_log();
		ejem.mostrarInformacion();
		
	}

}
