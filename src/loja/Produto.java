package loja;

public class Produto {

	int id;
	String nome;
	double preco;
	String descricao;
	
	public Produto() {}

	public Produto(String nome, double preco, String descricao) {
		super();
		this.id = GlobalConfigurations.useGlobalProductIndex();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Produto(String nome, double preco) {
		super();
		this.id = GlobalConfigurations.useGlobalProductIndex();
		this.nome = nome;
		this.preco = preco;
	}
	
	

}
