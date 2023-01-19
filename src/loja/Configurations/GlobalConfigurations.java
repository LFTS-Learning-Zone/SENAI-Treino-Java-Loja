package loja.Configurations;

public final class GlobalConfigurations {
	private static int GLOBAL_TRANSACTION_INDEX = 0;	
	private static int GLOBAL_PRODUCT_INDEX = 0;
	
	
	/***
	 * Gets the current Transaction Index. DOES NOT UPDATE THE INDEX NUMBER.
	 * @return current index number
	 */
	public static int getCurrentGlobalTransactionIndex() 
	{
		return GLOBAL_TRANSACTION_INDEX;		
	}
	
	/***
	 * Auto-Increments the Transaction index.
	 * @return Next index number
	 */
	public static int useGlobalTransactionIndex() 
	{
		GLOBAL_TRANSACTION_INDEX++;
		return GLOBAL_TRANSACTION_INDEX;		
	}
	
	/***
	 * Gets the current Product Index. DOES NOT UPDATE THE INDEX NUMBER.
	 * @return Current index number
	 */
	public static int getCurrentGlobalProductIndex() 
	{
		return GLOBAL_TRANSACTION_INDEX;		
	}
	
	/***
	 * Auto-Increments the product index. 
	 * @return Next index number
	 */
	public static int useGlobalProductIndex() 
	{
		GLOBAL_PRODUCT_INDEX++;
		return GLOBAL_PRODUCT_INDEX;		
	}
	
	
	
}
