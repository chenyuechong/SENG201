package Project201GraphicalApplication;




public class Animal implements Observer {
	private String name = "";
	private int purchasePrice = 0;
	private int health = 0;
	private int happiness = 0;
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

	public Animal(String sname, int spurchasePrice, int shealth, int shappiness) {
		// TODO Auto-generated constructor stub
		name = sname;
		purchasePrice = spurchasePrice;
		health = shealth;
		happiness = shappiness;
	}

	public void feed() {
		this.health += 10;
	}

	public void play() {
		this.happiness += 10;
	}

	public void increaseHappiness() {
		this.happiness += 20;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public int getHappiness() {
		return happiness;
	}
}
