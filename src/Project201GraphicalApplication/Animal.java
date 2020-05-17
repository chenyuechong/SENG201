package Project201GraphicalApplication;

import Lab7.GalaxyWeather;
import Lab7.Observable;
import Lab7.Observer;

public class Animal implements Observer {
	private String name = "";
	private double purchasePrice = 0.0;
	private double health = 0.0;
	private double happiness = 0.0;
	Items item;

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Received move to next day update!");
		this.happiness += 10;
		this.health += 10;
	}

	public void startObserving(Farm farm) {
		farm.addObserver(this);
	}

	public void stopObserving(Farm farm) {
		farm.deleteObserver(this);

	}

	public Animal() {

	}

	public Animal(String sname, double spurchasePrice, double shealth, double shappiness) {
		// TODO Auto-generated constructor stub
		name = sname;
		purchasePrice = spurchasePrice;
		health = shealth;
		happiness = shappiness;
	}

	public void feed() {
		this.health += 2;
	}

	public void play() {
		this.happiness += 10;
	}

	public void increaseHappiness() {
		this.happiness += 20;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getHealth() {
		return health;
	}

	public void setHappiness(double happiness) {
		this.happiness = happiness;
	}

	public double getHappiness() {
		return happiness;
	}
}
