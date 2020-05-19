package Project201GraphicalApplication;




public class Animal implements Observer {
	private String name = "";
	private int purchasePrice = 0;
	private int health = 0;
	private int happiness = 0;
	Items item;

	
	/**
	 * when receive the farm message ,the animal will increase their happiness and health.
	 * @param farm
	 * @return 
	 */
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Received move to next day update!");
		this.happiness += 10;
		this.health += 10;
	}

	/**
	 * startObserving.
	 * @param farm
	 * @return 
	 */
	public void startObserving(Farm farm) {
		farm.addObserver(this);
	}

	/**
	 * stopObserving.
	 * @param farm
	 * @return 
	 */
	public void stopObserving(Farm farm) {
		farm.deleteObserver(this);

	}

	public Animal() {

	}


	/**
	 * constructor.
	 * @param name, purchasePrice,health,happiness
	 * @return 
	 */
	public Animal(String sname, int spurchasePrice, int shealth, int shappiness) {
		// TODO Auto-generated constructor stub
		name = sname;
		purchasePrice = spurchasePrice;
		health = shealth;
		happiness = shappiness;
	}

	/**
	 * feed animal, increase health.
	 * @param 
	 * @return 
	 */
	public void feed() {
		this.health += 10;
	}

	/**
	 * play with animal, increase happiness.
	 * @param 
	 * @return 
	 */
	public void play() {
		this.happiness += 10;
	}

	
	/**
	 * when using happyAgentItems, increase happiness.
	 * @param 
	 * @return 
	 */
	public void increaseHappiness() {
		this.happiness += 20;
	}

	
	/**
	 * setPurchasePrice.
	 * @param  purchasePrice
	 * @return 
	 */
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * getPurchasePrice.
	 * @param  
	 * @return purchasePrice
	 */
	public int getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * setHealth.
	 * @param  health
	 * @return 
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * getHealth
	 * @param  
	 * @return 
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * setHappiness.
	 * @param  happiness
	 * @return 
	 */
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	
	/**
	 * getHappiness.
	 * @param  
	 * @return happiness
	 */
	public int getHappiness() {
		return happiness;
	}
}
