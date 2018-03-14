package controller;

public class EscopoDeVariavel {

	static int x = 1; // variável global

	public static void main(String[] args) {

		int x = 5; //variável local
		System.out.println("x no início do main() é " + x);

		metodoA();
		metodoB();
		metodoA();
		metodoB();
		metodoB(x);
		metodoB(x);
		
		int y = 8;
		metodoB(y);
		
		metodoB(3);

	}// fim do método main

	public static void metodoA() {

		int x = 25;//variável local
		System.out.println("Variável local x ao entrar no metodoA é " + x);

		x = x + 1;
		System.out.println("Variável local x antes de sair do metodoA é " + x);

	}// fim do metodoA

	public static void metodoB() {

		System.out.println
		("Variável x ao entrar no metodoB é " + x + " global");

		x = x * 10;
		System.out.println
		("Variável x antes de sair do metodoB é " + x);
		
	}// fim do metodoB
	
	public static void metodoB(int x) {
	
		System.out.println
		("Variável x ao entrar no metodoB é " + x + " local");

		x = x * 10;
		System.out.println
		("Variável x antes de sair do metodoB é " + x);
		
	}// fim do metodoB
	
	
}// fim da classe










