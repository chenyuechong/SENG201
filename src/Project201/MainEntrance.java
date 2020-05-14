package Project201;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainEntrance {
	
	
	public static boolean isNumeric(String s) {  
    if ( s != null  && !"".equals(s.trim()))  
        return s.matches("^[0-9]*$");  
    else  
        return false;  
	} 

	public static boolean isCharacter(String s) {  
	    if ((s != null) && !"".equals(s.trim()))  
	        return s.matches("^[a-zA-Z]*$");  
	    else  
	        return false;  
		} 
	
	
	public static void printCrop() {
		
		System.out.print("welcome aboard, there are 5 types crop seeds:\n 1:Carrot, 2:Corn, 3:Eggplant, 4:KiwiFruit, 5:Tomato) each $2 \n"
				+"please type the crop name(Ex: 1-5 means 5 Carrots )\n");
	}
	
	public static void printAnimal() {
		System.out.print("there are 3 types animals:\n 1:Pig, 2:Hen, 3:Cow) each $2 \n"
				+"please type the animal name and the count you want(Ex: 1-5 means 5 pigs )\n");
	}
	
	public static void printItem() {
		System.out.print("there are 3 types items:\n 1:AnimalFeedItems, 2:HappyAgentItems, 3:TimeAgentItems) each $20 \n"
				+"please type the animal name and the count you want(Ex: 1-5 means 5 AnimalFeedItems )\n");
	}
	
	public static void playGame() {
		
		printCrop();
		Scanner input1=new Scanner(System.in);
		String line=input1.nextLine();
		boolean isOutLoop = false;
		while(isOutLoop==false)
		{
			String[] crop = line.split("-");
			if(isNumeric(crop[0]) && (Integer.parseInt(crop[0])<= 5 && Integer.parseInt(crop[0])>=1 ))
			{
				if(isNumeric(crop[1]))
				{
					Controller.buySeed(Integer.parseInt(crop[0]),Integer.parseInt(crop[1]));
					break;
				}
			}
			else
			{
				printCrop();
				line=input1.nextLine();
			}
		}
		
		printAnimal();
		String line1=input1.nextLine();
		while(isOutLoop==false)
		{
			String[] animal = line1.split("-");
			if(isNumeric(animal[0]) && (Integer.parseInt(animal[0])<=3 && Integer.parseInt(animal[0])>=0))
			{
				if(isNumeric(animal[1]))
				{ 
					Controller.buyAnimal(Integer.parseInt(animal[0]),Integer.parseInt(animal[1]));
					break;
				}
			}
			else
			{
				printAnimal();
				line1=input1.nextLine();
			}
		}
		
		printItem();
		String line2=input1.nextLine();
		while(isOutLoop==false)
		{
			String[] item = line2.split("-");
			if(isNumeric(item[0]) && (Integer.parseInt(item[0])<=3 && Integer.parseInt(item[0])>=0))
			{
				if(isNumeric(item[1]))
				{ 
					Controller.buyItems(Integer.parseInt(item[0]),Integer.parseInt(item[1]));
					break;
				}
			}
			else
			{
				printItem();
				line2=input1.nextLine();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = Controller.readFromFile();
		if (s == "")
		{
			System.out.print("please input how many days do you want to play(5-10 days)：");
			Scanner input1=new Scanner(System.in);
			String playDays=input1.nextLine();
			boolean isOutLoop = false;
			while(isOutLoop==false)
			{
				if (isNumeric(playDays) &&  (Integer.parseInt(playDays)<=10 && Integer.parseInt(playDays)>=5 ))
					{
					System.out.println("Thanks you select play "+playDays+ " days \n" );
					break;
					}
				else
					{
					System.out.print("please input how many days do you want to play(5-10 days)：");
					playDays=input1.nextLine();
					
					}
			}
					
			System.out.print("what's your farmer's name?(3-15 characters)");
			String farmerName = input1.nextLine();
			while(isOutLoop == false)
			{
				 
				if (isCharacter(farmerName)&&  (farmerName.length() <=15 && farmerName.length()>=3 ))
					{
					System.out.println("Your farmer's name is "+farmerName);
					break;
					}
				else
					{System.out.print("what's your farmer's name?(3-15 characters)");
					farmerName = input1.nextLine();
					}
			}
			
			
			
			System.out.print("please select which types of farm do you like： \n");
			System.out.print("1： normal \n");
			System.out.print("2： crop which gorwth 20% than the noraml \n");
			System.out.print("3： animal's happiness 20% more than normal \n");
			System.out.print("4： base money 20% more than normal\n");
			String typeId=input1.nextLine();
			while(isOutLoop == false)
			{
				
				if (isNumeric(typeId) && (Integer.parseInt(typeId)<=4 && Integer.parseInt(typeId)>=1 ))
					{
					System.out.println("You choose the "+typeId+ " type farm");
					break;
					}
				else
					{
					System.out.print("please select which types of farm do you like： \n");
					System.out.print("1： normal \n");
					System.out.print("2： crop which gorwth 20% than the noraml \n");
					System.out.print("3： animal's happiness 20% more than normal \n");
					System.out.print("4： base money 20% more than normal\n");
					typeId = input1.nextLine();
					}
					
			}
			
			
			System.out.print("what's your farm's name?(3-15 characters)\n");
			String farmName = input1.nextLine();;
			while(isOutLoop == false)
			{
				
				if (isCharacter(farmName)&&  (farmName.length() <=15 && farmName.length()>=3 ))
					{
					System.out.println("Your farm  name is "+farmName);
					break;
					}
				else
					{System.out.print("what's your farm's name?(3-15 characters)");
					farmName = input1.nextLine();
					}
			}
			String ss = typeId +"-"+farmerName+"-"+farmName+"-"+playDays;
			Controller.writeToFile(ss);
			
			System.out.print(s);
			Controller.createFarm(Integer.parseInt(typeId),farmerName.toUpperCase(), farmName.toUpperCase(), Integer.parseInt(playDays));
			//System.out.print(myFarm.toString());
		}
		else {
			System.out.print(s);
			System.out.print("welcome back  ");
			String[] p = s.split("-");
			int typeId =Integer.parseInt(p[0].trim());
			String farmerName=p[1];
			String farmName=p[2];
			int playDays =Integer.parseInt(p[3].trim());
			Controller.createFarm(typeId,farmerName.toUpperCase(), farmName.toUpperCase(), playDays );
			//System.out.print(myFarm.toString());
		}
		
		for(int i = 0; i <= 5; i++)
		{
			if(Controller.myFarm.getMoney()>=0)
			{
				Controller.showStore();
				playGame();
				Controller.showStore();
			}
			
		}
		
	}
	
	

}
