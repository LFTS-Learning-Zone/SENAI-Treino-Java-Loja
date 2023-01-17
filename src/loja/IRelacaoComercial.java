package loja;

public interface IRelacaoComercial {
	
	public void Comprar(Produto produto, Fornecedor fornecedor);
	public void Vender(Produto produto, Cliente cliente);
	
	//As opcoes abaixo NAO serao implementadas
	public void Devolucao();
	public void Alugar();

}
