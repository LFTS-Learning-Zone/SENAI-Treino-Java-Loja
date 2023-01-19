package loja;

import java.util.ArrayList;

import loja.Interfaces.IComercioAquisitivo;

public class Cliente extends Entidade implements IComercioAquisitivo {
	
	public Cliente() {}
	public Cliente(int id, String nome) {
		super(id, nome);
	}

	/***
	 * DEPRECIADO | Adiciona um único produto para compra.
	 */
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

	/***
	 * Adiciona produtos para uma compra
	 */
	@Override
	public void Comprar(ArrayList<Produto> produtos, Fornecedor fornecedor) {
		//Cria uma nova Venda
		Venda venda = new Venda(fornecedor, this);
		
		//Popula a venda com o produto escolhido
		produtos.forEach((produto) -> venda.InserirProduto(produto));

		//Adiciona esta venda ao historico do Cliente e Fornecedor
		this.conta.historicoVendas.add(venda);		
		fornecedor.conta.historicoVendas.add(venda);
		
	}	
	
	//Funcao somente para exemplificar
	@Override
	public void Devolucao() {
		//Devolver produto para fornecedor
	}

	//Funcao somente para exemplificar
	@Override
	public void Alugar() {
		//Alugar um produto de um fornecedor
	}
}
