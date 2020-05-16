/**
 * 
 */
package Project201;

import java.util.ArrayList;




public class Farm {

	
	private String name ;
	private int type ;
	private double money;

	static ArrayList <Pig> pigList = new ArrayList<Pig> ();
	static ArrayList <Hen> henList = new ArrayList<Hen> ();
	static ArrayList <Cow> cowList = new ArrayList<Cow> ();
	static ArrayList <Carrot> carrotList = new ArrayList<Carrot> ();
	static ArrayList <Corn> cornList = new ArrayList<Corn> ();
	static ArrayList <Eggplant> eggplantList = new ArrayList<Eggplant> ();
	static ArrayList <KiwiFruit> kiwifruitList = new ArrayList<KiwiFruit> ();
	static ArrayList <Tomato> tomatoList = new ArrayList<Tomato> ();
	
	static ArrayList <AnimalFeedItems> animalFeedItemsList = new ArrayList<AnimalFeedItems> ();
	static ArrayList <HappyAgentItems> happyAgentItemsList = new ArrayList<HappyAgentItems> ();
	static ArrayList <TimeAgentItems> timeAgentitemsList = new ArrayList<TimeAgentItems> ();
	

	/**
	 * 
	 */
	public Farm( int typeId, String farmName) {
		// TODO Auto-generated constructor stub
		type = typeId;
		name = farmName;
		 money = 2000;
		 if (type == 4)
			 money = 2400;
		 
	}
	
	public void setType(int n)
	{
		type = n;
	}
	public void setMoney(double leftMoney)
	{
		money = leftMoney;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public double getMoney() {
		return this.money;
	}
		
	public void decreaseMoney(double m)
	{
		if(this.money >= m)
			this.money -=m ;
		else
			throw new IllegalArgumentException("oops, you do not have enough money to buy");
	}
	
	public void increaseMoney(double m)
	{
		this.money += m;
	}
	
	public void consumeFeedItems() {
		if( animalFeedItemsList.size() >= 1)
			animalFeedItemsList.remove(0);
		else
			throw new IllegalArgumentException("oops, you do not have enough food to feed animal");
			
	}
	
	public void consumeHappyAgentItem() {
		if( happyAgentItemsList.size() >= 1)
			happyAgentItemsList.remove(0);
		else
			throw new IllegalArgumentException("oops, you do not have happy agent to use");
	}
	
	public void consumeTimeAgentItem() {
		if( timeAgentitemsList.size() >= 1)
			timeAgentitemsList.remove(0);
		else
			throw new IllegalArgumentException("oops, you do not have time agent to use");
	}
	
	public String getName()
	{
		return name;
	}
	public int getType()
	{
		return type;
	}
	public void lostCrop(String seedName) {
		switch(seedName) {
		case "Corn":
			int len = cornList.size();
			for (int i = 0; i< len/2; i ++)
				cornList.remove(i);
			break;
		case "Carrot":
			int lenc = carrotList.size();
			for (int i = 0; i< lenc/2; i ++)
				carrotList.remove(i);
			break;
		case "Eggplant":
			int lene = eggplantList.size();
			for (int i = 0; i< lene/2; i ++)
				eggplantList.remove(i);
			break;
		case "KiwiFruit":
			int lenk = kiwifruitList.size();
			for (int i = 0; i< lenk/2; i ++)
				kiwifruitList.remove(i);
			break;
		case "Tomato":
			int lent = tomatoList.size();
			for (int i = 0; i< lent/2; i ++)
				tomatoList.remove(i);
			break;
		}
	}
	
	
	public String toString()
	{
		
		String outString = "Welcome to " + name +" Farm, "+" you have "+ money +" dollars \n";
		return outString;
	}
	
}
