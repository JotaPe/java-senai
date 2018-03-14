package model;

public class Notebook {
	
	private int numeroNote;
	private String modelo;
	private String descricao;
	private int estoque;
	private double precoUnitario;
	private String figura;
	private String dataCadastro;
	
	public Notebook() {
		super();
	}

	public Notebook(int numeroNote, String modelo, String descricao,
			int estoque, double precoUnitario, String figura,
			String dataCadastro) {
		super();
		this.numeroNote = numeroNote;
		this.modelo = modelo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
	}

	public int getNumeroNote() {
		return numeroNote;
	}

	public void setNumeroNote(int numeroNote) {
		this.numeroNote = numeroNote;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public void mostrar() {

		System.out.println("\nDados do Notebook:\n");
		System.out.println("N�mero do Notebook: " + this.numeroNote);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Descri��o: " + this.descricao);
		System.out.println("Quantidade em Estoque: " + this.estoque);
		System.out.println("Pre�o Unitario: R$ " + this.precoUnitario);
		System.out.println("Figura: " + this.figura);
		System.out.println("Data de Cadastro: " + this.dataCadastro);
	}
}
