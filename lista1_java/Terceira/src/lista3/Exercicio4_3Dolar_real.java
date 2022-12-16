package lista3;

import java.util.Scanner;

public class Exercicio4_3Dolar_real {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		float quantidade;
		float cotacao;
		float converter;

		System.out.println("Informe a cotação do dólar: ");
		cotacao = obj.nextFloat();
		
		System.out.println("Informe quantos reais você possui: ");
		quantidade = obj.nextFloat();
		
		converter= quantidade/cotacao;
		
		System.out.printf("O valor da conversão é: %.2f", converter);
		obj.close();

	}
}
