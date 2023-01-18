package loja;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Cliente c = new Cliente(1, "Joao");
		Fornecedor f = new Fornecedor(999, "Mitsubishi");
		
		
		Produto xampu = new Produto("Xampu da Xuxa", 19.99, "Limpa todos dos baixinhos e baixinhas");
		Produto escova = new Produto("Escova de Cabelo", 45.50);
		Venda venda = new Venda(f, c);
		
		
		//venda.InserirProduto(xampu);
		//venda.InserirProduto(escova);
		//venda.ExibirProdutos();
		
		System.out.println(c.nome);
		
		
		c.Comprar(escova, f);
		c.conta.ExibirHistoricoVendas();
		f.conta.ExibirHistoricoVendas();
		
	}

}