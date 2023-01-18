package loja;

public class Cliente extends Entidade implements IRelacaoComercial {
	
	public Cliente() {}
	public Cliente(int id, String nome) {
		super(id, nome);
	}

	
	@Override
	public void Comprar(Produto produto, Fornecedor fornecedor) {
		//Cria uma nova Venda
		Venda venda = new Venda(fornecedor, this);
		
		//Popula a venda com o produto escolhido 
		venda.InserirProduto(produto);
		
		//Adiciona esta venda ao historico do Cliente e Fornecedor
		this.conta.historicoVendas.add(venda);		
		fornecedor.conta.historicoVendas.add(venda);		
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
