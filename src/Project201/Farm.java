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
		 this.money -=m ;
		 System.out.print("count money: "+ this.money+ "+"+ m +"\n");
	}
	
	public void increaseMoney(double m)
	{
		this.money += m;
	}
	public String getName()
	{
		return name;
	}
	public int getType()
	{
		return type;
	}
	
	
	public String toString()
	{
		
		String outString = "Welcome to " + name +" Farm, "+" you have "+ money +" dollars \n";
		return outString;
	}
	
}
