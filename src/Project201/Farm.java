/**
 * 
 */
package Project201;

import java.util.Scanner;




public class Farm {

	
	private String name ;
	private int type ;
	private int money;
	private int playDays;
	Farmer myFarmer = new Farmer("");
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
	
	
	
	public static void main(String[] args) {
		System.out.print("please input how many days do you want to play(5-10 days)：");
		Scanner input1=new Scanner(System.in);
		int playDays=input1.nextInt();
		
		/*public final static boolean isNumeric(String s) {  
	        if (s != null && !"".equals(s.trim()))  
	            return s.matches("^[0-9]*$");  
	        else  
	            return false;  
	    } 
		if (isNumeric(playDays))
			System.out.println("Thanks you select play "+playDays+ " days");
		else
			System.out.print("please input how many days do you want to play(5-10 days)：");
		*/
				
		System.out.print("what's your farmer's name?");
		Scanner input2=new Scanner(System.in);
		String farmerName = input2.nextLine();
		System.out.println("Your farmer's name is "+farmerName);
		System.out.print("please select which types of farm do you like： \n");
		System.out.print("1： normal \n");
		System.out.print("2： crop which gorwth 20% than the noraml \n");
		System.out.print("3： animal's happiness 20% more than normal \n");
		System.out.print("4： base money 20% more than normal\n");
		Scanner input3=new Scanner(System.in);
		String typeId=input3.nextLine();;
		System.out.println("You select the "+String.valueOf(typeId)+ " type farm \n");
		System.out.print("what's your farm's name?\n");
		Scanner input4=new Scanner(System.in);
		String farmName = input4.nextLine();
		System.out.println("Your farm's name is "+farmName + "\nlet's start adventure.");
		Farm myFarm = new Farm(Integer.parseInt(typeId),farmerName, farmName,playDays );
		System.out.print(myFarm.toString());
	}
	
	
}
