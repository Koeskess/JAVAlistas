package lista4;

import java.util.Scanner;

public class Exercicio16_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if (valor > 10) {
			System.out.println("Valor maior que 10");
		} else {
			System.out.println("Valor menor que 10");
		}
		
		sc.close();
	}

}
