package exercicios_deittel;

import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int raio;
		
		System.out.print("Valor do raio do círculo: ");
		raio = sc.nextInt();
		
		double diametro = 2 * raio;
		double circunferencia = 2 * Math.PI * raio;
		double area = Math.PI  * raio * raio;
		
		System.out.printf("Diâmetro: %.2f\nCircunferencia : %.2f\nÁrea : %.2f", diametro, circunferencia, area);
		
		
		
	}
}
