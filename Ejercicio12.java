/**Este programa calcula la nota necesaria del segundo examen 
 * para tener la media deseada.
AmandaNR*/
import java.util.Scanner;

public class Ejercicio12 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la nota del primer examen: ");
		double nota1Examen = s.nextDouble();
		System.out.print("¿Que nota final quieres obtener?: ");
		double notaFinal = s.nextDouble();
		
		double nota2Examen;
		nota2Examen = 2 * notaFinal - nota1Examen;
		
		System.out.print("Para obtener un "+ notaFinal +" tienes que sacar un "+ nota2Examen +" en el segundo examen");
	
	}
}
