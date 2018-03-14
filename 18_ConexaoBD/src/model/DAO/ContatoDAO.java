package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.Conexao;
import model.Contato;

public class ContatoDAO {

	public static Contato inserir(String nome, String email, String mensagem) {
		Contato contato = null;
		try {
			// Cria��o do insert
			String sql = "insert into contato (nome, email, mensagem) values (?,?,?)";

			// Obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/18_conexaobd029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			// Abrir a conex�o
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, nome);
			comando.setString(2, email);
			comando.setString(3, mensagem);

			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		contato = new Contato(nome, email, mensagem);
		return contato;
	}// fim do metodo inserir()

	public static Contato[] buscarTodos() {
		Contato[] contatos = null;

		try {
			// Cria��o do select
			String sql = "Select * from contato";

			// Obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/18_conexaobd029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			Connection con = conex.obterConexao();

			/*
			 * Executa a confirma��o direta de acesso ao banco pois n�o s�o
			 * necess�rias informa��es para a Query (caracter curinga)
			 */
			Statement comando = con.createStatement();

			/*
			 * ResultSet - Classe java que monta em mem�ria uma matriz com a
			 * resposta das linhas do banco de dados
			 */
			ResultSet rs = comando.executeQuery(sql);

			// vetor de objetos
			contatos = new Contato[10];

			/*
			 * Passagem de linha de dados do ResultSet para o vetor de objetos
			 * (uma linha de dados da matriz do ResultSet � copiada para um
			 * objeto no vetor contatos)
			 */
			int i = 0;
			while (rs.next()) {
				contatos[i++] = new Contato(rs.getInt("id"),
						rs.getString("nome"), rs.getString("email"),
						rs.getString("mensagem"));
			}

			// � necess�rio encerrar o acesso ao banco para liberar a conex�o
			rs.close();
			comando.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contatos;
	}// fim do buscarTodos()

	public static Contato excluir(int id) {

		Contato contato = null;
		try {
			// Cria��o do delete
			String sql = "delete from contato where id = ?";

			// Obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/18_conexaobd029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			// Abrir a conex�o
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setInt(1, id);

			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return contato;
	}// fim do metodo excluir()

	public static Contato atualizar(String mensagem, int id){

		Contato contato = null;
		try {
			// Cria��o do update
			String sql = "update contato set mensagem = ? where id = ?";

			// Obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/18_conexaobd029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			// Abrir a conex�o
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, mensagem);
			comando.setInt(2, id);
			
			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return contato;
	}// fim do metodo atualizar()

}
