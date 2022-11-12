/**Este programa convierte megabytes en kilobytes.
AmandaNR*/
import java.util.Scanner;

public class Ejercicio10 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la cantidad de MB: ");
		int mb = s.nextInt();
		int kb = 1024;
		
		int total;
		total = mb * kb;
		
		System.out.print(mb +" MegaBytes son "+ total +" KiloBytes" );
	
	}
}
