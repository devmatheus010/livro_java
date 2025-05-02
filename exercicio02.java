package exercicios_deittel;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,z,result;
		
		System.out.print("Solicite o primeiro inteiro: ");
		x = sc.nextInt();
		
		System.out.print("Solicite o segundo inteiro: ");
		y = sc.nextInt();
		
		System.out.print("Solicite o terceiro inteiro: ");
		z = sc.nextInt();
		
		result = x * y * z;
		
		System.out.printf("Product is %d", result);
		

	}

}
