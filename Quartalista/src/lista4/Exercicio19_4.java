package lista4;

import java.util.Scanner;

public class Exercicio19_4 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int valor, valor1;
		
		System.out.println("Informe o primeiro n�mero: ");
		valor = obj.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		valor1 = obj.nextInt();
		
		if(valor < valor1) {
			System.out.println("O valor: " + valor1 + " � maior!");
		}else {
			System.out.println("O valor: " + valor + " � maior!");
		}
		obj.close();
	}
}
