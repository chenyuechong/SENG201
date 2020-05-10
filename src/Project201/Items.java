package Project201;

public class Items {
	private String name = "";
	private double purchasePrice = 0.0;
	private String functionDetail = "";
	public Items(String sName, double sPurchasePrice, String sFunctionDetail) {
		// TODO Auto-generated constructor stub
		name = sName;
		purchasePrice = sPurchasePrice;
		functionDetail = sFunctionDetail;
	}
	
	public void setPurchasePrice(double purchasePrice)
	{
		 this.purchasePrice = purchasePrice;
	}
	public double getPurchasePrice()
	{
		return purchasePrice;
	}
	
	
	
}
