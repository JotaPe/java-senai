package controller;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class Teste {
	
	List<Usuario> usuarios = new ArrayList<Usuario>();

	   public Teste(){
	      usuarios.add(new Usuario("fabs","1224"));
	      usuarios.add(new Usuario("jorge", "5432"));
	      usuarios.add(new Usuario("leo","4709"));
	   }

	public static void main(String[] args) {
		
		Teste teste = new Teste();

	      System.out.println(teste.usuarios.get(2));
	      System.out.println(teste.usuarios);
	      teste.usuarios.remove(1);
	      System.out.println(teste.usuarios.get(1));
	}
}
