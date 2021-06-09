package olamundo;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class OlaMundo {

	public static void main(String args[]) {
		System.out.println("Olá Mundo!!!");
		JOptionPane.showMessageDialog(null, "Olá Mundo!!!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Digite seu salário: ");
		double salario = sc.nextDouble();
		JOptionPane.showMessageDialog(null, "Meu nome é: "+nome);
		JOptionPane.showMessageDialog(null, "Minha idade é: "+idade);
		JOptionPane.showMessageDialog(null, "Meu salário é: "+salario);
		System.out.println("Boa tarde!");
		System.out.println("Boa noite!");			
		sc.close();
	}
}
