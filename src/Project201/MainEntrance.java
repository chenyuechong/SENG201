package Project201;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainEntrance {

	public static boolean isNumeric(String s) {
		if (s != null && !"".equals(s.trim()))
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

		System.out.print(
				"welcome aboard, there are 5 types crop seeds:\n 1:Carrot, 2:Corn, 3:Eggplant, 4:KiwiFruit, 5:Tomato each $2 \n"
						+ "please type the crop code number(other number will exit this step):\n");
	}

	public static void buyCrop() {
		printCrop();
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();
		boolean isOutLoop = false;
		while (isOutLoop == false) {
			if (isNumeric(index) && (Integer.parseInt(index) <= 5 && Integer.parseInt(index) >= 1)) {
				System.out.print("Please enter the quantity you want to buy\n");
				String number = input1.nextLine();
				if (isNumeric(number)) {
					Controller.buySeed(Integer.parseInt(index), Integer.parseInt(number));
					break;
				}
			} else {
				break;
			}
		}
	}

	public static void printAnimal() {
		System.out.print("there are 3 types animals:\n 1:Pig, 2:Hen, 3:Cow) each $2 \n"
				+ "please type the animal number\n");
	}

	public static void buyAnimal() {
		printAnimal();
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();
		boolean isOutLoop = false;
		while (isOutLoop == false) {
			if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 1)) {
				System.out.print("Please enter the quantity you want to buy\n");
				String number = input1.nextLine();
				if (isNumeric(number)) {
					Controller.buyAnimal(Integer.parseInt(index), Integer.parseInt(number));
					break;
				}
			} else {
				break;
			}
		}
	}

	public static void printItem() {
		System.out
				.print("there are 3 types items:\n 1:AnimalFeedItems, 2:HappyAgentItems, 3:TimeAgentItems each $20 \n"
						+ "please type the items number \n");
	}

	public static void buyItems() {

		printItem();
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();
		boolean isOutLoop = false;
		while (isOutLoop == false) {
			if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
				System.out.print("Please enter the quantity you want to buy\n");
				String number = input1.nextLine();
				if (isNumeric(number)) {
					Controller.buyItems(Integer.parseInt(index), Integer.parseInt(number));
					break;
				}
			} else {
				break;
			}
		}
	}

	public static void playWithAnimals() {
		System.out.print("there are 3 types animals: 1:Pig, 2:Hen, 3:Cow  " + "please type the animal number \n");
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();

		if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
			Controller.playWithAnimal(Integer.parseInt(index));
		}

	}
	
	public static void feedAnimals() {
		System.out.print("there are 3 types animals: 1:Pig, 2:Hen, 3:Cow  " + "please type the animal number \n");
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();

		if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
			Controller.feedAnimal(Integer.parseInt(index));
		}
	}
	
	public static void usingHappyAgent() {
		System.out.print("there are 3 types animals: 1:Pig, 2:Hen, 3:Cow  ,you can using this agent " + "please type the animal number \n");
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();

		if (isNumeric(index) && (Integer.parseInt(index) <= 3 && Integer.parseInt(index) >= 0)) {
			Controller.useHappyAgent(Integer.parseInt(index));
		}
	}
	
	public static void usingTimeAgent() {
		System.out.print("there are 5 types crop seeds:  1:Carrot, 2:Corn, 3:Eggplant, 4:KiwiFruit, 5:Tomato " + "please type the crop number \n");
		Scanner input1 = new Scanner(System.in);
		String index = input1.nextLine();

		if (isNumeric(index) && (Integer.parseInt(index) <= 5 && Integer.parseInt(index) >= 0)) {
			Controller.useTimeAgent(Integer.parseInt(index));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = Controller.readFromFile();
		boolean isOutLoop = false;
		if (s == "") {
			System.out.print("please input how many days do you want to play(5-10 days)：");
			Scanner input1 = new Scanner(System.in);
			String playDays = input1.nextLine();

			while (isOutLoop == false) {
				if (isNumeric(playDays) && (Integer.parseInt(playDays) <= 10 && Integer.parseInt(playDays) >= 5)) {
					System.out.println("Thanks you select play " + playDays + " days \n");
					break;
				} else {
					System.out.print("please input how many days do you want to play(5-10 days)：");
					playDays = input1.nextLine();

				}
			}

			System.out.print("what's your farmer's name?(3-15 characters)");
			String farmerName = input1.nextLine();
			while (isOutLoop == false) {

				if (isCharacter(farmerName) && (farmerName.length() <= 15 && farmerName.length() >= 3)) {
					System.out.println("Your farmer's name is " + farmerName);
					break;
				} else {
					System.out.print("what's your farmer's name?(3-15 characters)");
					farmerName = input1.nextLine();
				}
			}

			System.out.print("please select which types of farm do you like： \n");
			System.out.print("1： normal \n");
			System.out.print("2： crop which gorwth 20% than the noraml \n");
			System.out.print("3： animal's happiness 20% more than normal \n");
			System.out.print("4： base money 20% more than normal\n");
			String typeId = input1.nextLine();
			while (isOutLoop == false) {

				if (isNumeric(typeId) && (Integer.parseInt(typeId) <= 4 && Integer.parseInt(typeId) >= 1)) {
					System.out.println("You choose the " + typeId + " type farm");
					break;
				} else {
					System.out.print("please select which types of farm do you like： \n");
					System.out.print("1： normal \n");
					System.out.print("2： crop which gorwth 20% than the noraml \n");
					System.out.print("3： animal's happiness 20% more than normal \n");
					System.out.print("4： base money 20% more than normal\n");
					typeId = input1.nextLine();
				}

			}

			System.out.print("what's your farm's name?(3-15 characters)\n");
			String farmName = input1.nextLine();
			;
			while (isOutLoop == false) {

				if (isCharacter(farmName) && (farmName.length() <= 15 && farmName.length() >= 3)) {
					System.out.println("Your farm  name is " + farmName);
					break;
				} else {
					System.out.print("what's your farm's name?(3-15 characters)");
					farmName = input1.nextLine();
				}
			}
			String ss = typeId + "-" + farmerName + "-" + farmName + "-" + playDays;
			Controller.writeToFile(ss);

			System.out.print(s);
			Controller.createFarm(Integer.parseInt(typeId), farmerName.toUpperCase(), farmName.toUpperCase(),
					Integer.parseInt(playDays));
			// System.out.print(myFarm.toString());
		} else {
			String[] p = s.split("-");
			int typeId = Integer.parseInt(p[0].trim());
			String farmerName = p[1];
			String farmName = p[2];
			int playDays = Integer.parseInt(p[3].trim());
			Controller.createFarm(typeId, farmerName.toUpperCase(), farmName.toUpperCase(), playDays);
			// System.out.print(myFarm.toString());

		}
		String sprint= "1:check store   2: buy items for farm 3: buy animals 4: buy crop seeds 5: play with animals 6: feed animal 7: decrease crop harvest time 8: make animals happier \n";
		System.out.print(sprint);
		Scanner scanner = new Scanner(System.in);
		String strInput = scanner.nextLine();
		while (isOutLoop == false) {

			if (Integer.parseInt(strInput) == 1) {
				Controller.showStore();
				System.out.print(sprint);
				strInput = scanner.nextLine();
			} else if (Integer.parseInt(strInput) == 2) {
				buyItems();
				System.out.print(sprint);
				strInput = scanner.nextLine();
			} else if (Integer.parseInt(strInput) == 3) {
				buyAnimal();
				System.out.print(sprint);
				strInput = scanner.nextLine();
			} else if (Integer.parseInt(strInput) == 4) {
				buyCrop();
				System.out.print(sprint);
				strInput = scanner.nextLine();
			} 
			else if (Integer.parseInt(strInput) == 5) {
				playWithAnimals();
				System.out.print(sprint);
				strInput = scanner.nextLine();
			} 
			else if (Integer.parseInt(strInput) == 6) {
				feedAnimals();
				System.out.print(sprint);
				strInput = scanner.nextLine();
			} 
			else if (Integer.parseInt(strInput) == 7) {
				usingTimeAgent();
				System.out.print(sprint);
				strInput = scanner.nextLine();
			} 
			else if (Integer.parseInt(strInput) == 8) {
				usingHappyAgent();
				System.out.print(sprint);
				strInput = scanner.nextLine();
			} 
			else {
				System.out.print(sprint);
				strInput = scanner.nextLine();
			}
		}

	}

}
