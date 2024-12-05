package estrutura_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {

		String nome;
		int cont;
		Scanner leia = new Scanner(System.in);

		for (cont = 1; cont < 4; cont++) {
			System.out.println("Digite o " + cont + "º nome: ");
			nome = leia.nextLine();
			System.out.println("O " + cont + "º nome é: " + nome);
		}
	}

}
