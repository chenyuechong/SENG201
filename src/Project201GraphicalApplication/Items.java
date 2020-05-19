package Project201GraphicalApplication;

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
	
	public void setPurchasePrice(int purchasePrice)
	{
		 this.purchasePrice = purchasePrice;
	}
	public int getPurchasePrice()
	{
		return purchasePrice;
	}
	
	
	
}
