package paquete1;

/*
MODIFICADOR           LA MISMA CLASE      MISMO PAQUETE       SUBCLASE    OTRO PAQUETE
PRIVATE			SI			NO		NO		NO
DEFAULT			SI			SI		NO		NO
PROTECTED		SI			SI 		SI/NO		NO
PUBLIC			SI			SI		SI		SI
*/

public class Clase2Paq1 {
	
	private int var1Clase2Paq1Private =10;
	String var2Clase2Paq1Defautl = "Hola";
	protected int var3Clase2Paq2Portectec = 100;
	public String var4Clase2Paq1Public = "Mi nombre es: ";
	
	public void metodoMismaClase(){
		var1Clase2Paq1Private = 14;
	}
	
	public int getVar1Clase2Paq1Private() {
		return var1Clase2Paq1Private;
	}
	public void setVar1Clase2Paq1Private(int var1Clase2Paq1Private) {
		this.var1Clase2Paq1Private = var1Clase2Paq1Private;
	}
	
}


class HijaClase2Paq1 extends Clase2Paq1{
	public void metodoEjm(){
		//var1Clase2Paq1Private =10;
	}
}