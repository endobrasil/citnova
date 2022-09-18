import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		/*
		 * Opérações lógicas, 
		 * 		verdadeiro/falso
		 *      true false
		 *      
		 *      >,<,<=,>=,!=,==
		 *
		 *      
		 *      se(teste){
		 *      
		 *      verdade
		 *      
		 *      }senão{
		 *      
		 *      mentira
		 *      
		 *      }
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		System.out.println("informe sua idade");
		idade=scanner.nextInt();
		
		if (idade>=18) {
			System.out.println("pode entrar");
		} else {
			System.out.println("entrada negada");
		}
		
		
		boolean chuva,companhia,pagaMinha;
		double carteira;
		
		
		System.out.println("está chovendo?");
		chuva=scanner.nextBoolean();
		System.out.println("vc vai comigo?");
		companhia=scanner.nextBoolean();
		System.out.println("quanto tenho na carteira?");
		carteira=scanner.nextDouble();
		System.out.println("vc vai paga a minha?");
		pagaMinha=scanner.nextBoolean();
				
		if (!chuva) {
			System.out.println("indo pra praia");
			
		} else if(companhia && (carteira>=100 || pagaMinha)){
			System.out.println("indo pro shopping");
			
		}else {			
			System.out.println("vejo netflix one piece");
		}
		
		
		// operações lógicas -> true, false
		// >, <, >=, <=, !=, ==
		
		System.out.println("Digite uma idade");
		
		idade = scanner.nextInt();
		
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






