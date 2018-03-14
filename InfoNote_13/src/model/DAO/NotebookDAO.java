package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Notebook;
import util.Conexao;
import util.Configurador;

public class NotebookDAO {
	
	Configurador config = new Configurador();

	String url;
	String driver;
	String login;
	String senha;

	public NotebookDAO() {

		url = config.getUrl();
		driver = config.getDriver();
		login = config.getLogin();
		senha = config.getSenha();
	}

	public static Notebook inserirNotebook(String serialNote, String modelo, 
			String descricao, int estoque, double precoUnitario,
			String figura, String dataCadastro) {
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();

		try {
			// Criação do insert
			String sql = "insert into notebook "
					+ "(serialnote, modelo, descricao, estoque, precounitario, figura, datacadastro) "
					+ "values (?,?,?,?,?,?,?)";

			// Obter a conexão com o BD
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver,
					noteDAO.login, noteDAO.senha);

			// Abrir a conexao
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, serialNote);
			comando.setString(2, modelo);
			comando.setString(3, descricao);
			comando.setInt(4, estoque);
			comando.setDouble(5, precoUnitario);
			comando.setString(6, figura);
			comando.setString(7, dataCadastro);
			
			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		notebook = new Notebook(serialNote, modelo, descricao, 
				estoque, precoUnitario, figura, dataCadastro);

		return notebook;
	}
	
	public static Notebook[] buscarTodos(){
		Notebook[] notebooks = null;
		NotebookDAO noteDAO = new NotebookDAO();

		try {
			// Criação do insert
			String sql = "select * from notebook";
			
			// Obter a conexão com o BD
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver,
					noteDAO.login, noteDAO.senha);

			// Abrir a conexao
			Connection con = conex.obterConexao();

			Statement comando = con.createStatement();
			
			/* ResultSet - Classe java que monta em memória uma matriz
			 * com a resposta das linhas do BD
			 */
			ResultSet rs = comando.executeQuery(sql);
			
			notebooks = new Notebook[10];
			
			int i = 0;
			while (rs.next()){
				notebooks[i++] = new Notebook(
						rs.getString("serialNote"),
						rs.getString("modelo"),
						rs.getString("descricao"),
						rs.getInt("estoque"),
						rs.getDouble("precoUnitario"),
						rs.getString("figura"),
						rs.getString("dataCadastro"));
			}
			
			rs.close();
			comando.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return notebooks;
	}
	
	public static Notebook excluir(String serialNote) {
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();

		try {
			// Criação do delete
			String sql = "delete from notebook where serialnote = ?";

			// Obter a conexão com o BD
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver,
					noteDAO.login, noteDAO.senha);

			// Abrir a conexao
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, serialNote);
			
			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return notebook;
	}
	
	public static Notebook atualizar( 
			String descricao, int estoque, double precoUnitario,
			String figura, String dataCadastro, String serialNote) {
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();

		try {
			// Criação do update
			String sql = "update notebook set descricao = ?, estoque = ?, precounitario = ?," +
				"figura = ?, datacadastro = ? where serialnote = ?";

			// Obter a conexão com o BD
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver,
					noteDAO.login, noteDAO.senha);

			// Abrir a conexao
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setString(1, descricao);
			comando.setInt(2, estoque);
			comando.setDouble(3, precoUnitario);
			comando.setString(4, figura);
			comando.setString(5, dataCadastro);
			comando.setString(6, serialNote);
			
			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return notebook;
	}
}

