package Project201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import Lab7.Observable;

import java.lang.Math;

public class Controller {
	
	static Farm myFarm ;
	static Farmer myFarmer;
	static int playDays;
	static int currentDay;
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
		currentDay = 1;
		
	}
	
	
	//check farm can got how many bonus
	public static void moveToNextDay()
	{
		currentDay ++;
		myFarm.setIsChangeDay(true);		
	}
	
	public static void playWithAnimal(int index)
	{
		try {
			
				myFarmer.playWithAnimal(animals[index-1], myFarm);
				System.out.print("You have played with  " + animals[index-1] + "for a while\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
		
	}
	
	public static void feedAnimal(int index)
	{
		try {		
			myFarmer.feedAnimal(animals[index-1], myFarm);
			System.out.print("You have played with  " + animals[index-1] + "for a while\n");		
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		}
	}
	
	public static void useTimeAgent(int index)
	{
		try {		
			myFarmer.useTimeAgentItem(crops[index-1], myFarm);
			System.out.print("You have used the timeAgentItem to " + crops[index-1] + "\n");		
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		}
	}
	
	public static void useHappyAgent(int index) {
		try {		
			myFarmer.useHappyAgentItem(animals[index-1], myFarm);
			System.out.print("You have used happyAgentItem to   " + animals[index-1] + "\n");		
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		}
	}
	
	
	public static void buySeed(int index, int count) {		
		try {
			System.out.print("need to buy " + count + "seeds\n");
			for (int i = 0; i < count; i++) {
				myFarmer.buySeed(crops[index - 1], myFarm);
			}
			System.out.print("you bought " + crops[index - 1] + " count:" + count + ", there are " + myFarm.getMoney()
					+ " dollars left\n");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
	
	public static void buyAnimal(int index, int count) {
		try {
			System.out.print("need to buy " + count + "animals\n");
			for (int i = 0; i < count; i++) {
				myFarmer.buyAnimal(animals[index - 1], myFarm);
			}
			System.out.print("you bought " + animals[index - 1] + " count:" + count + ", there are " + myFarm.getMoney()
					+ " dollars left\n");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}

	public static void buyItems(int index, int count) {
		try {
			System.out.print("need to buy " + count + "items\n");
			for (int i = 0; i < count; i++) {
				myFarmer.buyItems(items[index - 1], myFarm);
			}
			System.out.print("you bought " + items[index - 1] + " count:" + count + ", there are " + myFarm.getMoney()
					+ " dollars left\n");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}

	
	
	public static void showStore()
	{
		System.out.print( "You have\n crops:  ");
		for(int i = 0; i<5; i++)
		{
			System.out.print( crops[i] + ":"+ myFarmer.countCrops(crops[i], myFarm) +"   " );
			//writeToFile(crops[i]+ "-"+ myFarmer.countCrops(crops[i], myFarm));
		}
		System.out.print( "\n");
		System.out.print("animals:  ");
		for(int i = 0; i<3; i++)
		{
			System.out.print(animals[i] + ":"+ myFarmer.countAnimal(animals[i], myFarm) +"   " );
			//writeToFile(animals[i]+ "-"+ myFarmer.countAnimal(animals[i], myFarm));
		}
		System.out.print( "\n");
		System.out.print("items:  ");
		for(int i = 0; i<3; i++)
		{
			System.out.print(items[i] + ":" + myFarmer.countItems(items[i], myFarm) + "  " );
			//writeToFile(items[i]+ "-"+ myFarmer.countItems(items[i], myFarm));
		}
		System.out.print( "\n");
		
	}


	
	
 	public static String readFromFile() {
		String s ="";
		 try {
			 	
	            FileReader reader = new FileReader("farm.txt");
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
	
	public static void writePlayConfigureToFile() {
		String s ="";
		s= "money-" + myFarm.getMoney()+"\n";
		s+= myFarmer.getItemDetail(myFarm);
		s+= myFarmer.getAniamlDetail(myFarm);
		s+= myFarmer.getCropDetail(myFarm);
		 System.out.println(s);
		try {
            FileWriter writer = new FileWriter("play.txt", false);
            BufferedWriter bufferWritter = new BufferedWriter(writer);
            bufferWritter.write(s);
            bufferWritter.close();

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void readPlayConfigureFromFile() {
		try {
		FileInputStream inputStream = new FileInputStream("play.txt");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
		String str = null;
		while((str = bufferedReader.readLine()) != null)//read line by line
		{
			//System.out.println(str);
			String[] line = str.split("-");
			if(line[0].equals("money"))
			{
				//System.out.println("money");
				myFarm.setMoney(Double.parseDouble(line[1]));
			}
			if(line[0].equals("Items")) {
				//System.out.println("Items");
				myFarmer.addConfigureItems(line[1], myFarm);
			}
			if(line[0].equals("Animals")) {
				//System.out.println("Animals");
				myFarmer.addConfigureAnimal(line[1], myFarm);
			}
			if(line[0].equals("Crop")) {
				//System.out.println("Crop");
				myFarmer.addConfigureSeed(line[1], myFarm);
			}
			
		}
			
		//close
		inputStream.close();
		bufferedReader.close();
		}
		catch(IOException e)
		{
			System.out.print(e.getMessage());
		}
	}
	
	public static void writeToFile(String s) {
		try {
            FileWriter writer = new FileWriter("farm.txt", false);
            writer.write(s);
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
