package condicionais;

import java.util.Scanner;

public class Ex04FouM {
	/*
	 * 4) Faça um Programa que verifique se 
	 * uma letra digitada é "F" ou "M". 
	 * Conforme a letra escrever: F - Feminino, 
	 * M - Masculino, Sexo Inválido.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sexo;
		Scanner scanner= new Scanner(System.in);
		
		sexo=scanner.next();
		
		if(sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		}else if(sexo.equalsIgnoreCase("M")){
			System.out.println("Maculino");
		}else {
			System.out.println("OP Inválida");
		}
		

	}

}
