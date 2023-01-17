package loja;

public class Cliente extends Entidade implements IRelacaoComercial {

	Conta conta;
	
	public Cliente() {}
	public Cliente(int id, String nome) {
		super(id, nome);
		this.conta = new Conta();
	}

	
	@Override
	public void Comprar(Produto produto, Fornecedor fornecedor) {
		//Add produto para venda
		//Add venda para historico venda da conta 
		
		//Add venda historico venda fornecedor
		
		Venda venda = new Venda(GlobalConfigurations.useGlobalTransactionIndex(), fornecedor, this);
		
		//this.conta.InserirVenda();
		
		
		
		
	}
	
	
	//Não implementa-se venda para cliente
	@Override
	public void Vender(Produto produto, Cliente cliente) {}

	@Override
	public void Devolucao() {}

	@Override
	//Não será implementado alguma lógia de devolucao
	public void Alugar() {}
	
	
	
	

}
