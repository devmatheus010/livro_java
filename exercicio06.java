package exercicios_deittel;

import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, soma, multiplicacao;
		double media;
		
		System.out.print("Número 1: ");
		num1 = sc.nextInt();
		
		System.out.print("Número 2: ");
		num2 = sc.nextInt();
		
		System.out.print("Número 3: ");
		num3 = sc.nextInt();
		
		soma = num1 + num2 + num3;
		media = (num1 + num2 + num3) / 3;
		multiplicacao = num1 * num2 * num3;
		
		if(num1 > num2 && num1 > num3) {
			System.out.printf("Maior número: %d\n", num1);
		}else if(num2 > num3) {
			System.out.printf("Maior número: %d\n", num2);
		}else if(num3 > num2){
			System.out.printf("Maior número: %d\n", num3);
		}
		
		System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, soma);
		System.out.printf("Média: %.2f\n", media);
		System.out.printf("%d x %d x %d = %d\n", num1, num2, num3, multiplicacao);
		
	}
}
