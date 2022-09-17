package introducao;
import java.util.Scanner;

public class NumeroAntSuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		double numero = leitor.nextDouble();
		System.out.println("O número informado foi: "+numero);
		System.out.println("O antecessor dele é: "+(numero-1));
		System.out.println("O sucessor dele é: "+(numero+1));

	}

}
