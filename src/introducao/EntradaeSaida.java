package introducao;

import java.util.Scanner;

public class EntradaeSaida {

	public static void main(String[] args) {		
		// Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		Scanner leia = new Scanner(System.in);
		
		// Entrada
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Insira a temp em celsius: ");
		temperatura = leia.nextFloat();
		
		// Processamento
		fahrenheit = temperatura * 1.8f + 32;
		
		// Saida
		System.out.println("Bom dia " + nome);
		System.out.printf("A temperatura em fahrenheit é %.1f.", fahrenheit);
	
	}

}
