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
	
	public static void writeToFile(String typeId, String farmerName, String farmName, String playDays) {
		try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            String s = typeId +"-"+farmerName+"-"+farmName+"-"+playDays;
            writer.write(s);
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = readFromFile();
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
			writeToFile( typeId,  farmerName,  farmName,  playDays);
			
			System.out.print(s);
			Farm myFarm = new Farm(Integer.parseInt(typeId),farmerName.toUpperCase(), farmName.toUpperCase(), Integer.parseInt(playDays ));
			System.out.print(myFarm.toString());
		}
		else {
			System.out.print(s);
			System.out.print("welcome back  ");
			String[] p = s.split("-");
			int typeId =Integer.parseInt(p[0].trim());
			String farmerName=p[1];
			String farmName=p[2];
			int playDays =Integer.parseInt(p[3].trim());
			Farm myFarm = new Farm(typeId,farmerName.toUpperCase(), farmName.toUpperCase(), playDays );
			System.out.print(myFarm.toString());
		}
		
	}

}