package Project201GraphicalApplication;

import Lab7.Observable;
import Lab7.Observer;

public class Crop implements Observer {
	private String name = "";
	private double sellingPrice = 0.0;
	private double purchasePrice = 0.0;
	private double heigth = 0.0;
	private double harvestTime = 0.0;
	private double leftTimeToHarvest = 0.0;
	private double seedTime = 0.0;
	Items item;

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Received move to next day update!");
		this.leftTimeToHarvest -= 5;
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

	public Crop(String sName, double sPurchasePrice, double sSellingPrice, double sHeigth, double sHarvestTime) {
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
		this.harvestTime -= 2.0;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHarvestTime(double harvestTime) {
		this.harvestTime = harvestTime;
	}

	public double getHarvestTime() {
		return harvestTime;
	}

	// public void setLeftTimeToHarvest(double leftTimeToHarvest)
	// {
	// this.leftTimeToHarvest = leftTimeToHarvest;
	// }

	public double getLeftTimeToHarvest() {
		return leftTimeToHarvest;
	}

	public void setLeftTimeToHarvers(double t) {
		leftTimeToHarvest = t;

	}
	
	public void water()
	{
		heigth += 10;
		System.out.print("Crop watered height= "+ heigth );
	}

}
