package lista3;

import java.util.Scanner;

public class Exercicio8_3PeS {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int A, B, C, D;
		int P, S;

		System.out.println("Informe o valor de A: ");
		A = obj.nextInt();
		System.out.println("Informe o valor de B: ");
		B = obj.nextInt();
		System.out.println("Informe o valor de C: ");
		C = obj.nextInt();
		System.out.println("Informe o valor de D: ");
		D = obj.nextInt();

		P = A + C;
		S = B + D;
		System.out.println("O valor da Variável P é igual a: " + P);
		System.out.println("O valor da Variável P é igual a: " + S);
		obj.close();
	}
}

//VOLTAR NESSA QUESTÃO!!
