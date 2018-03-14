package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurador {
	
	private String idioma;
	private String regiao;
	private String arquivoAjuda;

	public Configurador(){
		
		try{
		
		// Abre o Arquivo de Propriedades
		FileInputStream arq = new FileInputStream("config.ini");
		
		// Cria um Objeto para armezenar as propriedades
		Properties prop = new Properties();
		
		// Carrega o conteúdo do arquivo de propriedades
		prop.load(arq);
		
		// Fecha o arquivo de propriedades
		arq.close();
		
		// Carrega as respectivas propriedades e cada atributo
		idioma = prop.getProperty("idioma");
		regiao = prop.getProperty("regiao");
		arquivoAjuda = prop.getProperty("ajuda");
		
		}catch (IOException ioe){
			System.out.println("Arquivo config.ini não encontrado.");
		}
	}

	public String getIdioma() {
		return idioma;
	}

	public String getRegiao() {
		return regiao;
	}

	public String getArquivoAjuda() {
		return arquivoAjuda;
	}
}
