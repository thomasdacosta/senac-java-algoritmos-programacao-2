package edu.senac.aula05;

import java.util.Scanner;

public class Menu1 {

	public static void main(String[] args) {
		int opcaoMenu;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma op��o");
		System.out.println("1 - Incluir aluno");
		System.out.println("2 - Listar aluno");
		System.out.println("3 - Sair");

		opcaoMenu = scanner.nextInt();

		if (opcaoMenu == 1)
			System.out.println("Op��o de incluir aluno selecionado");
		else if (opcaoMenu == 2)
			System.out.println("Op��o de listar aluno selecionado");
		else if (opcaoMenu == 3)
			System.out.println("Saindo !!!");
		else
			System.out.println("Op��o inv�lida !!!");

		scanner.close();
	}

}
