package loja;

import loja.Interfaces.IComercioVenda;

public class Fornecedor extends Entidade implements IComercioVenda {

	
	public Fornecedor() {}
	
	public Fornecedor(int id, String nome) {
		super(id, nome);
	}
	
	@Override
	public void Vender(Produto produto, Cliente cliente) {
		
	}	
}
