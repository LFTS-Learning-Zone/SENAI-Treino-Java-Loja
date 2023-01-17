package loja;

public class Produto {

	int id;
	String nome;
	double preco;
	String descricao;
	
	public Produto() {}

	public Produto(int id, String nome, double preco, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Produto(int id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	

}
