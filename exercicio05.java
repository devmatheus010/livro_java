package exercicios_deittel;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite o segundo número:" );
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.printf("Number %d is larger", num1);
		}else if(num1 < num2) {
			System.out.printf("Number %d is larger", num2);
		}else {
			System.out.printf("Number %d and number %d are equals", num1,num2);
		}
	}
}
