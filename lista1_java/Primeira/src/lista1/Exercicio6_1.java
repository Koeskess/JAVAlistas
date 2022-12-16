package lista1;

import java.util.Scanner;

public class Exercicio6_1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int num1;
		int num2;
		float divisao;

		System.out.println("Informe um número: ");
		num1 = obj.nextInt();

		System.out.println("Informe um número: ");
		num2 = obj.nextInt();

		divisao = num1 / num2;
		System.out.printf("A divisão dos números informados é: %.2f ", divisao);
		//colocar o f no fim do print para puxarmos o float no 2f 
		obj.close();
	}
}
