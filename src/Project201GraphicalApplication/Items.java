package Project201GraphicalApplication;

/**
 * items class is the super class for anyother item class
 */
public class Items {
	private String name = "";
	private int purchasePrice = 0;
	private String functionDetail = "";
	public Items(String sName, int sPurchasePrice, String sFunctionDetail) {
		// TODO Auto-generated constructor stub
		name = sName;
		purchasePrice = sPurchasePrice;
		functionDetail = sFunctionDetail;
	}
	
	/**
	 * set Purchase Price
	 * @param 
	 * @return 
	 */
	public void setPurchasePrice(int purchasePrice)
	{
		 this.purchasePrice = purchasePrice;
	}
	/**
	 * return the purchasePrice
	 * @param 
	 * @return 
	 */
	public int getPurchasePrice()
	{
		return purchasePrice;
	}
	
	
	
}
