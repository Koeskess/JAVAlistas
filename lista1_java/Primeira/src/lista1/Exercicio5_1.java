package lista1;

import java.util.Scanner;

public class Exercicio5_1 {
	public static void main(String[]args) {
		
		Scanner obj = new Scanner(System.in);
		int num1;
		int num2;
		int multiplicacao;
		
		System.out.println("Informe um número: ");
		num1 = obj.nextInt();
		
		System.out.println("Informe um número: ");
		num2 = obj.nextInt();
		
		multiplicacao = num1 * num2;
		System.out.println(num1 + "x" + num2 +  " = " + multiplicacao);
		
		obj.close();
	}
}
