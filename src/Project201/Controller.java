package Project201;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.lang.Math;

public class Controller {
	
	static Farm myFarm ;
	static Farmer myFarmer;
	static int playDays;
	static int farmType;
	static String[] crops = {"Carrot", "Corn", "Eggplant", "KiwiFruit", "Tomato"};
	static String[] animals = {"Pig", "Hen", "Cow"};
	static String[] items = {"AnimalFeedItems", "HappyAgentItems", "TimeAgentItems"};
	
	///(a) The wells have dried up, and the crops are thirsty.
	//(b) The player loses half of their growing crops. The exact crops are determined randomly.
	public  void drought() {
		Random random = new Random();
		int i = random.nextInt(5);
		myFarm.lostCrop(crops[i - 1]);
		
	}
	
	//(a) One or more of your animals have escaped through a broken fence.
	//(b) The player loses one or more of their animals, the exact number	determined randomly.
	//(c) The remaining animals lose a substantial amount of happiness.
	public static void brokenfence() {
		Random random = new Random();
		int i2 = random.nextInt(3);
		
		
	}
	//(a) Your farm has won the top award at the annual county fair.
	//(b) The player earns a reasonable sum of money.
	//(c) The amount of money earned should be scaled by the number of crops and animals the farm contains.
	public static void countyFair() {
		Random random = new Random();
		int i2 = random.nextInt(100);
		
	}
	
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
			writeToFile(crops[i]+ "-"+ myFarmer.countCrops(crops[i], myFarm));
		}
		for(int i = 0; i<3; i++)
		{
			System.out.print("You have " + myFarmer.countAnimal(animals[i], myFarm) +" " + animals[i] + "\n");
			writeToFile(animals[i]+ "-"+ myFarmer.countAnimal(animals[i], myFarm));
		}
		
		for(int i = 0; i<3; i++)
		{
			System.out.print("You have " + myFarmer.countItems(items[i], myFarm) +" " + items[i] + "\n");
			writeToFile(items[i]+ "-"+ myFarmer.countItems(items[i], myFarm));
		}
		
	}

	
	public static String readFromFile() {
		String s ="";
		 try {
			 	
	            FileReader reader = new FileReader("MyFile.txt");
	            int character;
	 
	            while ((character = reader.read()) != -1) {
	                s += (char)character;
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 return s;
		 
	}
	
	public static void writeToFile(String s) {
		try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            writer.write(s);
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
