package introducao;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double n1,n2,n3,n4,soma,media; 
		System.out.println("Digite o primeiro nota");
		n1= leitor.nextDouble();
		System.out.println("Digite o segundo nota");
		n2= leitor.nextDouble();
		System.out.println("Digite o segundo nota");
		n3= leitor.nextDouble();
		System.out.println("Digite o segundo nota");
		n4= leitor.nextDouble();
		soma=n1+n2+n4+n3;
		media=soma/4;
		System.out.println("Sua média é: "+media);

	}

}
