package lista1;

import java.util.Scanner;

public class Exercicio3_1 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int soma;
		
		System.out.println("Informe um n�mero: ");
		num1 = sc.nextInt();
		
		System.out.println("Informe um n�mero: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		System.out.println("A soma dos n�meros informados �: " + soma);
		
		sc.close();
	}
}
