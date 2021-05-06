package caixa_eletrônico;

import java.util.Scanner;
public class CAIXA_ELETRÔNICO {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("_Caixa eletrônico_");		
		System.out.print("Quanto gostaria de sacar? Digite: ");	
		int valor_saque = teclado.nextInt();
		int valor_final_saque;
		double sobra = 0;
		int n1 = 1, n2 = 2, n5 = 5, n10 = 10, n20 = 20, n50 = 50, n100 = 100;
		int ncedulas;
		
		if (valor_saque > 100) {
		ncedulas = valor_saque / 100;
		valor_saque = valor_saque % 100;
		System.out.println(ncedulas + " cédulas de 100 ");
		}
		if (valor_saque >= 50) {
			ncedulas = valor_saque / n50;
			valor_saque = valor_saque % 50;
			System.out.println(ncedulas + " cédulas de 50 ");
		}
		if (valor_saque >= 20) {
			ncedulas = valor_saque / n20;
			valor_saque = valor_saque % 20;
			System.out.println(ncedulas + " cédulas de 20 ");
		}
		if (valor_saque >= 10) {
			ncedulas = valor_saque / n10;
			valor_saque = valor_saque % 10;
			System.out.println(ncedulas + " cédulas de 10 ");
		}
		if (valor_saque >= 5) {
			ncedulas = valor_saque / n5;
			valor_saque = valor_saque % 5;
			System.out.println(ncedulas + " cédulas de 5 ");
		}
		if (valor_saque >= 2) {
			ncedulas = valor_saque / n2;
			valor_saque = valor_saque % 2;
			System.out.println(ncedulas + " cédulas de 2 ");
		}
		if (valor_saque >= 1) {
			ncedulas = valor_saque / n1;
			valor_saque = valor_saque % 1;
			System.out.println(ncedulas + " cédulas de 1 ");
		}
			
 }
		
}


