/**Este programa convierte kilobytes en megabytes.
AmandaNR*/
import java.util.Scanner;

public class Ejercicio11 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad de KB: ");
		double kb = s.nextDouble();
		double mb = 1024;
		
		double total;
		total = kb / mb;
		
		System.out.print(kb +" KiloBytes son "+ total +" MegaBytes" );
	
	}
}
