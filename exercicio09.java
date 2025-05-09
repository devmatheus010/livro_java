package exercicios_deittel;

import java.util.Scanner;

public class exercicio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.print("Número 1: ");
		numero1 = sc.nextInt();
		
		System.out.print("Número 2: ");
		numero2 = sc.nextInt();
		
		
		
		if(numero2 != 0  && numero1 % numero2 == 0) {
			System.out.printf("%d e %d são múltiplos\n", numero1, numero2);
		}else  if (numero1 != 0 && numero2 % numero1 == 0){
			System.out.printf("%d e %d  são múltiplos\n", numero2, numero1);
		}else {
			System.out.printf("%d e %d não são múltiplos\n", numero1, numero2);
		}
		
		sc.close();
	}
}
