package controller;

public class EscopoDeVariavel {

	static int x = 1; // vari�vel global

	public static void main(String[] args) {

		int x = 5; //vari�vel local
		System.out.println("x no in�cio do main() � " + x);

		metodoA();
		metodoB();
		metodoA();
		metodoB();
		metodoB(x);
		metodoB(x);
		
		int y = 8;
		metodoB(y);
		
		metodoB(3);

	}// fim do m�todo main

	public static void metodoA() {

		int x = 25;//vari�vel local
		System.out.println("Vari�vel local x ao entrar no metodoA � " + x);

		x = x + 1;
		System.out.println("Vari�vel local x antes de sair do metodoA � " + x);

	}// fim do metodoA

	public static void metodoB() {

		System.out.println
		("Vari�vel x ao entrar no metodoB � " + x + " global");

		x = x * 10;
		System.out.println
		("Vari�vel x antes de sair do metodoB � " + x);
		
	}// fim do metodoB
	
	public static void metodoB(int x) {
	
		System.out.println
		("Vari�vel x ao entrar no metodoB � " + x + " local");

		x = x * 10;
		System.out.println
		("Vari�vel x antes de sair do metodoB � " + x);
		
	}// fim do metodoB
	
	
}// fim da classe










