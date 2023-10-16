import java.util.Locale;
import java.util.Scanner;

public class fucoes_matematicas_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

		double raio,pi = 3.14159, area;
		
		System.out.println("The software will calculate the circule´s area!");
		System.out.println();
		System.out.print("Enter with radiun of the circule: ");
		raio = sc.nextDouble();
		area = pi*Math.pow(raio,2);
			
		System.out.printf("The circule's area is: %.4f",area);

		sc.close();
	}

}
