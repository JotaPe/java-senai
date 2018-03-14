/*
 * Pacote controller - É o pacote onde as ações acontecem.
 * As suas classes costumam ter o método main.
 */

package controller;

//importando os dados da classe Usuario do pacote model.
import model.Usuario;

public class Cadastro {

	/*
	 * Método main - É o método principal do sistema. É nele que as ações
	 * começam a acontecer. Ao executar um projeto, o java vai procurar
	 * onde está o método main, e iniciar a execução por ele.
	 */
	public static void main(String[] args) {
		
		
		/*
		 * Criando um objeto (com o operador new):
		 * Usuario - É a classe de origem (de onde virá o molde p o objeto)
		 * user - É o nome do objeto
		 * new - novo (indicando o surgimento do objeto)
		 * Usuario() - método contrutor (veremos adiante)
		 */
		Usuario user = new Usuario();//Criação do objeto user
		user.nome="João da Silva Sauro";//Atributo nome do obj user
		user.endereco="Rua Sem Fim, 72";//Atributo endereco do obj user
		
		Usuario user2 = new Usuario();//Criação do objeto user2
		user2.nome = "Maria Alice Conceição";
		user2.endereco = "Rua Sobe e Desce, 1000";
		//user2.telefone = "3333-4444"; - Não existe este atributo na classe de origem
		
		System.out.println("Objetos cadastrados:");
		System.out.println("Objeto user - Nome: " + user.nome);
		System.out.println("Objeto user - Endereço: " + user.endereco);
		System.out.println("Objeto user2 - Nome: " + user2.nome);
		System.out.println("Objeto user2 - Endereço: " + user2.endereco);
		

	}//fim do método main

}//fim da classe






