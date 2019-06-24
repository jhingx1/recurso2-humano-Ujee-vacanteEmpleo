package switchBreatContinue;

public class SenteciasSwtich {

	public static void main(String[] args) {
	
		SenteciasSwtich sw = new SenteciasSwtich();
		
		sw.imprimeClave();
		sw.diaDeLaSemana();
		
	}
	
	public void diaDeLaSemana(){
		int dia =6;
		switch (dia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5: System.out.println("Este dia es un dia de la semana y no es fin de semana");
			break;
		case 6:
		case 7: System.out.println("Este dia pertenece al fin de Semana");
		default:
			break;
		}
	}
	
	public void imprimeClave(){
		String nombreProducto = "sandia";
		switch (nombreProducto) {
		case "sandia":System.out.println("El producto Sandia tiene el id : 001");			
			break;
		case "melon":System.out.println("El producto melon tiene el id : 002");			
			break;	
		default:
			System.out.println("No ingreso un producto");
			break;
		}
		
	}
	
	public void imprimeProducto(){
		int productoId = 1;
		
		switch (productoId) {
		case 1:System.out.println("El producto tiene el id 1");			
			break;
		case 2:System.out.println("El producto tiene el id 2");			
			break;
		case 3:System.out.println("El producto tiene el id 3");
			break;
		default:
			break;
		}
		
	}

}
