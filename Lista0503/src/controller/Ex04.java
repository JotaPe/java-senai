package controller;
import util.Teclado;

public class Ex04 {

	public static void main(String[] args) {
	
	double n1, n2, n3, media;
	n1 = Teclado.lerDouble("Informe a nota 1 do aluno:");
	n2 = Teclado.lerDouble("Informe a nota 2 do aluno:");
	n3 = Teclado.lerDouble("Informe a nota 3 do aluno:");
	
	media = (n1 + n2 + n3 ) / 3;
	
	if (media >= 7 ){
	  System.out.println("Aprovado");
	  System.out.println("Media: " + media);
	} else if (media >= 5  ){
			System.out.println("Recuperação");
		}
		if (media < 5 ){
			System.out.println("Reprovado");
		}
	System.out.println("Média: " + media);
	}
}

