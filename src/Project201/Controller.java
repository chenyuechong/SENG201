package Project201;

public class Controller {
	
	static Farm myFarm ;
	static Farmer myFarmer;
	static int playDays;
	static int farmType;
	static String[] crops = {"Carrot", "Corn", "Eggplant", "KiwiFruit", "Tomato"};
	static String[] animals = {"Pig", "Hen", "Cow"};
	static String[] items = {"AnimalFeedItems", "HappyAgentItems", "TimeAgentItems"};
	
	public static void createFarm(int typeId, String farmerName, String farmName, int nPlayDays)
	{
		myFarm = new Farm(typeId,farmName.toUpperCase() );
		System.out.print(myFarm.toString());
		myFarmer = new Farmer(farmerName);
		playDays = nPlayDays;
		farmType = typeId;
		
	}
	
	public static void buySeed(int index,int count)
	{System.out.print("need to buy "+ count +"seeds\n");
		for(int i =0; i< count; i++)
		{
			myFarmer.buySeed(crops[index - 1], myFarm);
		}
		System.out.print("you bought "+ crops[index - 1] + " count:" + count +", there are "+ myFarm.getMoney()+ " dollars left\n");		
	}
	
	public static void buyAnimal(int index,int count)
	{
		System.out.print("need to buy "+ count +"animals\n");
		for(int i =0; i< count; i++)
		{
			myFarmer.buyAnimal(animals[index - 1], myFarm);
		}
		System.out.print("you bought "+ animals[index - 1] + " count:" + count +", there are "+ myFarm.getMoney()+ " dollars left\n");		
	}
	
	public static void buyItems(int index,int count)
	{
		System.out.print("need to buy "+ count +"items\n");
		for(int i =0; i< count; i++)
		{
			myFarmer.buyItems(items[index - 1], myFarm);
		}
		System.out.print("you bought "+ items[index - 1] + " count:" + count +", there are "+ myFarm.getMoney()+ " dollars left\t");		
	}

	public static void showStore()
	{
		for(int i = 0; i<5; i++)
		{
			System.out.print("You have " + myFarmer.countCrops(crops[i], myFarm) +" " + crops[i] + "\n");
		}
		for(int i = 0; i<3; i++)
		{
			System.out.print("You have " + myFarmer.countAnimal(animals[i], myFarm) +" " + animals[i] + "\n");
		}
		
		for(int i = 0; i<3; i++)
		{
			System.out.print("You have " + myFarmer.countItems(items[i], myFarm) +" " + items[i] + "\n");
		}
	}


}
