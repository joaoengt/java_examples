import java.util.Locale;
import java.util.Scanner;

public class funcoes_matematicas_03 {

	public static void main(String[] args) {

		int n;
		double hy,h,wage;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Software for Wage Calcule");
		
		System.out.print("Enther the your number: ");
		n = sc.nextInt();
		System.out.println();
		System.out.print("Enther the your hourly wage: ");
		hy = sc.nextDouble();
		System.out.println();
		System.out.print("Enther the hours: ");
		h = sc.nextDouble();
		System.out.println();
		
		wage = hy*h;
		
		System.out.printf("You wage is: %.2f",wage);
		
		sc.close();

		
		
		
	}

}
