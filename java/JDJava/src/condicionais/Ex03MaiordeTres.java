package condicionais;
import java.util.Scanner;

public class Ex03MaiordeTres {
	/*
	 * 3) Faça um Programa que leia três números e mostre o maior deles.
	 * 
	 * 
se (x >= y) entao
maior <- x
senao
maior <- y
fimse
se (maior <= z) entao
maior <- z
fimse
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3,maior;
		Scanner scanner= new Scanner(System.in);
		
		n1=scanner.nextInt();
		n2=scanner.nextInt();
		n3=scanner.nextInt();
		
//solução elaborada
		
		if (n1 >= n2) {
			maior=n1;
		}else {
			maior=n2;
		}
		if(maior<=n3) {
			maior=n3;
		}

		System.out.println("O maior numero é o: "+maior);
		
//solução mais simples 
		if(n1>n2 && n1>n3) {
			System.out.println("o n1 é o maior: "+n1);
		}
		
		if(n2>n1 && n2>n3) {
			System.out.println("o n2 é o maior: "+n2);
		}
		
		if(n3>n1 && n3>n2) {
			System.out.println("o n1 é o maior: "+n3);
		}
		

	}

}
