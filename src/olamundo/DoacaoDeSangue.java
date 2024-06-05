package exercicios;

import java.util.Scanner;

public class DoacaoDeSangue {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade;
		String nome;
		boolean primeiradoacao;

		System.out.print("Digite o nome: ");
		nome = leia.nextLine();

		System.out.print("Digite a idade: ");
		idade = leia.nextInt();

		System.out.print("Primeira doação de sangue?(true or false): ");
		primeiradoacao = leia.nextBoolean();
		
		leia.close();

		if (idade >= 18 && idade <= 69) {
		if (idade >= 60 && idade <= 69 && primeiradoacao) {
				System.out.println(nome + " não está apto(a) para doar sangue!");
			} else 
			
			{
				System.out.println(nome + " está apto(a) para doar sangue!");
			}
		} 	  else 
		{
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}

		
	}
}


