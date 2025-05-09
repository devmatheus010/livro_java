package exercicios_deittel;

import java.util.Scanner;

public class exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4, num5, maior;
		
		System.out.print("Número 1: ");
		num1 = sc.nextInt();
		
		System.out.print("Número 2: ");
		num2 = sc.nextInt();
		
		System.out.print("Número 3: ");
		num3 = sc.nextInt();
		
		System.out.print("Número 4: ");
		num4 = sc.nextInt();
		
		System.out.print("Número 5: ");
		num5 = sc.nextInt();
		
		maior = num1;
		
		if(num2 > maior) {
			maior = num2;
		
		}if(num3 > maior) {
			maior = num3;
		
		}if(num4 > maior) {
			maior = num4;
		
		}if(num5 > maior) {
			maior = num5;
		}
		
		System.out.print("Maior número: " + maior);
		
		sc.close();

	}
}