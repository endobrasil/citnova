package condicionais;

import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {
		/*
		 * Faça um programa que pergunte o preço de três produtos
		 *  e informe qual produto você deve comprar,
		 *  sabendo que a decisão é sempre pelo mais barato.
		 */
		
		double p1,p2,p3;
		
		Scanner scanner =new Scanner(System.in);
		
		p1=scanner.nextDouble();
		p2=scanner.nextDouble();
		p3=scanner.nextDouble();
		
		if(p1<p2 && p1<p3) {
			System.out.println("comprar o produto 1");
		}
		
		if(p2<p1 && p2<p3) {
			System.out.println("comprar o produto 2");
		}
		
		if(p3<p2 && p3<p1) {
			System.out.println("comprar o produto 3");
		}
		
		

	}

}
