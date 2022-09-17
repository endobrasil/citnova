package condicionais;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		// operações lógicas -> true, false
		// >, <, >=, <=, !=, ==
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma idade");
		
		int idade = scanner.nextInt();
		
	if(idade>=18) {
		System.out.println("è de maior");
	}else {
		System.out.println("è de menor");
	}
	
	/*
	 * Faça um Programa que peça dois números
	 * e imprima o maior deles.
	 */
	 
	
	double n1,n2;
	System.out.println("digite o primeiro número");
	n1=scanner.nextDouble();
	System.out.println("digite o segundo número");
	n2=scanner.nextDouble();
	
	if (n1>n2) {
		System.out.println(n1);
	} else {
		System.out.println(n2);
	}		

		
	}
}






