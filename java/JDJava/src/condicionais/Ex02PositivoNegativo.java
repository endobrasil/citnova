package condicionais;

import java.util.Scanner;

public class Ex02PositivoNegativo {
	/*
	 * 2) Faça um Programa que peça um valor e 
	 *    mostre na tela se o valor é positivo ou negativo.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		Scanner scanner= new Scanner(System.in);
		
		n1=scanner.nextInt();
		
		if(n1>0) {
			System.out.println("o n1 é positovo: "+n1);
		}else {
			System.out.println("o n1 é negativo: ");
		}	

	}

}
