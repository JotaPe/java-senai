package controller;

import util.Teclado;
import model.Cliente;
import model.Endereco;
import model.ItemDePedido;
import model.Notebook;
import model.Pedido;


public class InfoNote {

	Cliente cliente;
	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;
	boolean logado = false; // Indica se o usu�rio est� logado

	public InfoNote() {
		notebooks[0] = new Notebook("1", "Negativo N22BR",
				"CPU Intel Core 2 Duo, Mem�ria 2 GB, HD 250GB", 6, 1200.00,
				"img\\n22br.jpg", "19/05/2011");

		notebooks[1] = new Notebook("2", "Bell B55BR",
				"CPU Intel I3, Mem�ria 4 GB, HD 500GB", 3, 1800.00,
				"img\\b55br.jpg", "20/05/2011");

		notebooks[2] = new Notebook("3", "Pompaq P41BR",
				"CPU Intel I3, Mem�ria 3 GB, HD 320GB", 1, 1600.00,
				"img\\p41br.jpg", "21/05/2011");

		notebooks[3] = new Notebook("4", "CCF CR71CH",
				"CPU Intel Dual Core, Mem�ria 2 GB, HD 160GB", 5, 1100.00,
				"img\\cr71ch.jpg", "10/06/2011");

		notebooks[4] = new Notebook("5", "BradescoTech BD22BR",
				"CPU AMD Phenon II, Mem�ria 4 GB, HD 500GB", 2, 1900.00,
				"img\\bd22br.jpg", "10/06/2011");
		
			}

	public static void main(String[] args) {

		InfoNote info = new InfoNote();//para chamar m�todos desta classe mais adiante
		int opcao = 8;
		do {
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite a op��o desejada:");

			switch (opcao) {

			case 1:
				info.efetuarLogin();
				break;

			case 2:
				info.cadastrarCliente();
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
					System.out.println("Efetue login para realizar compra.");
					break;
				} else {
					info.efetuarCompra();
					break;
				}

			case 8:
				System.out.println("Sa�da do Sistema");
				break;

			default:
				System.out.println("Op��o inv�lida!");
			}//fim do switch

		} while (opcao != 8);

		Teclado.lerTexto("Pressione uma tecla para continuar");

	}//fim do m�todo main

	public void mostrarMenu() {
		System.out.println("============================================");
		System.out.println("    INFONOTE - Se n�o � info n�o vendemos   ");
		System.out.println("============================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no Carrinho");
		System.out.println("5 - Remover Notebook do Carrinho");
		System.out.println("6 - Ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Sair");
	}

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login:");
		senha = Teclado.lerTexto("Digite a senha:");

		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Login efetuado com sucesso");
			logado = true;
		} else {
			System.out.println("Login ou Senha inv�lidos");
			efetuarLogin();
		}
	}

	public void cadastrarCliente() {//Cadastro de CLIENTE

		System.out.println("============================================");
		System.out.println("       INFONOTE - Cadastro de Clientes      ");
		System.out.println("============================================");
		String codigoCliente = Teclado.lerTexto("C�digo do Cliente: ");
		String login = Teclado.lerTexto("Login:");
		String senha = Teclado.lerTexto("Senha: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail:");
		String telefone = Teclado.lerTexto("Telefone: ");
		System.out.println("** Endere�o Residencial: **");
		String logradouro = Teclado.lerTexto("Logradouro: ");
		String numero = Teclado.lerTexto("N�mero: ");
		String complemento = Teclado.lerTexto("Complemento: ");
		String bairro = Teclado.lerTexto("Bairro: ");
		String cidade = Teclado.lerTexto("Cidade: ");
		String estado = Teclado.lerTexto("Estado: ");
		String cep = Teclado.lerTexto("CEP: ");
		
		Endereco endereco = new Endereco (logradouro, numero, complemento,
				bairro, cidade, estado, cep);
		
		//Aqui abaixo o tipo recebeu valor zero, para no futuro
		//ocorrer uma associa��o zero para cliente e um para funcionario
		cliente = new Cliente(login, senha, 0, codigoCliente, nome, email,
				telefone, endereco);

		System.out.println("============================================");
		System.out.println("       Cliente cadastrado com sucesso!      ");
		System.out.println("============================================");

		System.out.println(cliente);//Aciona o toString do Cliente

	}

	public void buscarNotebook() {
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(notebooks[i].getSerialNote() + "-----"
						+ notebooks[i].getModelo());
			}
		}
	}

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Constru��o");
	}
	
	public void inserirNotebook(){
		//L� o notebook escolhido do teclado
		String serialNote = Teclado.lerTexto("Informe o n�mero de s�rie do notebook" +
		" para compra: ");
		
		//Cria o pedido
		if (pedido == null){
			pedido = new Pedido();
		}
		
		//Busca notebook selecionado
		Notebook aux = null;
		for (int i = 0; i < notebooks.length; i++){
			if (notebooks[i] != null &&
					serialNote.equals(notebooks[i].getSerialNote())){
				aux = notebooks[i];
			}
		}
		
		// Se n�o existir, interrompe
		if (aux == null){
			return;
		}
		
		// Cria item
		ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux);
		
		//Insere item no pedido
		pedido.inserirItem(item);
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Constru��o");
	}

}