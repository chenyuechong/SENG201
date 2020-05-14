package Project201;

public class Crop {
	private String name = "";
	private double sellingPrice = 0.0;
	private double purchasePrice = 0.0;
	private double heigth = 0.0;
	private double harvestTime = 0.0;
	private double leftTimeToHarvest = 0.0;
	private double seedTime = 0.0;
	Items item ;

	
	public Crop(String sName, double sPurchasePrice,  double sSellingPrice,double sHeigth,double sHarvestTime) {
		// TODO Auto-generated constructor stub
		name = sName;
		purchasePrice = sPurchasePrice;
		sellingPrice = sSellingPrice;
		heigth = sHeigth;
		harvestTime = sHarvestTime;
		leftTimeToHarvest = harvestTime;
		seedTime = System.currentTimeMillis();
	}
	public void decreaseHarvestTime(Items item ) {
		this.harvestTime -= 2.0;
	}
	
	public void setSellingPrice(double sellingPrice)
	{
		 this.sellingPrice = sellingPrice;
	}
	public double getSellingPrice()
	{
		return sellingPrice;
	}
	
	public void setPurchasePrice(double purchasePrice)
	{
		 this.purchasePrice = purchasePrice;
	}
	public double getPurchasePrice()
	{
		return purchasePrice;
	}
	
	public void setHeigth(double heigth)
	{
		 this.heigth = heigth;
	}
	public double getHeigth()
	{
		return heigth;
	}
	
	public void setHarvestTime(double harvestTime)
	{
		 this.harvestTime = harvestTime;
	}
	public double getHarvestTime()
	{
		return harvestTime;
	}
	
	//public void setLeftTimeToHarvest(double leftTimeToHarvest)
	//{
		// this.leftTimeToHarvest = leftTimeToHarvest;
	//}
	
	public double getLeftTimeToHarvest()
	{
		double time = System.currentTimeMillis();
		leftTimeToHarvest = time - this.seedTime;
		return leftTimeToHarvest;
	}
	

}
