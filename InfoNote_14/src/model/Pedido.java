package model;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Pedido {
	
	private String numeroPedido;
	private String dataEmissao;
	private String formaDePagamento;
	private double valorTotal;
	private String situacao;
	private Endereco enderecoEntrega;
	private List<ItemDePedido> itens = new ArrayList<ItemDePedido>();
	
	
	public Pedido() {
		super();
	}

	public Pedido(String numeroPedido, String dataEmissao, String formaDePagamento,
			double valorTotal, String situacao, Endereco enderecoEntrega) {
		super();
		this.numeroPedido = numeroPedido;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
		this.enderecoEntrega = enderecoEntrega;
	}

	

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
	
	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	

	public List<ItemDePedido> getItens() {
		return itens;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public boolean inserirItem(ItemDePedido item){
		return itens.add(item);
	}
	
	public boolean removerItem(ItemDePedido item){
		return itens.remove(item);
	}

	@Override
	public String toString(){
		final String ENTER = "\n";
		String retValue = "";
		
		Locale local = new Locale("pt", "BR");
		
		retValue = "Informações sobre Pedido:" + ENTER +
		"Número do Pedido: " + numeroPedido + ENTER +
		"Data de Emissão: " + dataEmissao + ENTER +
		"Forma de Pagamento: " + formaDePagamento + ENTER +
		"Valor Total: " + 
		NumberFormat.getCurrencyInstance(local).format(this.valorTotal) + ENTER +
		"Situação: " + situacao + ENTER +
		"Endereço de Entrega: "  + enderecoEntrega + ENTER +
		"Itens: ";
		for (ItemDePedido item : itens){
			retValue += item;
		}
		return retValue;
	}
	
}
