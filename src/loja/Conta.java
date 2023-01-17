package loja;

import java.util.ArrayList;
import java.util.Iterator;

public class Conta {
	
	ArrayList<Venda> historicoVendas;
		
	public Conta() 
	{
		this.historicoVendas = new ArrayList<Venda>();
	}
	
	public void ExibirHistoricoVendas() 
	{
		Iterator<Venda> it = this.historicoVendas.iterator();
		
		while(it.hasNext()) 
		{
			Venda venda = it.next();
			System.out.println("Venda No - " + venda.id);
			System.out.println("Cliente - " + venda.cliente);
			System.out.println("Fornecedor - " + venda.fornecedor);
			System.out.println("Valor Final - " + venda.valorFinal);
			System.out.println("==================================");
		}
	}
	
	public void InserirVenda(Venda venda) 
	{
		this.historicoVendas.add(venda);
	}
}
