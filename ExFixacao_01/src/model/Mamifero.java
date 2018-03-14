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

	@Override //Polimorfismo da Super Classe Animal
	public void tipoDeRespiracao(){
		super.tipoDeRespiracao();//Chamada do m�todo de mesmo nome da super classe Animal
		System.out.println("Pulmonar");
	}
	
	@Override //Polimorfismo da Interface IAnimal
	public void temperaturaCorporal(){
		System.out.println("Temperatura Corporal: Homeot�rmico");
	}
	
	@Override //Polimorfismo da Super Classe Animal
	public void exibir(){
		System.out.println("\n\nCaracter�sticas do animal selecionado:\n");
		System.out.println("Nomenclatura: " + super.getNomenclatura());
		System.out.println("Numero de Patas: " + super.getNumeroDePatas());
		System.out.println("Coberto Por: " + super.getCobertoPor());
		System.out.println("Reprodu��o: " + super.getReproducao());
		System.out.println("Alimenta��o: " + super.getAlimentacao());
		System.out.println("Habitat: " + this.habitat);
		tipoDeRespiracao();
		temperaturaCorporal();
	}

}
