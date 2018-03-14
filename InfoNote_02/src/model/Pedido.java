package model;

public class Pedido {
	
	public int numero;
	public String dataEmissao;
	public String formaDePagamento;
	public double valorTotal;
	public String situacao;
	
	public Pedido() {
		super();
	}

	public Pedido(int numero, String dataEmissao, String formaDePagamento,
			double valorTotal, String situacao) {
		super();
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
	}
	
	public void mostrar() {
		// Mostrar Pedido
		System.out.println("\n\nPedido:\n");
		System.out.println("Número: " + this.numero);
		System.out.println("Data de Emissão: " + this.dataEmissao);
		System.out.println("Forma De Pagamento: " + this.formaDePagamento);
		System.out.println("Valor Total: " + this.valorTotal);
		System.out.println("Situação: " + this.situacao);
		
	}
	
}
