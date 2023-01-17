package loja;

public abstract class Entidade {	
	int id;
	String nome;	

	public Entidade() {}
	public Entidade(int id, String nome) 
	{
		this.id = id;
		this.nome = nome;
	}
}
