package loja;

import java.util.ArrayList;
import java.util.Iterator;

public class Venda {

	int id;
	Fornecedor fornecedor;
	Cliente cliente;
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	double valorFinal;
	
	
	public Venda() {}
	
	
	public Venda(int id, Fornecedor fornecedor, Cliente cliente) {
		super();
		this.id = id;
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
	}
	
	public void RemoverProduto(Produto produto) 
	{
		this.produtos.remove(produto);
	}
	
	public void RemoverProdutoNoIndex(int index) 
	{
		this.produtos.remove(index);
	}
	
	public void LimparProdutos() 
	{
		this.produtos.clear();
	}

}
