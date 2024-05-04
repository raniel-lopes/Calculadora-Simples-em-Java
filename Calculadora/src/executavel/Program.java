package executavel;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número: ");
		double n1 = sc.nextDouble();
		System.out.println("(+), (-), (/), (*)");
		char operacao = sc.next().charAt(0);
		System.out.println("Informe um número: ");
		double n2 = sc.nextDouble();
 
		switch (operacao) {
	
		case '+':
			double resposta = soma (n1, n2);
			System.out.println("A soma é: " + resposta);
			break;
		case '-':
			resposta = subtracao(n1, n2);
			System.out.println("A resposta = " + resposta);
			break;
		case '*':
			resposta = multiplicacao(n1, n2);
			System.out.println("A resposta = " + resposta);
			break;
		case '/':
			resposta = divisao(n1, n2);
			System.out.println("A resposta = " + resposta);
			break;
		}
	}

	public static double soma(double a, double b) {
		return a + b;
	}

	public static double subtracao(double a, double b) {
		return a - b;
	}

	public static double multiplicacao(double a, double b) {
		return a * b;
	}

	public static Double divisao(double a, double b) {
		if (b == 0) {
			return null;
		}
		return a / b;
	}
}
