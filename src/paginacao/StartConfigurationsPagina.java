package paginacao;

import java.util.ArrayList;
import java.util.Scanner;

import loja.Interfaces.IPaginaExibicao;

public class StartConfigurationsPagina extends Pagina 
	implements IPaginaExibicao
{
	
	Scanner s = new Scanner(System.in);
	
	public StartConfigurationsPagina() 
	{
		super();
	}
	
	public StartConfigurationsPagina(String titulo, String conteudo, ArrayList<String> opcoes) 
	{
		super(titulo, conteudo, opcoes);
	}
	
	
	public static void ExibirPagina() 
	{
		System.out.printf("%s\n", StartConfigurationsPagina.titulo);
		System.out.printf("%s\n", StartConfigurationsPagina.conteudo);
		
		StartConfigurationsPagina.opcoes.forEach((opcao) -> System.out.printf("%s\n", opcao));
	}
	
	
	
	
	
	
	
}
