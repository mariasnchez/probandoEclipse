package prueba;

public class main {
	
	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("¡HOLA!");
		System.out.println("ESTA APP MUESTRA LOS DATOS DE VENTA");
		System.out.println("SE HA SUBIDO");
	}
	
}
