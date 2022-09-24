package condicionais;

import java.util.Scanner;

public class Ex05DiaTardeNoite {
	/*
	 * 5) Faça um Programa que pergunte em que turno você estuda. 
	 * Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
	 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" 
	 * ou "Valor Inválido!", conforme o caso.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String turno;
		Scanner scanner= new Scanner(System.in);
		
		turno=scanner.next();
		
		if(turno.equalsIgnoreCase("B")) {
			System.out.println("Bom dia");
		}else if(turno.equalsIgnoreCase("T")){
			System.out.println("Boa tarde");
		}else if(turno.equalsIgnoreCase("N")){
			System.out.println("Boa noite");
		}else {
			System.out.println("OP Inválida");
		}
		

	}

}
