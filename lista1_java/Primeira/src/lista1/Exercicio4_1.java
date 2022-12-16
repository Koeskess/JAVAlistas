package lista1;

import java.util.Scanner;

public class Exercicio4_1 {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		int num1;
		int num2;
		int subtracao;
		
		System.out.println("Informe um número: ");
		num1 = obj.nextInt();
		
		System.out.println("Informe um número: ");
		num2 = obj.nextInt();
		
		subtracao = num1 - num2;
		System.out.println("A subtração de: " + num1 + "-" + num2 + " é: " + subtracao);
		
		obj.close();

	}
}
	
