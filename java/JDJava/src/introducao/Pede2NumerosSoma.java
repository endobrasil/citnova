package introducao;
import java.util.Scanner;

public class Pede2NumerosSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double n1,n2,soma; 
		System.out.println("Digite o primeiro número");
		n1= leitor.nextDouble();
		System.out.println("Digite o segundo número");
		n2= leitor.nextDouble();
		soma=n1+n2;
		System.out.println("A soma dos número foi: "+soma);

	}

}
