/**
 * 
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
	
	
	public void expandArea() {
		area ++;
		money -= 200;
	}
	
	public int getArea() {
		return area;
	}
	
	public void setArea(int n) {
		area = n;
	}
	
	public void setType(int n)
	{
		type = n;
	}
	
	public void setMoney(int leftMoney)
	{
		money = leftMoney;
	}
	
	public void setName(String sname)
	{
		name = sname;
	}
	
	public int getMoney() {
		return money;
	}
		
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
	
	public void increaseMoney(int m)
	{
		money += m;
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
	

	public int countryFairEvent()
	{
		int nIncreaseMoney = getBouns(10);
		increaseMoney(nIncreaseMoney);
		return nIncreaseMoney;
	}
	
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
