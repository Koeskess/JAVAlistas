package lista2;

import java.util.Scanner;

public class Exercicio7Oleo_2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		double raio;
		double altura;
		double volume;

		System.out.println("Digite o raio da lata de óleo: ");
		raio = obj.nextFloat();
		System.out.println("Digite a altura da lata de óleo: ");
		altura = obj.nextFloat();
		volume = Math.PI * Math.pow(raio, 2) * altura;

		System.out.println("O volume da lata de óleo é: " + volume);
		obj.close();
	}
}
