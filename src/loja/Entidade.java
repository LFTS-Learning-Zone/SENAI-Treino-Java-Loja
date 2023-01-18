package loja;

public abstract class Entidade {	
	int id;
	String nome;
	
	Conta conta;

	public Entidade() {}
	public Entidade(int id, String nome) 
	{
		this.id = id;
		this.nome = nome;
		this.conta = new Conta();
	}
	
	public String getNome() 
	{
		return this.nome;
	}
}
