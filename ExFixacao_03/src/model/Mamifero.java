package model;

public class Mamifero extends Animal implements IAnimal{
	
	private String habitat; // terrestre, aqu�tico

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public Mamifero() {
		super();
	}

	
	public Mamifero(String nomenclatura, int numeroDePatas, String cobertoPor,
			String reproducao, String alimentacao, String habitat) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.habitat = habitat;
	}

	@Override
	public void tipoDeRespiracao(){
		super.tipoDeRespiracao();
		System.out.println("Pulmonar");
	}
	
	@Override 
	public void temperaturaCorporal(){
		System.out.println("Temperatura Corporal: Homeot�rmico");
	}
	
 
	public void exibir(){
		System.out.println("\n\nCaracter�sticas do Mam�fero:\n");
		System.out.println("Nomenclatura: " + super.getNomenclatura());
		System.out.println("Numero de Patas: " + super.getNumeroDePatas());
		System.out.println("Coberto Por: " + super.getCobertoPor());
		System.out.println("Reprodu��o: " + super.getReproducao());
		System.out.println("Alimenta��o: " + super.getAlimentacao());
		System.out.println("Habitat: " + habitat);
		tipoDeRespiracao();
		temperaturaCorporal();
	}

}
