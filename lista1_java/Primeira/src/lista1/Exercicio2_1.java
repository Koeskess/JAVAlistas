package lista1;

import java.util.Scanner;

public class Exercicio2_1 {
	public static void main(String[]args) {
		
		Scanner obj = new Scanner (System.in);
		int num;
		int antecessor;
		
		System.out.println("Informe um número: ");
		num = obj.nextInt();
		
		antecessor = num-1;
		System.out.println("O antecessor de " + num + " é: " + antecessor);
		
		obj.close();
		
	}

}
