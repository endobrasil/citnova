package repeticao;

import java.util.Scanner;

public class Q03Intervalo {
	/*
	 * 3) Faça um programa que receba 
	 * dois números inteiros e gere os 
	 * números inteiros que estão 
	 * no intervalo compreendido por eles.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2;
		Scanner scanner = new Scanner(System.in);
		n1=scanner.nextInt();
		n2=scanner.nextInt();
		
		for( ;n1<n2;n1++) {
			System.out.println(n1+" ");			
		}

	}

}
