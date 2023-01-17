package loja;

public class Fornecedor extends Entidade implements IRelacaoComercial {

	
	public Fornecedor() {}
	
	public Fornecedor(int id, String nome) {
		super(id, nome);
	}



	//Nao implementa-se compra para fornecedor
	@Override
	public void Comprar(Produto produto, Fornecedor fornecedor) {}
	
	@Override
	public void Vender(Produto produto, Cliente cliente) {
		
	}
	
	@Override
	public void Alugar() {}
	@Override
	public void Devolucao() {}
	
}
