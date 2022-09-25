package repeticao;

public class Intervalo {
	/*
	 * Faça um programa que imprima na tela os números de 1 a 20, 
	 * um abaixo do outro. Depois modifique o programa para que 
	 * ele mostre os números um ao lado do outro.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " ";
		int i=0;
		
		/*
		for(int i=0;i<=20;i++) {
			System.out.println(i);
			s+=i+", ";
		}
		*/
		
		while(i<20) {
			System.out.println(i);
			s+=i+", ";
			i++;
		}
		
		s+=i+".";
		
		System.out.println(s);

	}

}
