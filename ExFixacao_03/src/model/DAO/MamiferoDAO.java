package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Mamifero;
import util.Conexao;

public class MamiferoDAO {
	
	public static Mamifero inserir(String nomenclatura, int numeroDePatas, 
			String cobertoPor, String reproducao, String alimentacao, 
			String habitat) {
		Mamifero mamifero = null;
		

		try {
			// Cria��o do insert
			String sql = "insert into mamifero "
					+ "(habitat, fknomenclatura) "
					+ "values (?,?)";

			// Obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/exfixacao03_029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			// Abrir a conex�o
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, habitat);
			comando.setString(2, nomenclatura);
			
			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		mamifero = new Mamifero(nomenclatura, numeroDePatas, cobertoPor,
				reproducao, alimentacao, habitat);

		return mamifero;
	}
	
	public static Mamifero[] visualizarMamiferos() {
		Mamifero[] mamiferos = null;

		try {
			// Cria��o do select
			String sql = "select a.*, m.habitat " +
					"from animal as a, mamifero as m " +
					"where (a.nomenclatura = m.fknomenclatura) " +
					"group by a.nomenclatura";

			// Obter a conexao com o bd
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/exfixacao03_029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			Connection con = conex.obterConexao();

			/*
			 * Executa a confirma��o direta de acesso ao bd pois n�o s�o
			 * necess�rias informa��es para a Query (caracter curinga)
			 */
			Statement comando = con.createStatement();

			/*
			 * ResultSet - Classe java que monta em mem�ria uma matriz com a
			 * resposta das linhas do bd
			 */
			ResultSet rs = comando.executeQuery(sql);

			// vetor de objetos
			mamiferos = new Mamifero[20];

			/*
			 * Passagem de linha de dados do ResultSet para o vetor de objetos
			 * (uma linha de dados da matriz do ResultSet � copiada para um
			 * objeto no vetor contatos)
			 */
			int i = 0;
			while (rs.next()) {
				mamiferos[i++] = new Mamifero(
						rs.getString("nomenclatura"),
						rs.getInt("numeroDePatas"), 
						rs.getString("cobertoPor"),
						rs.getString("reproducao"),
						rs.getString("alimentacao"),
						rs.getString("habitat"));
			}

			// � necess�rio encerrar o acesso ao bd para liberar a conex�o
			rs.close();
			comando.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return mamiferos;
	}
	
	public static Mamifero alterarMamifero(int numeroDePatas, String cobertoPor,
			String reproducao, String alimentacao, String habitat, String nomenclatura) {
		Mamifero mamifero = null;
		try {
			// Cria��o do update na tabela Animal
			String sql1 = "update animal set " +
					"numerodepatas = ?, " +
					"cobertopor = ?, " +
					"reproducao = ?, " +
					"alimentacao = ? " +
					"where nomenclatura = ?";
			
			// Cria��o do update na tabela Mamifero
			String sql2 = "update mamifero set " +
						"habitat = ? " +
						"where fknomenclatura = ?";

			// Obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/exfixacao03_029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			// Abrir a conex�o
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando1 = con.prepareStatement(sql1);
			PreparedStatement comando2 = con.prepareStatement(sql2);

			comando1.setInt(1, numeroDePatas);
			comando1.setString(2, cobertoPor);
			comando1.setString(3, reproducao);
			comando1.setString(4, alimentacao);
			comando1.setString(5, nomenclatura);
			
			comando2.setString(1, habitat);
			comando2.setString(2, nomenclatura);

			// Comando executado
			comando1.executeUpdate();
			comando2.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return mamifero;

	}
	
	
	
	public static Mamifero excluirMamifero(String nomenclatura) {
		Mamifero mamifero = null;
		try {
					
			// Cria��o do delete para a tabela mam�fero
			String sql1 = "delete from mamifero where fknomenclatura = ?";
			
			// Cria��o do delete para a tabela animal
			String sql2 = "delete from animal where nomenclatura = ?";

			// Obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/exfixacao03_029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			// Abrir a conex�o
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando1 = con.prepareStatement(sql1);
			PreparedStatement comando2 = con.prepareStatement(sql2);

			comando1.setString(1, nomenclatura);
			comando2.setString(1, nomenclatura);

			// Comando executado
			comando1.executeUpdate();
			comando2.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return mamifero;

	}
}
