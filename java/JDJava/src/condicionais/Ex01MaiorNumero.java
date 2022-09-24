package condicionais;

import java.util.Scanner;

public class Ex01MaiorNumero {
	/*
	 * 1) Faça um Programa que peça dois números e imprima o maior deles.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2;
		Scanner scanner= new Scanner(System.in);
		
		n1=scanner.nextInt();
		n2=scanner.nextInt();
		
		if(n1>n2) {
			System.out.println("o n1 é o maior: "+n1);
		}else {
			System.out.println("o n2 é o maior: "+n2);
		}
		

	}

}
