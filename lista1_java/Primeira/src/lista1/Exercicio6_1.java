package lista1;

import java.util.Scanner;

public class Exercicio6_1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int num1;
		int num2;
		float divisao;

		System.out.println("Informe um n�mero: ");
		num1 = obj.nextInt();

		System.out.println("Informe um n�mero: ");
		num2 = obj.nextInt();

		divisao = num1 / num2;
		System.out.printf("A divis�o dos n�meros informados �: %.2f ", divisao);
		//colocar o f no fim do print para puxarmos o float no 2f 
		obj.close();
	}
}
