package exercicios_deittel;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, result = 0;
		
		System.out.print("Número 1: ");
		num1 = sc.nextInt();
		
		System.out.print("Número 2: ");
		num2 = sc.nextInt();
		
		int soma = num1 + num2;
		int multiplicacao = num1 * num2;
		int subtracao = num1 - num2;
		int divisao = num1 / num2;
		int resto = num1 % num2;
		
		
		System.out.printf("%d + %d = %d\n", num1, num2, soma);
		System.out.printf("%d x %d = %d\n", num1, num2, multiplicacao);
		System.out.printf("%d - %d = %d\n", num1, num2, subtracao);
		System.out.printf("%d / %d = %d\n", num1, num2, divisao);
		System.out.printf("%d / %d = %d", num1, num2, resto);
	}
}
