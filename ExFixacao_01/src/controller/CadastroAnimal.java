package controller;

import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {
	
	public static void main(String[] args) {
		
		Reptil jacare = new Reptil("Jacaré",4, "escamas", "ovíparo", 
				"carnívoro", false);
		
		Reptil lagartixa = new Reptil ("Lagartixa", 4, "escamas", 
				"ovíparo", "carnívoro", true);
		
		Mamifero cachorro = new Mamifero ("Cachorro", 4, "pelos", 
				"vivíparo", "carnívoro", "terrestre");
		
		Mamifero baleia = new Mamifero ("Baleia", 0, "pele", 
				"vivíparo", "carnívoro", "aquático");
		
		jacare.exibir();
		lagartixa.exibir();
		cachorro.exibir();
		baleia.exibir();
	}

}
