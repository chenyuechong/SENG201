package Project201;

public class Animal {
	private String name = "";
	private double purchasePrice = 0.0;
	private double health = 0.0;
	private double happiness = 0.0;
	Items item ;

	public Animal(String sname, double spurchasePrice, double shealth, double shappiness) {
		// TODO Auto-generated constructor stub
		name = sname;
		purchasePrice = spurchasePrice;
		health = shealth;
		happiness = shappiness;
	}
	public void Feed(Items item)
	{
		this.health *= 2;
	}
	
	public void play() {
		this.happiness += 10;
	}
	
	public void makeHappy(Items item) {
		this.happiness += 20;
	}
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
