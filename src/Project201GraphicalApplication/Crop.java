package Project201GraphicalApplication;



public class Crop implements Observer {
	private String name = "";
	private int sellingPrice = 0;
	private int purchasePrice = 0;
	private int heigth = 0;
	private int harvestTime =0;
	private int leftTimeToHarvest = 0;
	private double seedTime = 0;
	Items item;

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Received move to next day update!");
		this.leftTimeToHarvest -= 5;
		if(this.leftTimeToHarvest <= 0)
			this.leftTimeToHarvest = 0;
		this.heigth += 5;
	}

	public void startObserving(Farm farm) {
		farm.addObserver(this);
	}

	public void stopObserving(Farm farm) {
		farm.deleteObserver(this);

	}

	public Crop() {

	}

	public Crop(String sName, int sPurchasePrice, int sSellingPrice, int sHeigth, int sHarvestTime) {
		// TODO Auto-generated constructor stub
		name = sName;
		purchasePrice = sPurchasePrice;
		sellingPrice = sSellingPrice;
		heigth = sHeigth;
		harvestTime = sHarvestTime;
		leftTimeToHarvest = harvestTime;
		seedTime = System.currentTimeMillis();
	}

	public void decreaseHarvestTime() {
		harvestTime -= 2.0;
		if (harvestTime <= 0)
			harvestTime = 0;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHarvestTime(int harvestTime) {
		this.harvestTime = harvestTime;
	}

	public int getHarvestTime() {
		return harvestTime;
	}

	// public void setLeftTimeToHarvest(double leftTimeToHarvest)
	// {
	// this.leftTimeToHarvest = leftTimeToHarvest;
	// }

	public int getLeftTimeToHarvest() {
		return leftTimeToHarvest;
	}

	public void setLeftTimeToHarvers(int t) {
		leftTimeToHarvest = t;

	}
	
	public void water()
	{
		heigth += 10;
		System.out.print("Crop watered height= "+ heigth );
	}

}
