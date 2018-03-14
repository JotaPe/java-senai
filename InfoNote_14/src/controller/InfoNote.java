package controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import util.Ajuda;
import util.Configurador;
import util.GerarSenha;
import util.Teclado;
import model.Cliente;
import model.Endereco;
import model.Funcionario;
import model.ItemDePedido;
import model.Notebook;
import model.Pedido;
import model.Usuario;
import model.DAO.ClienteDAO;
import model.DAO.EnderecoDAO;
import model.DAO.FuncionarioDAO;
import model.DAO.NotebookDAO;
import model.DAO.UsuarioDAO;

public class InfoNote {
	Usuario usuario;
	Cliente cliente; // não esquecer de dar o import neste objeto.
	Notebook notebook;
	Pedido pedido;
	boolean logado = false; // indica se o usuário está logado.

	Configurador config;
	Ajuda ajuda;

	private static final int LOGIN = 1;
	private static final int CADASTRAR_USUARIO = 2;
	private static final int BUSCAR_NOTEBOOK = 3;
	private static final int INSERIR_NOTEBOOK = 4;
	private static final int REMOVER_NOTEBOOK = 5;
	private static final int VER_CARRINHO = 6;
	private static final int EFETUAR_COMPRA = 7;
	private static final int AJUDA = 8;
	private static final int AREA_ADMINISTRATIVA = 9;
	private static final int SAIR = 10;

	public InfoNote(){

		// Cria objeto de configurações
		config = new Configurador();

		Locale.setDefault(new Locale(config.getIdioma(), config.getRegiao()));
		
		// Cria o objeto Ajuda
		ajuda = new Ajuda(config.getArquivoAjuda());
		
		/* 
		 * OBS IMPORTANTE: A partir de agora, cada vez que esta Classe for
		 * executada, tentará gravar no BD os Notebooks abaixo.
		 * 
		 * A dica é: Executar uma única vez para gravar no bd, e depois voltar
		 * aqui na Classe e comentar todos estes notebooks abaixo, para que não 
		 * ocorra erro de bd por inserção duplicada de chave primária
		 */


		NotebookDAO.inserirNotebook("1", "Negativo N22BR",
				"CPU Intel Core 2 Duo, Memória 2 GB, HD 250GB", 6, 1200.00,
				"img\\n22br.jpg", "19/05/2011");
 
		NotebookDAO.inserirNotebook("2", "Bell B55BR",
				"CPU Intel I3, Memória 4 GB, HD 500GB", 3, 1800.00,
				"img\\b55br.jpg", "20/05/2011");

		NotebookDAO.inserirNotebook("3", "Pompaq P41BR",
				"CPU Intel I3, Memória 3 GB, HD 320GB", 1, 1600.00,
				"img\\p41br.jpg", "21/05/2011");

		NotebookDAO.inserirNotebook("4", "CCF CR71CH",
				"CPU Intel Dual Core, Memória 2 GB, HD 160GB", 5, 1100.00,
				"img\\cr71ch.jpg", "10/06/2011");

		NotebookDAO.inserirNotebook("5", "BradescoTech BD22BR",
				"CPU AMD Phenon II, Memória 4 GB, HD 500GB", 2, 1900.00,
				"img\\bd22br.jpg", "10/06/2011");
				

	}

	public static void main(String[] args){
		InfoNote info = new InfoNote();
		int opcao = SAIR;
		
		try { 
			
		do {
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua opção: ");

			switch (opcao) {

			case LOGIN:
				info.efetuarLogin();
				break;

			case CADASTRAR_USUARIO:
				info.cadastrarUsuario();
				break;

			case BUSCAR_NOTEBOOK:
				info.buscarNotebooks();
				break;

			case INSERIR_NOTEBOOK:
				info.manterCarrinho(opcao);
				break;

			case REMOVER_NOTEBOOK:
				info.manterCarrinho(opcao);
				break;

			case VER_CARRINHO:
				info.manterCarrinho(opcao);
				break;

			case EFETUAR_COMPRA:
				if (!info.logado) {
					System.out.println("Efetue login para efetuar compra.");
					break;
				} else {
					info.efetuarCompra();
					break;
				}
				
			case AJUDA:
				info.ajuda();
				break;
				
			case AREA_ADMINISTRATIVA:
				info.areaAdministrativa();
				break;

			case SAIR:
				System.out.println("Saída do Sistema");
				break;

			default:
				System.out.println("Opção inválida!");
			}
			Teclado.lerTexto("Pressione uma tecla para continuar...");
		} while (opcao != SAIR);
		
		} catch (NumberFormatException nfe) {
			System.out.println("opção inválida. Digite um número. ");
			Teclado.lerTexto("Pressione uma tecla para continuar...");
			main(args);//chamada do próprio método main.
		}
	}

	public void mostrarMenu() {
		System.out.println("============================================");
		System.out.println("INFONOTE - Se não é info não vendemos."
				+ DateFormat.getDateInstance(DateFormat.SHORT).format(
						new Date()) + " "
				+ DateFormat.getTimeInstance().format(new Date()));
		if (logado == true) {
			System.out.println("Seja bem vindo, " + cliente.getNomeInvertido());
		}

		System.out.println("============================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no Carrinho");
		System.out.println("5 - Remover Notebook do Carrinho");
		System.out.println("6 - Ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Ajuda");
		System.out.println("9 - Área Administrativa");
		System.out.println("10 - Sair");
	}

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login:");
		senha = Teclado.lerTexto("Digite a senha:");
		
		cliente = ClienteDAO.buscarPorLoginSenha(login, senha);

		if (cliente != null) {
			logado = cliente.validarLogin(login, senha);
		}else{
			if (logado) {
				System.out.println("Login efetuado com sucesso!");
			} else {
				System.out.println("Usuário ou senha inválido.");
				
				int opcao2 = 3;
				do{
					System.out.println("Digite:");
					System.out.println("1 - Para efetuar Login");
					System.out.println("2 - Para cadastrar-se");
					System.out.println("3 - Para sair do sistema");
					opcao2 = Teclado.lerInt("");
					
					switch (opcao2){
					case 1:
						efetuarLogin();
						break;
						
					case 2:
						cadastrarUsuario();
						break;

					case 3:
						sair();
						break;
						
					default:
						System.out.println("Opção inválida");
					}
				} while (!logado);
			}
		}
	}
	
	public void efetuarLoginAdm() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login:");
		senha = Teclado.lerTexto("Digite a senha:");
		
		Funcionario funcionario = FuncionarioDAO.buscarPorLoginSenha(login, senha);

		if (funcionario != null) {
			logado = funcionario.validarLogin(login, senha);
		}else{
			if (logado) {
				System.out.println("Login efetuado com sucesso!");
			} else {
				System.out.println("Usuário ou senha inválido.");
			}
		}
	}

	public void cadastrarUsuario() {

		System.out.println("============================================");
		System.out.println("       INFONOTE - Cadastro de Clientes      ");
		System.out.println("============================================");
		String codigoCliente = Teclado.lerTexto("Código do Cliente: ");
		String login = Teclado.lerTexto("Login:");
		String senha = Teclado.lerTexto("Senha: ");
		int tipo = 0; //porque todo cliente é tipo zero
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail:");
		String telefone = Teclado.lerTexto("Telefone: ");
		System.out.println("Endereço Residencial: ");
		String logradouro = Teclado.lerTexto("Logradouro: ");
		String numero = Teclado.lerTexto("Número: ");
		String complemento = Teclado.lerTexto("Complemento: ");
		String bairro = Teclado.lerTexto("Bairro: ");
		String cidade = Teclado.lerTexto("Cidade: ");
		String estado = Teclado.lerTexto("Estado: ");
		String cep = Teclado.lerTexto("CEP: ");

		if (senha.equals("") || senha == null) {
			senha = GerarSenha.gerarSenha();
			System.out.println("Senha gerada: " + senha);
		}

		usuario = UsuarioDAO.inserir(login, senha, tipo);
		cliente = ClienteDAO.inserir(login, senha, tipo, codigoCliente, nome,
				email, telefone);
		Endereco endereco = EnderecoDAO.inserir(logradouro, numero, complemento, 
				bairro, cidade, estado, cep, codigoCliente);

		System.out.println("============================================");
		System.out.println("       Cliente cadastrado com sucesso!      ");
		System.out.println("============================================");

		System.out.println(cliente);
		System.out.println(endereco);

	}
	
	public void sair(){
		System.out.println("Saída do Sistema...");
		System.exit(0);
	}

	public void buscarNotebooks() {
		List<Notebook> notebooks = NotebookDAO.buscarTodos();
		
		for (Notebook notebook: notebooks) {
			System.out.println(notebook);
			System.out.println();
		}
	}

	public void manterCarrinho(int operacao) {
		// Insere notebook no carrinho
		if (operacao == 4){
			inserirNotebook();
			// Visualiza o carrinho
		} else if (operacao == 6){
			verCarrinho();
		}
	}
	
	public void verCarrinho(){
		if (pedido == null){
			System.out.println("Carrinho vazio");
		} else {
			System.out.println(pedido);
		}
	}

	public void inserirNotebook() {
		// Lê o notebook escolhido do teclado
		String modelo = Teclado.lerTexto("Informe o modelo do notebook"
				+ " para compra: ");

		// Cria o pedido
		if (pedido == null) {
			pedido = new Pedido();
		}

		// Busca notebook selecionado no banco
		Notebook aux = NotebookDAO.buscarPorModelo(modelo);
		

		// Se não existir, interrompe
		if (aux == null) {
			return;
		}

		// Cria item
		ItemDePedido item = new ItemDePedido
				(1, aux.getPrecoUnitario(), aux);

		// Insere item no pedido
		pedido.inserirItem(item);
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Construção");
	}

	public void ajuda() {
		System.out.println(ajuda.getTexto());
	}
	
	public void areaAdministrativa(){
		InfoNote info = new InfoNote();
		
		efetuarLoginAdm();
		
		System.out.println("Opções Administrativas\n");
		System.out.println("1 - Cadastrar Notebook");
		System.out.println("2 - Mostrar Notebooks");
		System.out.println("3 - Editar Notebook");
		System.out.println("4 - Excluir Notebook");
		System.out.println("5 - Sair");
		
		int opcao = 5;
		do {
			opcao = Teclado.lerInt("Digite sua opção: ");
			
			switch (opcao){
				
			case 1:
				info.cadastrarNotebook();
				break;
			
			case 2:
				info.buscarNotebooks();
				break;
				
			case 3:
				info.editarNotebook();
				break;
				
			case 4:
				info.excluirNotebook();
				break;
				
			case 5:
				System.out.println("Saída do Sistema");
				break;
				
			default:
				System.out.println("Opção Inválida!");
			}
			Teclado.lerTexto("Pressione ENTER para continuar...");
		} while (opcao !=5);
		
	}
	
	public void cadastrarNotebook() {
		System.out.println("========================================");
		System.out.println("    InfoNote - Cadastro de Notebooks    ");
		System.out.println("========================================");
		String serialNote = Teclado.lerTexto("SerialNote do Notebook: ");
		String modelo = Teclado.lerTexto("Modelo: ");
		String descricao = Teclado.lerTexto("Descrição: ");
		int estoque = Teclado.lerInt("Estoque: ");
		double precoUnitario = Teclado.lerDouble("Preço Unitário: ");
		String figura = Teclado.lerTexto("Figura: ");
		String dataCadastro = DateFormat.getDateInstance(DateFormat.SHORT).format(new Date());
		
		Notebook notebook = NotebookDAO.inserirNotebook
		(serialNote, modelo, descricao, estoque, precoUnitario, figura, dataCadastro);
		
		System.out.println("=====================================");
		System.out.println("   Notebook Cadastrado com Sucesso   ");
		System.out.println("=====================================");
		
		System.out.println(notebook);
	}
	
	
	public void editarNotebook() {
		System.out.println("===========================================");
		System.out.println("    InfoNote - Atualização de Notebooks    ");
		System.out.println("===========================================");
		String serialNote = Teclado.lerTexto("Digite o SerialNote do Notebook a ser atualizado: ");
		String descricao = Teclado.lerTexto("Descrição: ");
		int estoque = Teclado.lerInt("Estoque: ");
		double precoUnitario = Teclado.lerDouble("Preço Unitário: ");
		String figura = Teclado.lerTexto("Figura: ");
		String dataCadastro = DateFormat.getDateInstance(DateFormat.SHORT).format(new Date());
		
		NotebookDAO.atualizar(descricao, estoque, precoUnitario, 
				figura, dataCadastro, serialNote);
		
		System.out.println("=====================================");
		System.out.println("   Notebook atualizado com Sucesso   ");
		System.out.println("=====================================");
				
	}
	
	public void excluirNotebook() {
		System.out.println("========================================");
		System.out.println("    InfoNote - Exclusão de Notebooks    ");
		System.out.println("========================================");
		String serialNote = Teclado.lerTexto("Digite o SerialNote do Notebook a ser excluído: ");
				
		NotebookDAO.excluir(serialNote);
		
		System.out.println("=====================================");
		System.out.println("   Notebook excluído com Sucesso   ");
		System.out.println("=====================================");
				
	}

	public void removerCarrinho(){
		//Lê o notebook escolhido do teclado
		String modelo = Teclado.lerTexto("Informe o modelo do notebook"
				+ " para remover do carrinho: ");
		
		// Busca notebook selecionado no banco
		Notebook aux = NotebookDAO.buscarPorModelo(modelo);
		
		// Se não existir, interrompe
		if (aux == null){
			return;
		}
		
		// Cria item a ser removido
		ItemDePedido item = new ItemDePedido
				(1, aux.getPrecoUnitario(), aux);
		
		pedido.removerItem(item);
	}
}