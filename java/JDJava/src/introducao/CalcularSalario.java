package introducao;
import java.util.Scanner;
/*
 * 6) Faça um Programa que pergunte quanto você ganha por hora
 *  e o número de horas trabalhadas no mês. 
 *  Calcule e mostre o total do seu salário no referido mês
 */
public class CalcularSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double salario,horas,valor;
		
		System.out.println("Digite o valor da hora");
		valor=leitor.nextDouble();
		System.out.println("Digite a horas trabalhadas");
		horas=leitor.nextDouble();
		salario=horas*valor;
		System.out.println("Seu salário será de:"+salario);
		
	

	}

}
