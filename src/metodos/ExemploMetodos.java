package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(3, 5);
		System.out.println("O primeiro resultado é " + resultado);
		falar("O segundo resultado é " + somar(4, 7));
		falar("Vamos para a praia");
		ExemploMetodoExterno.mensagem();

	}
	
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}
