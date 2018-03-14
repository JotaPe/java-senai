package model;

public class Cliente extends Usuario implements IUsuario{
	
	private String codigoCliente;
	private String nome;
	private String email;
	private String telefone;
	private Endereco enderecos[] = new Endereco[10];
	private Pedido pedidos[] = new Pedido[10];
	
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco[] getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}
	public Pedido[] getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}
	public Cliente() {
		super();
	}
	public Cliente(String login, String senha, int tipo, String codigoCliente,
			String nome, String email, String telefone, Endereco endereco) {
		super(login, senha, tipo);
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		//insere na posi��o zero do vetor o endere�o residencial
		inserirEndereco(endereco);
	}
	
	//inserir o pedido no vetor
	public boolean inserirPedido(Pedido pedido){
		for (int i=0; i<pedidos.length; i++){
			if (pedidos[i] == null){
				pedidos[i] = pedido;
				return true;
			}
		}
		return false;
	}
	
	//inserir o endere�o no vetor
	public boolean inserirEndereco (Endereco end){
		for (int i=0; i<enderecos.length; i++){
			if (enderecos[i] == null){
				enderecos[i] = end;
				return true;
			}
		}
		return false;
	}
	
	public String getNomeInvertido(){
		String nome, sobrenome;
		
		int posicao = getNome().indexOf(" ");
		nome = getNome().substring(0, posicao);
		
		posicao = getNome().lastIndexOf(" ");
		sobrenome = getNome().substring(posicao + 1);
		
		return sobrenome + ", " + nome;
	}
	
	@Override
	public String toString(){
		final String ENTER = "\n";
		String retValue = "";
		
		retValue = "Informa��es sobre o Cliente:" + ENTER +
				super.toString()+
				"C�digo do Cliente: " + codigoCliente + ENTER +
				"Nome: " + nome + ENTER +
				"E-mail: " + email + ENTER +
				"Telefone: " + telefone + ENTER +
				"Endere�o: " + enderecos[0];
		
		return retValue;
	}
	
	@Override
	public boolean validarLogin (String login, String senha){
		if (getLogin().equals(login) && getSenha().equals(senha)){
			return true;
		}
		return false;
	}
}
