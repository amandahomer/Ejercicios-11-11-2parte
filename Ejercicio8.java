/**Este programa calcula el salario en base a las horas trabajadas.
 * A razon de 12 euros la hora.
AmandaNR*/
import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in); 
		System.out.print("Introduzca las horas trabajadas: ");
		int horas = s.nextInt();
		int euroshora = 12;
		
		int total;
		total = horas * euroshora;
		
		System.out.print("Su salario es: "+ total +" euros");
	
	}
}
