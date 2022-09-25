import java.util.Scanner;

import javax.swing.JOptionPane;

public class Repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * para(criação de variáveis; teste; ação) {
		 * código a ser repetido
		 * } 
		 * 
		 * i=i+1 -> i+=1 -> i++
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		String strT="", strK= JOptionPane.showInputDialog(null, "digite um número");
		int k = Integer.parseInt(strK);
		
		
		for(int i =0;i<k;i++) {			
			System.out.println(i);
			strT+= ", "+i;			
		}
		
		JOptionPane.showConfirmDialog(null, strT);

	}

}
