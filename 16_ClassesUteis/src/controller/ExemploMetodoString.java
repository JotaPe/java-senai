package controller;

public class ExemploMetodoString {

	public static void main(String[] args) {
		
		String url = "http://www.senai.rj.br/ctti/turma2014029";
		String email = "aluno@senai.br";
		String nomeCompleto = "Fabr�cio Curvello Gomes";

		String dominio;
		dominio = url.substring(7,22);
		System.out.println("Dom�nio: " + dominio);

		String complemento;
		complemento= url.substring(23);
		System.out.println("Complemento do Dom�nio: " + complemento);
		
		// ------------------------------------------------------------------- //
		
		String nomeUsuario;
		nomeUsuario = email.substring(0, email.indexOf('@'));
		System.out.println("Usu�rio e-mail: " + nomeUsuario);
		
		String primeiroNome;
		primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(' '));
		System.out.println("Primeiro Nome: " + primeiroNome);

		String maiuscula, minuscula, palavra1, palavra2;
		palavra1 = "carro";
		palavra2 = "CASA";
		maiuscula = palavra1.toUpperCase();
		System.out.println("maiuscula: " + maiuscula);
		minuscula = palavra2.toLowerCase();
		System.out.println("minuscula: " + minuscula);

	}
}







