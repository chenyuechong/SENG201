package Project201GraphicalApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;



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
	static int cropCount = 0;
	
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
		int bonus = cropCount * 5;
		myFarm.increaseMoney(bonus);
		myFarm.setIsChangeDay(true);		
	}
	
	public static void playWithAnimal(String animalName, int index)
	{
		try {
			myFarmer.playWithAnimal(animalName, index - 1, myFarm);
				System.out.print("You have played with  " + animalName + " for a while\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
		
	}
	
	public static boolean feedAnimal(String animalName, int index)
	{
		try {		
			myFarmer.feedAnimal(animalName,index - 1, myFarm);
			
			System.out.print("You have played with  " + animalName + "for a while\n");	
			return true;
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
			return false;
		}
	}
	
	public static boolean useTimeAgent(String cropName, int index)
	{
		try {		
			myFarmer.useTimeAgentItem(cropName, index - 1, myFarm);
			System.out.print("You have used the timeAgentItem to " + crops[index-1] + "\n");		
			return true;
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		return false;
		}
	}
	
	public static boolean useHappyAgent(String animalName,int index) {
		try {		
			myFarmer.useHappyAgentItem(animalName,index - 1, myFarm);
			System.out.print("You have used happyAgentItem to   " + animals[index-1] + "\n");
			return true;
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		return false;
		}
	}
	
	
	
	public static boolean buySeed(String cropName, int count) {		
		try {
			System.out.print("need to buy " + count + "seeds\n");
			for (int i = 0; i < count; i++) {
				myFarmer.buySeed(cropName, myFarm);
			
			}
			System.out.print("you bought " + cropName + " count:" + count + ", there are " + myFarm.getMoney()
					+ " dollars left\n");
			return true;
		} catch (IOException e) {
			System.out.print(e.getMessage());
			return false;
		}
	}
	
	public static boolean buyAnimal(String animalName, int count) {
		try {
			System.out.print("need to buy " + count + "animals\n");
			for (int i = 0; i < count; i++) {
				myFarmer.buyAnimal(animalName, myFarm);
			}
			System.out.print("you bought " + animalName + " count:" + count + ", there are " + myFarm.getMoney()
					+ " dollars left\n");
			return true;
		} catch (IOException e) {
			System.out.print(e.getMessage());
			return false;
		}
	}

	public static boolean buyItems(String itemsName, int count) {
		try {
			System.out.print("need to buy " + count + "items\n");
			for (int i = 0; i < count; i++) {
				myFarmer.buyItems(itemsName, myFarm);
			}
			System.out.print("you bought " + itemsName + " count:" + count + ", there are " + myFarm.getMoney()
					+ " dollars left\n");
			return true;
		} catch (IOException e) {
			System.out.print(e.getMessage());
			return false;
		}
	}

	public static boolean harvestCrop(String seedName,int index) {	
		boolean b = myFarmer.harvestAndSoldCrop(seedName, index - 1, myFarm);
		System.out.print(b);
		return  b;
	}
	
	public static Map<String, Integer>  showStore()
	{ 
		 Map<String, Integer> storeMap = new HashMap<String, Integer>(); 
		System.out.print( "You have\n crops:  ");
		for(int i = 0; i<5; i++)
		{
			System.out.print(crops[i]);
			int n = myFarmer.countCrops(crops[i], myFarm);
			cropCount+= n;
			//writeToFile(crops[i]+ "-"+ myFarmer.countCrops(crops[i], myFarm));
			storeMap.put(crops[i], myFarmer.countCrops(crops[i], myFarm));
		}
		System.out.print( "\n");
		System.out.print("animals:  ");
		for(int i = 0; i<3; i++)
		{
			System.out.print(animals[i] + ":"+ myFarmer.countAnimal(animals[i], myFarm) +"   " );
			//writeToFile(animals[i]+ "-"+ myFarmer.countAnimal(animals[i], myFarm));
			storeMap.put(animals[i], myFarmer.countAnimal(animals[i], myFarm));
		}
		System.out.print( "\n");
		System.out.print("items:  ");
		for(int i = 0; i<3; i++)
		{
			System.out.print(items[i] + ":" + myFarmer.countItems(items[i], myFarm) + "  " );
			//writeToFile(items[i]+ "-"+ myFarmer.countItems(items[i], myFarm));
			storeMap.put(items[i], myFarmer.countItems(items[i], myFarm));

		}
		System.out.print( "\n");
		return storeMap;
	}


	public static boolean expandFarmArea() {
		boolean isMoneyEnough = false;
		if (myFarm.getMoney() > 200 )
			{myFarmer.expandFarmLand(myFarm);
				isMoneyEnough = true;
			}
		System.out.print("expand area success");
		return isMoneyEnough;
	}
	
	public static int getFarmArea() {
		return myFarm.getArea();
	}
	 	
	
	public static int getMoney()
	{
		return myFarm.getMoney();
	}
	public static String readFromFile() {
		String s ="";
		 try {
			 	
	            FileReader reader = new FileReader("farm.txt");
	            if(reader != null)
	            {
	            	int character;
	 
	            	while ((character = reader.read()) != -1) {
	            		s += (char)character;
	            	}
	            	reader.close();
	            }
	            
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 return s;
		 
	}
	
	public static void writePlayConfigureToFile() {
		String s ="";
		s += "money-" + myFarm.getMoney()+"\n";
		s += "area-" + myFarm.getArea() +"\n";
		s +="day-" + currentDay+"\n";
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
			System.out.println(str);
			String[] line = str.split("-");
			if(line[0].equals("money"))
			{
				//System.out.println("money");
				myFarm.setMoney(Integer.parseInt(line[1]));
			}
			if(line[0].equals("area"))
			{
				//System.out.println("money");
				myFarm.setArea(Integer.parseInt(line[1]));
			}
			if(line[0].equals("day"))
			{
				//System.out.println("money");
				currentDay = Integer.parseInt(line[1]);
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

	public static String getFarmMessage() {
		String s = "";
		s += myFarm.getName();
		s += ";";
		s += myFarmer.getName();
		s += ";";
		s += myFarm.getType();
		s += ";";
		s += currentDay;
		s += ";";
		s += myFarm.getMoney();
		return s;
	}


	public static boolean isFirstLogin() {

		File file = new File("farm.txt");
		return file.exists();
	}
	
	public static boolean isPlayed() {
		File file = new File("play.txt");
		return file.exists();
	}
	
	public static void init()
	{
		String s = readFromFile();
		String[] p = s.split("-");
		int typeId = Integer.parseInt(p[0].trim());
		String farmerName = p[1];
		String farmName = p[2];
		int playDays = Integer.parseInt(p[3].trim());
		Controller.createFarm(typeId, farmerName.toUpperCase(), farmName.toUpperCase(), playDays);
		Controller.readPlayConfigureFromFile();	
		System.out.print("init the farm paraments");
	}
	
	
	public static String getCropObjectStatus(String cropName, int index) {
		
		String s = "";
		switch (cropName) {
		case "Corn":
			Corn cron= myFarm.cornList.get(index -1);
			s +=  String.valueOf(cron.getPurchasePrice());
			s += ";";
			s +=  String.valueOf(cron.getHeigth());
			s += ";";
			s +=  String.valueOf(cron.getHarvestTime());
			break;
		case "Carrot":
			Carrot p= myFarm.carrotList.get(index -1);
			s +=  String.valueOf(p.getPurchasePrice());
			s += ";";
			s +=  String.valueOf(p.getHeigth());
			s += ";";
			s +=  String.valueOf(p.getHarvestTime());
			break;
		case "Eggplant":
			Eggplant e= myFarm.eggplantList.get(index -1);
			s +=  String.valueOf(e.getPurchasePrice());
			s += ";";
			s +=  String.valueOf(e.getHeigth());
			s += ";";
			s +=  String.valueOf(e.getHarvestTime());
			break;
		case "KiwiFruit":
			KiwiFruit k= myFarm.kiwifruitList.get(index -1);
			s +=  String.valueOf(k.getPurchasePrice());
			s += ";";
			s +=  String.valueOf(k.getHeigth());
			s += ";";
			s +=  String.valueOf(k.getHarvestTime());
			break;
		case "Tomato":
			Tomato t= myFarm.tomatoList.get(index -1);
			s +=  String.valueOf(t.getPurchasePrice());
			s += ";";
			s +=  String.valueOf(t.getHeigth());
			s += ";";
			s +=  String.valueOf(t.getHarvestTime());
			break;
		}
		return s;
	}
		
	public static String getAnimalObjectStatus(String animalName, int index) {
		String s = "";
		switch (animalName) {
		case "Pig":
			Pig p= myFarm.pigList.get(index -1);
			s += String.valueOf(p.getPurchasePrice());
			s += ";";
			s += String.valueOf(p.getHappiness());
			s += ";";
			s += String.valueOf(p.getHealth());
			break;
		case "Hen":
			Hen h= myFarm.henList.get(index -1);
			s += String.valueOf(h.getPurchasePrice());
			s += ";";
			s += String.valueOf(h.getHappiness());
			s += ";";
			s += String.valueOf(h.getHealth());
			break;
		case "Cow":
			Cow c= myFarm.cowList.get(index -1);
			s += String.valueOf(c.getPurchasePrice());
			s += ";";
			s += String.valueOf(c.getHappiness());
			s += ";";
			s += String.valueOf(c.getHealth());
			break;
		
		}
		return s;
	}
		
	public static void waterCrop(String cropName, int index) {
		
		try {		
			myFarmer.waterCrop(cropName, index - 1, myFarm);
			System.out.print("You watered  " + cropName + "\n");		
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		}
	}

	
	public static int countCrop(String cropName) {
		int n = myFarmer.countCrops(cropName, myFarm);
		return n;
	}
	
	public static int countAnimal(String animalName) {
		int n = myFarmer.countAnimal(animalName, myFarm);;
		return n;
	}
	public static int dealRandomEvent() {
		int max=3;

		int min=1;

		Random random = new Random();

		int index = random.nextInt(max)%(max-min+1) + min;
		
		if(index == 1)
		{
			for(int i = 0; i< 5; i++)
				myFarm.droughtEvent(crops[i]);
		}
		if(index == 2)
		{
			myFarm.fenceBrokenEvent();
		}
		if(index == 3)
		{
			myFarm.countryFairEvent();
		}
		return index;
	}

	
	public static void finishGame()
	{
		 File file = new File("farm.txt");
         if(file.exists())
        	 file.delete();
         File file1 = new File("play.txt");
         if(file1.exists())
        	 file1.delete();
         
	}
}

	
	