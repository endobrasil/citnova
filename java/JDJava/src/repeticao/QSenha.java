package repeticao;
import javax.swing.JOptionPane;

public class QSenha {
	/*
	 * Faça um programa que leia um nome de 
	 * usuário e a sua senha e não aceite a 
	 * senha igual ao nome do usuário, mostrando
	 *  uma mensagem de erro e voltando a
	 *   pedir as informações.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user,senha;
		
		user=JOptionPane.showInputDialog(null,"informe o usuário");
		senha=JOptionPane.showInputDialog(null,"informe a senha");
		
		while(user.equals(senha)) {
			JOptionPane.showConfirmDialog(null, "Não pode ser usuário igual a senha");
			
			user=JOptionPane.showInputDialog(null,"informe o usuário");
			senha=JOptionPane.showInputDialog(null,"informe a");
		}
		
		
		/*
		for(int tentativas=1; user.equals(senha); tentativas++) {
			JOptionPane.showConfirmDialog(null, "Não pode ser usuário igual a senha e vc já tentou isso "+tentativas+" vezes");
			
			user=JOptionPane.showInputDialog(null,"informe o usuário");
			senha=JOptionPane.showInputDialog(null,"informe a");			
		}
		*/
		JOptionPane.showConfirmDialog(null, "Usuário criado com sucesso");

	}

}
