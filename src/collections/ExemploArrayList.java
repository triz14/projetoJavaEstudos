package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<Double>();

		Double y = Double.valueOf(9);
		Double x;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		x = leia.nextDouble();

		notas.add(x);
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		System.out.println("\nNotas cadastradas: " + notas);
		
		
		System.out.println("\nNotas cadastradas - Laço For...Each");
		// for each 
		for(Double nota : notas) {
			if (nota % 2 == 0) {
			System.out.println(nota);
			}
		}

	}

}
