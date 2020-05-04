package Project201;

public class Animal {
	private double purchasePrice = 0.0;
	private double health = 0.0;
	private double happiness = 0.0;
	
	
	public void setPurchasePrice(double purchasePrice)
	{
		 this.purchasePrice = purchasePrice;
	}
	public double getPurchasePrice()
	{
		return purchasePrice;
	}
	
	public void setHealth(double health)
	{
		 this.health = health;
	}
	public double getHealth()
	{
		return health;
	}
	
	public void setHappiness(double happiness)
	{
		 this.happiness = happiness;
	}
	public double getHappiness()
	{
		return happiness;
	}
}
