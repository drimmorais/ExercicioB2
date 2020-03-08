import java.util.Scanner;

public class Conversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o valor do produto: xx,xx: ");
		double valor = entrada.nextDouble();
		int valor2 = (int)valor;
		
		int valor3 = 10;
		double valor4 = (double) valor3;
		
		double valor5 = 10.0;
		int valor6 = (int) valor5;
		
		System.out.println("Valor com casas decimais: " + valor + " | Valor inteiro: " + valor2);
		System.out.println("Novo: " + valor3 + " | Convertido: " + valor4 );
		System.out.println("Convertido: " + valor6 );
		
		
	}
}
