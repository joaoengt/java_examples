import java.util.Locale;

public class variaveis {

	public static void main(String[] args) {
		
		int y= 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
// Imprimir valores		
		System.out.println(y);
		System.out.println(x);
		
// Imprimir valores com casas decimais padronizadas
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		
// Imprimir valores com casas decimais padronizadas US

		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);	

// Concatenar vários elementos em um mesmo comando de escrita
		System.out.println("Resultado 01 = " + x + " metros");
		
// Para concatenar vários elementos em um mesmo comando de escrita 
//(%f = ponto flutuante) e (%n = quebra de linha) e (%s = texto) e (%d = inteiro)
		System.out.printf("Resultado 02 = %.2f metros%n",x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);
		
		}

}
