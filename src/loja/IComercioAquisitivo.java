package loja;

import java.util.ArrayList;

public interface IComercioAquisitivo {

	void Comprar(Produto produto, Fornecedor fornecedor);
	void Comprar(ArrayList<Produto> produtos, Fornecedor fornecedor);

	//As opcoes abaixo NAO serao implementadas
	void Devolucao();

	void Alugar();

}