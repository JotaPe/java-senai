package controller;

import util.Teclado;
import model.Usuario;

public class InfoNote {

	Usuario user;
	boolean logado = false;

	public static void main(String[] args) {

		// info s� vai ser utilizado para acionar os m�todos desta classe
		InfoNote info = new InfoNote();
		int opcao = 8;

		do {
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua op��o: ");

			switch (opcao) {

			case 1:
				info.efetuarLogin();
				break;

			case 2:
				info.cadastrarUsuario();
				break;

			case 3:
				info.buscarNotebook();
				break;

			case 4:
				info.manterCarrinho();
				break;

			case 5:
				info.manterCarrinho();
				break;

			case 6:
				info.manterCarrinho();
				break;

			case 7:
				if (!info.logado) {
					System.out.println("Efetue login para efetuar compra.");
					break;
				} else {
					info.efetuarCompra();
					break;
				}

			case 8:
				System.out.println("Sa�da do Sistema.");
				break;

			default:
				System.out.println("Op��o inv�lida!");
			}// fim do switch
		} while (opcao != 8);

		Teclado.lerTexto("Pressione uma tecla para continuar...");

	}// fim do metodo main

	public void mostrarMenu() {
		System.out.println("=================================================");
		System.out.println("      InfoNote - Se n�o � Info n�o vendemos.     ");
		System.out.println("=================================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - Ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Sair");
	}// fim do metodo mostrar menu

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");

		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Login efetuado com sucesso.");
			logado = true;
		} else {
			System.out.println("Login ou Senha inv�lido.");
			efetuarLogin();
		}
	}// fim do metodo efetuarLogin

	public void cadastrarUsuario() {
		System.out.println("=================================================");
		System.out.println("          InfoNote - Cadastro de Usu�rios.       ");
		System.out.println("=================================================");
		int matricula = Teclado.lerInt("Matr�cula: ");
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");

		user = new Usuario(matricula, login, senha, nome, email, telefone);
		System.out.println("=================================================");
		System.out.println("          Usu�rio Cadastrado Com Sucesso.        ");
		System.out.println("=================================================");

		user.mostrar();
	}// fim do cadastrarUsuario

	public void buscarNotebook() {
		System.out.println("buscarNotebook - Em Constru��o");
	}// fim do buscarNotebook

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Constru��o");
	}// fim do manterCarrinho

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Constru��o");
	}// fim do efetuarCompra

}// fim da classe
