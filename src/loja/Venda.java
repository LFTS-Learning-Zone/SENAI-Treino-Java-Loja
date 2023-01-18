package loja;

import java.util.ArrayList;
import java.util.Iterator;

public class Venda {

	int id;
	Fornecedor fornecedor;
	Cliente cliente;
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	double valorFinal = 0;
	
	
	public Venda() {}
	
	/***
	 * Cria uma venda entre fornecedor e cliente. O index(id) da venda é gerado automaticamente.
	 * @param fornecedor Fornecedor da venda
	 * @param cliente Comprador da venda
	 */
	public Venda(Fornecedor fornecedor, Cliente cliente) 
	{
		this.id = GlobalConfigurations.useGlobalTransactionIndex();
		this.fornecedor = fornecedor;
		this.cliente = cliente;
	}
	
	public void ExibirProdutos()
	{
		Iterator<Produto> iterator = this.produtos.iterator();
		
		while(iterator.hasNext()) 
		{
			Produto prod = iterator.next();
			
			System.out.println("Produto: " + prod.id);
			System.out.println("Nome: " + prod.nome);
			System.out.println("Preco: " + prod.preco);
			System.out.println("Descricao: " + prod.descricao);
			System.out.println("=================================");			
		}		
	}
	
	public void InserirProduto(Produto produto) 
	{
		this.produtos.add(produto);
		this.valorFinal += produto.preco;
	}
	
	public void RemoverProduto(Produto produto) 
	{
		this.produtos.remove(produto);
		this.valorFinal -= produto.preco;
	}
	

	public void RemoverProdutoNoIndex(int index) 
	{
		this.produtos.remove(index);
		this.valorFinal -= this.produtos.get(index).preco;
	}
	
	public void LimparProdutos() 
	{
		this.produtos.clear();
		this.valorFinal = 0;
	}

}
