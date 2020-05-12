/**
 * 
 */
package Project201;

import java.util.ArrayList;
import java.util.Scanner;




public class Farm {

	
	private String name ;
	private int type ;
	private int money;
	private int playDays;
	Farmer myFarmer = new Farmer("");
	ArrayList <Animal> animalList = new ArrayList<Animal> ();
	ArrayList <Crop> cropList = new ArrayList<Crop> ();
	ArrayList <Items> itemList = new ArrayList<Items> ();
	/**
	 * 
	 */
	public Farm(int typeId, String farmName, String FarmerName, int nPlayDays) {
		// TODO Auto-generated constructor stub
		 type = typeId;
		 name = farmName;
		 myFarmer.setName(FarmerName);
		 playDays = nPlayDays;		 
		 money = 2000;
		 if (type == 4)
			 money = 2400;
		 
	}
	
	public void setType(int n)
	{
		type = n;
	}
	public void setMoney(int n)
	{
		money = n;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
		
	public int getMoney()
	{
		return money;
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
		
		String outString = "Welcome to " + name +" Farm, "+ myFarmer.getName() +" service for you. you have "+ money +" dollars";
		return outString;
	}
	
}
