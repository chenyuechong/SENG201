package Project201GraphicalApplication;
/**
 * 
 * Crop class super class for all crops and implement the observe when move to the next day signals
 */


public class Crop implements Observer {
	private String name = "";
	private int sellingPrice = 0;
	private int purchasePrice = 0;
	private int heigth = 0;
	private int harvestTime =0;
	private int leftTimeToHarvest = 0;
	private double seedTime = 0;
	Items item;

	
	/**
	 * when receive the farm message ,the animal will decrease their leftTimeToHarvest 5 and heigth + 5.
	 */
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
	
	/**
	 * decrease Harvest Time.when using time agent the harvest time  -2

	 */
	public void decreaseHarvestTime() {
		harvestTime -= 2;
		if (harvestTime <= 0)
			harvestTime = 0;
	}

	
	/**
	 * set Selling Price.

	 */
	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	/**
	 * get Selling Price.
	 */
	public int getSellingPrice() {
		return sellingPrice;
	}

	/**
	 * set Purchase Price.
	 */
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * get Purchase Price.

	 */
	public int getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * set heigth

	 */
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}


	/**
	 * get height

	 */
	public int getHeigth() {
		return heigth;
	}

	/**
	 * set Harvest Time
	 */
	public void setHarvestTime(int harvestTime) {
		this.harvestTime = harvestTime;
	}

	/**
	 * return Harvest Time

	 */
	public int getHarvestTime() {
		return harvestTime;
	}

	// public void setLeftTimeToHarvest(double leftTimeToHarvest)
	// {
	// this.leftTimeToHarvest = leftTimeToHarvest;
	// }

	/**
	 *get Left Time To Harvest
	 */
	public int getLeftTimeToHarvest() {
		return leftTimeToHarvest;
	}

	/**
	 * set Left Time To Harvers

	 */
	public void setLeftTimeToHarvers(int t) {
		leftTimeToHarvest = t;

	}
	
	/**
	 * water crop add 10 to height
 
	 */
	public void water()
	{
		heigth += 10;
		System.out.print("Crop watered height= "+ heigth );
	}

}
