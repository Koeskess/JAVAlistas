package lista3;

import java.util.Scanner;

public class Exercicio4_3Dolar_real {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		float quantidade;
		float cotacao;
		float converter;

		System.out.println("Informe a cota��o do d�lar: ");
		cotacao = obj.nextFloat();
		
		System.out.println("Informe quantos reais voc� possui: ");
		quantidade = obj.nextFloat();
		
		converter= quantidade/cotacao;
		
		System.out.printf("O valor da convers�o �: %.2f", converter);
		obj.close();

	}
}
