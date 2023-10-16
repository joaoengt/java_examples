import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		String x;
		int y;
		double z;
		char a;
		char fim;
		
// Inserir string
		System.out.print("Enter the string: ");
		x = sc.nextLine();
		
// Inserir numero inteiro
		System.out.print("Enter the internal number: ");
		y = sc.nextInt();
		
//Inserir numero fracionado		
		System.out.print("Enter the float number: ");
		z = sc.nextDouble();
		
//Inserir char		
		System.out.print("Enter the char: ");
		a = sc.next().charAt(0);
		
		System.out.println();
		System.out.println("Os dados digitados foram:");
		System.out.println("You entered the string: "+x);
		System.out.println("You entered the internal number: "+y);
		Locale.setDefault(Locale.US);
		System.out.println("You entered the float number: "+z);
		System.out.println("You entered the chat: "+a);

	

		sc.close();
	}

}
