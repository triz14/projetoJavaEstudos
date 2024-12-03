package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {

		float media;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		if (media >= 6) {
			System.out.println("Parabéns você foi aprovado!");
		} else if (media >= 5) {
			System.out.println("Você está de exame");
		} else {
			System.out.println("Você está reprovado");
		}

		leia.close();
	}

}
