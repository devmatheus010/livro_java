package exercicios_deittel;

import java.util.Scanner;

public class exercicio14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura, peso, imc;
		
		System.out.print("Informe sua altura: ");
		altura = sc.nextDouble();
		
		System.out.print("Informe seu peso: ");
		peso = sc.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("Valores do IMC ");
		
		if(imc < 18.5) {
			System.out.printf("Abaixo do peso: %.2f" , imc );
		
		}else if(imc >= 18.5 && imc <= 24.9) {
			System.out.printf("Peso normal: %.2f " , imc);
		
		}else if(imc >= 25 && imc <= 29.9) {
			System.out.printf("Acima do peso: %.2f " , imc);
		
		}else if (imc >= 30){
			System.out.printf("Obesidade: %.2f " , imc);
		}
	}
}
