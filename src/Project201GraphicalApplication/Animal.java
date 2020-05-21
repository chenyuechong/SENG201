/**
 * 
 * Animal class the super class for any animals
 */

package Project201GraphicalApplication;



public class Animal implements Observer {
	private String name = "";
	private int purchasePrice = 0;
	private int health = 0;
	private int happiness = 0;
	private boolean isIncrease ;

	
	/**
	 * when receive the farm message ,the animal will increase their happiness 10 and health + 10.
	 */
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Received move to next day update!");
		this.happiness += 10;
		this.health += 10;
		isIncrease = false;
	}

	/**
	 * startObserving.
	 * @param farm
	 */
	public void startObserving(Farm farm) {
		farm.addObserver(this);
	}

	/**
	 * stopObserving.

	 */
	public void stopObserving(Farm farm) {
		farm.deleteObserver(this);

	}

	public Animal() {

	}


	/**
	 * constructor.
 * @param   sname,  spurchasePrice,  health,  happiness
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

	 */
	public void feed() {
		if(isIncrease)
			this.health += 15;
		else
			this.health += 10;
	}

	/**
	 * play with animal, increase happiness.
	 */
	public void play() {
		if(isIncrease)
			this.happiness += 15;
		else
			this.happiness += 10;
	}

	
	/**
	 * when using happyAgentItems, increase happiness.
	 */
	public void increaseHappiness() {
		if(isIncrease)
			this.happiness += 30;
		else
			this.happiness += 15;
	}

	
	/**
	 * setPurchasePrice.

	 */
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * getPurchasePrice.
	 */
	public int getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * setHealth.
	 * @param  health

	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * getHealth

	 * @return 
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * setHappiness.
	 * @param  happiness
	 */
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	
	/**
	 * getHappiness.
	 * @return happiness
	 */
	public int getHappiness() {
		return happiness;
	}
	
	/**
	 * if isIncrease  =  true, this animal's happiness will 20% more than usual
	 * 
	 */
	public void setIsIncrease() {
		isIncrease = true;
	}
}
