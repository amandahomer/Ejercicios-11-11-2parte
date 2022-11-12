/**Este programa calcula el volumen de un cono.
AmandaNR*/
import java.util.Scanner;

public class Ejercicio9 {

	public static void main (String [] srgs) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el radio y la altura del cono en centimetros separados por un espacio: ");
		double radio = s.nextDouble();
		double altura = s.nextDouble();
		double pi = 3.14;
		
		double total;
		total = (pi * radio * radio * altura) / 3;
		
		System.out.print("El volumen del cono es: "+ total +" cm");
	
	}
}
