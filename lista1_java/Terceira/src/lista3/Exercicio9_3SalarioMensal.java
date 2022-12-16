package lista3;

import java.util.Scanner;

public class Exercicio9_3SalarioMensal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float Smensal;
		float percentual;
		float Nsalario;

		System.out.println("Informe seu salário mensal: ");
		Smensal = sc.nextFloat();
		System.out.println("Informe o percentual de reajuste: ");
		percentual = sc.nextFloat();

		Nsalario = Smensal + (Smensal * percentual / 100);
		System.out.println("O seu novo salário é igual a: R$ " + Nsalario);
		sc.close();
	}

}
