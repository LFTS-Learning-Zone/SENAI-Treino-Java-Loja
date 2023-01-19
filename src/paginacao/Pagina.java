package paginacao;

import java.util.ArrayList;

public abstract class Pagina {
	
	protected String _TITULO = "";
	protected String _CONTEUDO = "";
	protected ArrayList<String> _OPCOES;
	
	protected static String titulo= "";
	protected static String conteudo = "";
	protected static ArrayList<String> opcoes;
	
	public Pagina() {};
	
	public Pagina(String titulo, String conteudo, ArrayList<String> opcoes) 
	{
		this._TITULO= titulo;
		this._CONTEUDO = conteudo;
		this._OPCOES = opcoes;
		
		Pagina.titulo = titulo;
		Pagina.conteudo = conteudo;
		Pagina.opcoes = opcoes;
	};	
	
	
	
	
	public static void VoltarPaginaHistorico() 
	{
		
	}
	
	public static void AvancarPaginaHistorico() 
	{
		
	}
}
