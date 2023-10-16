import java.util.Scanner;

public class funcoes_matematicas_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
// Exercicio 01
		
		int a,b,sum;
		
		System.out.println("Enter with first number: ");
		a = sc.nextInt();
		
		System.out.println("Enter with second number: ");
		b = sc.nextInt();
		
		sum = (a+b);
		
		System.out.println("Sum = "+sum);
		
		sc.close();

	}

}
