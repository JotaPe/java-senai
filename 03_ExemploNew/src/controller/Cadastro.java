/*
 * Pacote controller - � o pacote onde as a��es acontecem.
 * As suas classes costumam ter o m�todo main.
 */

package controller;

//importando os dados da classe Usuario do pacote model.
import model.Usuario;

public class Cadastro {

	/*
	 * M�todo main - � o m�todo principal do sistema. � nele que as a��es
	 * come�am a acontecer. Ao executar um projeto, o java vai procurar
	 * onde est� o m�todo main, e iniciar a execu��o por ele.
	 */
	public static void main(String[] args) {
		
		
		/*
		 * Criando um objeto (com o operador new):
		 * Usuario - � a classe de origem (de onde vir� o molde p o objeto)
		 * user - � o nome do objeto
		 * new - novo (indicando o surgimento do objeto)
		 * Usuario() - m�todo contrutor (veremos adiante)
		 */
		Usuario user = new Usuario();//Cria��o do objeto user
		user.nome="Jo�o da Silva Sauro";//Atributo nome do obj user
		user.endereco="Rua Sem Fim, 72";//Atributo endereco do obj user
		
		Usuario user2 = new Usuario();//Cria��o do objeto user2
		user2.nome = "Maria Alice Concei��o";
		user2.endereco = "Rua Sobe e Desce, 1000";
		//user2.telefone = "3333-4444"; - N�o existe este atributo na classe de origem
		
		System.out.println("Objetos cadastrados:");
		System.out.println("Objeto user - Nome: " + user.nome);
		System.out.println("Objeto user - Endere�o: " + user.endereco);
		System.out.println("Objeto user2 - Nome: " + user2.nome);
		System.out.println("Objeto user2 - Endere�o: " + user2.endereco);
		

	}//fim do m�todo main

}//fim da classe






