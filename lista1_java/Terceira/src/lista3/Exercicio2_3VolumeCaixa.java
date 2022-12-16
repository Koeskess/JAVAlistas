package lista3;

import java.util.Scanner;

public class Exercicio2_3VolumeCaixa {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		float comprimento, largura, altura, volume;

		System.out.println("Informe o comprimento da caixa retangular: ");
		comprimento = obj.nextFloat();
		System.out.println("Informe a largura da caixa retangular:");
		largura = obj.nextFloat();
		System.out.println("Informe a altura da caixa retangular:");
		altura = obj.nextFloat();

		volume = comprimento * largura * altura;

		System.out.println("O volume da caixa retangular é igual a: " + volume);
		obj.close();
	}
}
