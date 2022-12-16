package lista2;

import java.util.Scanner;

public class Exercicio3Salario_2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		float salario;
		float reajuste;
		float novosalario;
		float reajustePorc;

		System.out.println("Informe seu salário: ");
		salario = obj.nextFloat();
		System.out.println("Informe a porcentagem que você gostaria de receber de reajuste: ");
		reajuste = obj.nextFloat();

		reajustePorc = reajuste / 100 * salario;
		novosalario = salario + reajustePorc;

		System.out.println("O salário com reajuste é: R$ " + novosalario);

		obj.close();

	}
}