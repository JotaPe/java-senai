package controller;

import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {
	
	public static void main(String[] args) {
		
		Reptil jacare = new Reptil("Jacar�",4, "escamas", "ov�paro", 
				"carn�voro", false);
		
		Reptil lagartixa = new Reptil ("Lagartixa", 4, "escamas", 
				"ov�paro", "carn�voro", true);
		
		Mamifero cachorro = new Mamifero ("Cachorro", 4, "pelos", 
				"viv�paro", "carn�voro", "terrestre");
		
		Mamifero baleia = new Mamifero ("Baleia", 0, "pele", 
				"viv�paro", "carn�voro", "aqu�tico");
		
		jacare.exibir();
		lagartixa.exibir();
		cachorro.exibir();
		baleia.exibir();
	}

}
