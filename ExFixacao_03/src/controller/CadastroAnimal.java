package controller;

import util.Teclado;
import model.Animal;

import model.Mamifero;
import model.Reptil;
import model.DAO.AnimalDAO;
import model.DAO.MamiferoDAO;
import model.DAO.ReptilDAO;

public class CadastroAnimal {

	private static final int INSERIR_ANIMAL = 1;
	private static final int VISUALIZAR_ANIMAIS = 2;
	private static final int VISUALIZAR_MAMIFEROS = 3;
	private static final int VISUALIZAR_REPTEIS = 4;
	private static final int ALTERAR_ANIMAL = 5;
	private static final int EXCLUIR_ANIMAL = 6;
	private static final int SAIR = 7;
	
	public static void main(String[] args) {

		CadastroAnimal ca = new CadastroAnimal();
		
		int opcao = SAIR;

		do {
			ca.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua opção: ");

			switch (opcao) {
			case INSERIR_ANIMAL:
				ca.cadastrarAnimal();
				break;

			case VISUALIZAR_ANIMAIS:
				ca.visualizarAnimais();
				break;

			case VISUALIZAR_MAMIFEROS:
				ca.visualizarMamiferos();
				break;

			case VISUALIZAR_REPTEIS:
				ca.visualizarRepteis();
				break;

			case ALTERAR_ANIMAL:
				ca.alterarAnimal();
				break;
				
			case EXCLUIR_ANIMAL:
				ca.excluirAnimal();
				break;
				
			case SAIR:
				ca.sair();
				break;


			default:
				System.out.println("Opção Inválida!");
			}
			Teclado.lerTexto("Pressione <ENTER> tecla para continuar ...");
		} while (opcao != SAIR);

		/*
		 * Reptil jacare = new Reptil("Jacaré",4, "escamas", "ovíparo",
		 * "carnívoro", false);
		 * 
		 * Reptil lagartixa = new Reptil ("Lagartixa", 4, "escamas", "ovíparo",
		 * "carnívoro", true);
		 * 
		 * Mamifero cachorro = new Mamifero ("Cachorro", 4, "pelos", "vivíparo",
		 * "carnívoro", "terrestre");
		 * 
		 * Mamifero baleia = new Mamifero ("Baleia", 0, "pele", "vivíparo",
		 * "carnívoro", "aquático");
		 * 
		 * jacare.exibir(); lagartixa.exibir(); cachorro.exibir();
		 * baleia.exibir();
		 */
	}

	public void mostrarMenu() {
		System.out.println("==========================");
		System.out.println("   Cadastro de Animais    ");
		System.out.println("==========================");
		System.out.println("1 - Inserir Animal");
		System.out.println("2 - Visualizar todos os animais");
		System.out.println("3 - Visualizar todos os mamíferos");
		System.out.println("4 - Visualizar todos os répteis");
		System.out.println("5 - Alterar cadastro de animal");
		System.out.println("6 - Excluir um animal cadastrado");
		System.out.println("7 - Sair");
	}

	public void cadastrarAnimal() {
		System.out.println("==========================");
		System.out.println("    Cadastro de Animais   ");
		System.out.println("==========================");
		System.out
				.println("\nSelecione o tipo de animal que deseja incluir:\n");
		System.out.println("1 - Mamífero");
		System.out.println("2 - Réptil");
		int tipo = Teclado.lerInt("");
		switch (tipo) {
		case 1:
			cadastrarMamifero();
			break;

		case 2:
			cadastrarReptil();
			break;
			
		default:
			System.out.println("Opção errada. Digite 1 ou 2:");
			cadastrarAnimal();
		}
	}

	public void cadastrarMamifero() {

		System.out.println("Cadastro de Mamífero:\n");
		String nomenclatura = Teclado.lerTexto("Nomenclatura: ");
		int numeroDePatas = Teclado.lerInt("Número de Patas: ");
		String cobertoPor = Teclado.lerTexto("Coberto Por: (pelo, escama, couro ou pele)");
		String reproducao = Teclado
				.lerTexto("Reprodução (ovíparo ou vivíparo): ");
		String alimentacao = Teclado
				.lerTexto("Alimentação (carnívoro ou herbívoro): ");
		String habitat = Teclado.lerTexto("Habitat (aquático ou terrestre): ");

		Animal animal = AnimalDAO.inserir(nomenclatura, numeroDePatas,
				cobertoPor, reproducao, alimentacao);

		Mamifero mamifero = MamiferoDAO.inserir(nomenclatura, numeroDePatas,
				cobertoPor, reproducao, alimentacao, habitat);

		System.out.println("============================================");
		System.out.println("       Mamífero cadastrado com sucesso!       ");
		System.out.println("============================================");

		mamifero.exibir();
	}

	public void cadastrarReptil() {

		System.out.println("Cadastro de Réptil:\n");
		String nomenclatura = Teclado.lerTexto("Nomenclatura: ");
		int numeroDePatas = Teclado.lerInt("Número de Patas: ");
		String cobertoPor = Teclado.lerTexto("Coberto Por: (pelo, escama, couro ou pele)");
		String reproducao = Teclado
				.lerTexto("Reprodução (ovíparo ou vivíparo): ");
		String alimentacao = Teclado.lerTexto("Alimentação: ");
		int capacidadeRegenerativa = Teclado
				.lerInt("Capacidade Regenerativa (1 para Verdadeiro, 0 para Falso): ");
		boolean cr = false;
		if (capacidadeRegenerativa == 1) {
			cr = true;
		} else if (capacidadeRegenerativa == 0) {
			cr = false;
		} else {
			System.out.println("Capacidade Regenerativa tem que ser 0 ou 1");
			Teclado.lerTexto("Pressione <ENTER> para recomeçar cadastro");
			cadastrarReptil();
		}

		Animal animal = AnimalDAO.inserir(nomenclatura, numeroDePatas,
				cobertoPor, reproducao, alimentacao);

		Reptil reptil = ReptilDAO.inserir(nomenclatura, numeroDePatas,
				cobertoPor, reproducao, alimentacao, cr);

		System.out.println("============================================");
		System.out.println("       Réptil cadastrado com sucesso!       ");
		System.out.println("============================================");

		reptil.exibir();
	}

	public void visualizarAnimais() {

		System.out.println("Nomenclatura de animais cadastrados:\n");
		Animal[] animais = AnimalDAO.visualizarAnimais();

		for (int i = 0; i < animais.length; i++) {
			if (animais[i] != null) {
				System.out.println(animais[i].getNomenclatura() + "\n");
			}
		}

	}

	public void visualizarMamiferos() {

		System.out.println("Mamíferos cadastrados:\n");
		Mamifero[] mamiferos = MamiferoDAO.visualizarMamiferos();

		for (int i = 0; i < mamiferos.length; i++) {
			if (mamiferos[i] != null) {
				System.out.println("Nomemclatura: "
						+ mamiferos[i].getNomenclatura());
				System.out.println("Número de Patas:  "
						+ mamiferos[i].getNumeroDePatas());
				System.out.println("Coberto Por: "
						+ mamiferos[i].getCobertoPor());
				System.out.println("Reprodução: "
						+ mamiferos[i].getReproducao());
				System.out.println("Alimentação: "
						+ mamiferos[i].getAlimentacao());
				System.out.println("Habitat: " + mamiferos[i].getHabitat());
				mamiferos[i].tipoDeRespiracao();
				mamiferos[i].temperaturaCorporal();
				System.out.println();
			}
		}

	}

	public void visualizarRepteis() {

		System.out.println("Répteis cadastrados:\n");
		Reptil[] repteis = ReptilDAO.visualizarRepteis();

		for (int i = 0; i < repteis.length; i++) {
			if (repteis[i] != null) {
				System.out.println("Nomemclatura: "
						+ repteis[i].getNomenclatura());
				System.out.println("Número de Patas:  "
						+ repteis[i].getNumeroDePatas());
				System.out
						.println("Coberto Por: " + repteis[i].getCobertoPor());
				System.out.println("Reprodução: " + repteis[i].getReproducao());
				System.out.println("Alimentação: "
						+ repteis[i].getAlimentacao());
				System.out.println("Capacidade Regeneraitva: "
						+ repteis[i].isCapacidadeRegenerativa());
				repteis[i].tipoDeRespiracao();
				repteis[i].temperaturaCorporal();
				System.out.println();
			}
		}

	}

	public void alterarAnimal() {
		System.out.println("=========================================");
		System.out.println("    Atualização de Cadastro de Animais   ");
		System.out.println("=========================================");
		System.out
				.println("\nSelecione o tipo de animal que deseja altarar cadastro:\n");
		System.out.println("1 - Mamífero");
		System.out.println("2 - Réptil");
		int tipo = Teclado.lerInt("");
		switch (tipo) {
		case 1:
			alterarMamifero();
			break;

		case 2:
			alterarReptil();
			break;

		default:
			System.out.println("Opção errada. Digite 1 ou 2:");
			alterarAnimal();
		}
	}

	public void alterarMamifero() {
		System.out.println("==================================");
		System.out.println("       Atualizar Mamífero         ");
		System.out.println("==================================");
		String nomenclatura = Teclado
				.lerTexto("Informe a nomenclatura do mamífero que terá o cadastro atualizado:");
		int numeroDePatas = Teclado.lerInt("Número de Patas: ");
		String cobertoPor = Teclado
				.lerTexto("Coberto Por: (escama, pelo ou pele)");
		String reproducao = Teclado
				.lerTexto("Reprodução: (ovíparo ou vivíparo)");
		String alimentacao = Teclado
				.lerTexto("Alimentação: (carnívoro ou herbívoro)");
		String habitat = Teclado.lerTexto("Habitat: (aquático ou terrestre)");

		MamiferoDAO.alterarMamifero(numeroDePatas, cobertoPor, reproducao,
				alimentacao, habitat, nomenclatura);

		System.out.println("Mamífero atualizado com sucesso");
	}

	public void alterarReptil() {
		System.out.println("==================================");
		System.out.println("         Atualizar Rétil          ");
		System.out.println("==================================");
		String nomenclatura = Teclado
				.lerTexto("Informe a nomenclatura do réptil que terá o cadastro atualizado:");
		int numeroDePatas = Teclado.lerInt("Número de Patas: ");
		String cobertoPor = Teclado
				.lerTexto("Coberto Por: (escama, pelo ou pele)");
		String reproducao = Teclado
				.lerTexto("Reprodução: (ovíparo ou vivíparo)");
		String alimentacao = Teclado
				.lerTexto("Alimentação: (carnívoro ou herbívoro)");
		int capacidadeRegenerativa = Teclado
				.lerInt("Capacidade Regenerativa (1 para Verdadeiro, 0 para Falso): ");
		boolean cr = false;
		if (capacidadeRegenerativa == 1) {
			cr = true;
		} else if (capacidadeRegenerativa == 0) {
			cr = false;
		} else {
			System.out.println("Capacidade Regenerativa tem que ser 0 ou 1");
			Teclado.lerTexto("Pressione <ENTER> para recomeçar cadastro");
			alterarReptil();
		}

		ReptilDAO.alterarReptil(numeroDePatas, cobertoPor, reproducao,
				alimentacao, cr, nomenclatura);

		System.out.println("Réptil atualizado com sucesso");
	}
	
	
	public void excluirAnimal() {
		System.out.println("=========================================");
		System.out.println("      Exclusão de Animal do Cadastro     ");
		System.out.println("=========================================");
		System.out
				.println("\nSelecione o tipo de animal que deseja excluir cadastro:\n");
		System.out.println("1 - Mamífero");
		System.out.println("2 - Réptil");
		int tipo = Teclado.lerInt("");
		switch (tipo) {
		case 1:
			excluirMamifero();
			break;

		case 2:
			excluirReptil();
			break;

		default:
			System.out.println("Opção errada. Digite 1 ou 2:");
			excluirAnimal();
		}
	}
	
	public void excluirMamifero(){
		System.out.println("==================================");
		System.out.println("      Exclusão de Mamífero        ");
		System.out.println("==================================");
		String nomenclatura = Teclado.lerTexto
				("Digite a nomenclatura do mamífero que será excluído:");
		
		MamiferoDAO.excluirMamifero(nomenclatura);
		
		System.out.println("Mamífero excluído com sucesso");
	}
	
	
	public void excluirReptil(){
		System.out.println("==================================");
		System.out.println("       Exclusão de Réptil         ");
		System.out.println("==================================");
		String nomenclatura = Teclado.lerTexto
				("Digite a nomenclatura do réptil que será excluído:");
		
		ReptilDAO.excluirReptil(nomenclatura);
		
		System.out.println("Réptil excluído com sucesso");
	}
	
	public void sair() {
		System.out.println("Saída do Sistema...");
		System.exit(0);
	}
	
}
