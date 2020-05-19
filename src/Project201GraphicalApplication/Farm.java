/**
 * Farm class which including all the crop lists and animal list and items list
 */
package Project201GraphicalApplication;

import java.util.ArrayList;





public class Farm extends Observable{

	
	private String name ;
	private int type ;
	private int money;
	static boolean isChangeDay = false;
	static int area ;
	
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
		 if (type == 2)
			 money = 2400;
		 area = 1;
		 System.out.print("farm name set: "+ name);
		 
	}
	
	/**
	 * when expand Area , money - 200
	 * @param 
	 * @return  
	 */
	public void expandArea() {
		area ++;
		money -= 200;
	}
	
	/**
	 * get the current Area
	 * @param 
	 * @return  
	 */
	public int getArea() {
		return area;
	}
	
	/**
	 * set the current Area
	 * @param n
	 * @return  
	 */
	public void setArea(int n) {
		area = n;
	}
	
	/**
	 * set the current Area
	 * @param n
	 * @return  
	 */
	public void setType(int n)
	{
		type = n;
	}
	
	/**
	 * set the current Money
	 * @param leftMoney
	 * @return  
	 */
	public void setMoney(int leftMoney)
	{
		money = leftMoney;
	}
	
	/**
	 * set the farm name
	 * @param name
	 * @return  
	 */
	public void setName(String sname)
	{
		name = sname;
	}
	
	/**
	 * get the farm current money
	 * @param name
	 * @return  
	 */
	public int getMoney() {
		return money;
	}
		
	
	/**
	 * calculate money which decrease m 
	 * @param name
	 * @return  
	 */
	public void decreaseMoney(int m)
	{
		if(money >= m)
			{
			money -= m ;
			System.out.print(money);
			}
		else
			throw new IllegalArgumentException("oops, you do not have enough money to buy");
	}
	
	/**
	 * calculate money which increase m 
	 * @param name
	 * @return  
	 */
	public void increaseMoney(int m)
	{
		money += m;
	}
	
	
	/**
	 * when using the feedItems will need to -1 in the feedItemList 
	 * @param 
	 * @return  
	 */
	public void consumeFeedItems() {
		if( animalFeedItemsList.size() >= 1)
			animalFeedItemsList.remove(0);
		else
			throw new IllegalArgumentException("oops, you do not have enough food to feed animal");
			
	}
	
	/**
	 * when using the HappyAgentItem will need to -1 in the HappyAgentItemList 
	 * @param 
	 * @return  
	 */
	public void consumeHappyAgentItem() {
		if( happyAgentItemsList.size() >= 1)
			happyAgentItemsList.remove(0);
		else
			throw new IllegalArgumentException("oops, you do not have happy agent to use");
	}
	
	/**
	 * when using the TimeAgentItem will need to -1 in the TimeAgentItemList 
	 * @param 
	 * @return  
	 */
	public void consumeTimeAgentItem() {
		if( timeAgentitemsList.size() >= 1)
			timeAgentitemsList.remove(0);
		else
			throw new IllegalArgumentException("oops, you do not have time agent to use");
	}
	
	
	/**
	 * get the farm name
	 * @param 
	 * @return  
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * get the farm type
	 * @param 
	 * @return  
	 */
	public int getType()
	{
		return type;
	}
	
	
	
	/**
	 * when move to the next day this function will be invoked and notice the observer
	 * @param 
	 * @return  
	 */
	public void setIsChangeDay(boolean isChangeDay)
	{
		if(isChangeDay)
		{
			this.isChangeDay = isChangeDay;
			
			super.setChanged();
			super.notifyObservers("move to next day");
			
			money += getBouns(5);
		}
		else
			this.isChangeDay = isChangeDay;
	}

	
	/**
	 * when move to the next day the farm will get bonus by the crops which he owners
	 * @param 
	 * @return  
	 */
	public int getBouns(int ndollar) {
		int b = 0;
		b += pigList.size()*ndollar;
		b += henList.size()*ndollar;
		b += cowList.size()*ndollar;
		b += carrotList.size()*ndollar;
		b += cornList.size()*ndollar;
		b += eggplantList.size()*ndollar;
		b += kiwifruitList.size()*ndollar;
		b += tomatoList.size()*ndollar;
		return b;
	}
	

	/**
	 * if this accident happens, will increase bonus depends how many crops he have
	 * @param 
	 * @return  
	 */
	public int countryFairEvent()
	{
		int nIncreaseMoney = getBouns(10);
		increaseMoney(nIncreaseMoney);
		return nIncreaseMoney;
	}
	
	/**
	 * if this fenceBrokenEvent happens, will decrease animals randomly
	 * @param 
	 * @return  
	 */
	public int fenceBrokenEvent()
	{
		int count = 0;
		count += henList.size();
		count += cowList.size();
		count += pigList.size();
		final double d = Math.random();
		int lostCount = (int)(d*count);//get the random lost count
		for(int i = 0; i< lostCount; i++)
		{
			if(henList.size()>=1)
				henList.remove(henList.size()-1);
			else
			{
				if (cowList.size()>=1)
					cowList.remove(cowList.size()-1);
				else
					pigList.remove(pigList.size()-1);
				
			}
		}
		
		return lostCount;
	}
	
	/**
	 * if this droughtEvent happens, will decrease crops randomly
	 * @param 
	 * @return  
	 */
	public void droughtEvent(String seedName) {
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
