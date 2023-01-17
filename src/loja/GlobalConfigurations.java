package loja;

public final class GlobalConfigurations {
	protected static int GLOBAL_TRANSACTION_INDEX = 0;
	
	public static int useGlobalTransactionIndex() 
	{
		GLOBAL_TRANSACTION_INDEX++;
		return GLOBAL_TRANSACTION_INDEX;
		
	}
	
	
	
}
