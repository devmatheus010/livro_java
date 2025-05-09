package exercicios_deittel;

import java.util.Scanner;

public class exercicio13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeros, positivo = 0, negativo = 0, zero = 0;
		
		
		for(int i=1; i <=5; i++) {
			System.out.print("Número " + i + ": ");
			numeros = sc.nextInt();
			
			if(numeros > 0) {
				positivo += 1;
			
			}else if(numeros < 0) {
				negativo +=1;
			
			}else {
				zero +=1;
			}
			
			
		}
		
		System.out.printf("%d Número(s) positivos\n%d Número(s) negativos\n%d Número(s) 0", positivo, negativo, zero);
		
		
	}
}
