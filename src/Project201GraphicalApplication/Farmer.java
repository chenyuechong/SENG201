/**
 * Farmer class to control the daily thing 
 */
package Project201GraphicalApplication;

import java.io.IOException;


public class Farmer {
	private String name = "";
	private int age = 18;


	public Farmer(String farmerName) {
		name = farmerName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int n) {
		age = n;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	/**
	 * using the seedName to check which crop the player want to buy
	 * @param seedName,myFarm
	 */
	public void buySeed(String seedName, Farm myFarm) throws IOException{
		try {
		switch (seedName) {
		case "Corn":
			Corn corn = new Corn();			
			myFarm.decreaseMoney(corn.getPurchasePrice());
			corn.startObserving(myFarm);
			if(myFarm.getType() == 4)
				corn.setIsIncrease();
			myFarm.cornList.add(corn);
			break;
		case "Carrot":
			Carrot carrot = new Carrot();			
			myFarm.decreaseMoney(carrot.getPurchasePrice());
			carrot.startObserving(myFarm);
			if(myFarm.getType() == 4)
				carrot.setIsIncrease();
			myFarm.carrotList.add(carrot);
			break;
		case "Eggplant":
			Eggplant eggplant = new Eggplant();
			myFarm.decreaseMoney(eggplant.getPurchasePrice());
			eggplant.startObserving(myFarm);
			if(myFarm.getType() == 4)
				eggplant.setIsIncrease();
			myFarm.eggplantList.add(eggplant);
			break;
		case "KiwiFruit":
			KiwiFruit kiwifruit = new KiwiFruit();			
			myFarm.decreaseMoney(kiwifruit.getPurchasePrice());
			if(myFarm.getType() == 4)
				kiwifruit.setIsIncrease();
			myFarm.kiwifruitList.add(kiwifruit);
			kiwifruit.startObserving(myFarm);
			break;
		case "Tomato":
			Tomato tomato = new Tomato();			
			myFarm.decreaseMoney(tomato.getPurchasePrice());
			if(myFarm.getType() == 4)
				tomato.setIsIncrease();
			myFarm.tomatoList.add(tomato);
			tomato.startObserving(myFarm);
			break;
		}
		}
		catch (Exception  e) {
			throw new IOException(e.getMessage());
		}

	}
	
	
	/**
	 * when the play quit the game and start again , will need to reinitialized
	 * @param s,myFarm
	 */
	public void addConfigureSeed(String s, Farm myFarm)
	{
		//String t = "Carrot:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
		String[] sTemp = s.split(":");
		String[] paraments = sTemp[1].split(",");
		switch (sTemp[0]) {
		case "Corn":
			Corn corn = new Corn();			
			corn.setHeigth(Integer.parseInt(paraments[0]));
			corn.setHarvestTime(Integer.parseInt(paraments[1]));
			corn.setLeftTimeToHarvers(Integer.parseInt(paraments[2]));
			corn.setPurchasePrice(Integer.parseInt(paraments[3]));
			corn.startObserving(myFarm);
			if(myFarm.getType() == 4)
				corn.setIsIncrease();
			myFarm.cornList.add(corn);
			break;
		case "Carrot":
			Carrot carrot = new Carrot();			
			carrot.setHeigth(Integer.parseInt(paraments[0]));
			carrot.setHarvestTime(Integer.parseInt(paraments[1]));
			carrot.setLeftTimeToHarvers(Integer.parseInt(paraments[2]));
			carrot.setPurchasePrice(Integer.parseInt(paraments[3]));
			carrot.startObserving(myFarm);
			if(myFarm.getType() == 4)
				carrot.setIsIncrease();
			myFarm.carrotList.add(carrot);
			break;
		case "Eggplant":
			Eggplant eggplant = new Eggplant();
			eggplant.setHeigth(Integer.parseInt(paraments[0]));
			eggplant.setHarvestTime(Integer.parseInt(paraments[1]));
			eggplant.setLeftTimeToHarvers(Integer.parseInt(paraments[2]));
			eggplant.setPurchasePrice(Integer.parseInt(paraments[3]));
			eggplant.startObserving(myFarm);
			if(myFarm.getType() == 4)
				eggplant.setIsIncrease();
			myFarm.eggplantList.add(eggplant);
			break;
		case "KiwiFruit":
			KiwiFruit kiwifruit = new KiwiFruit();			
			kiwifruit.setHeigth(Integer.parseInt(paraments[0]));
			kiwifruit.setHarvestTime(Integer.parseInt(paraments[1]));
			kiwifruit.setLeftTimeToHarvers(Integer.parseInt(paraments[2]));
			kiwifruit.setPurchasePrice(Integer.parseInt(paraments[3]));
			if(myFarm.getType() == 4)
				kiwifruit.setIsIncrease();
			myFarm.kiwifruitList.add(kiwifruit);
			kiwifruit.startObserving(myFarm);
			break;
		case "Tomato":
			Tomato tomato = new Tomato();			
			tomato.setHeigth(Integer.parseInt(paraments[0]));
			tomato.setHarvestTime(Integer.parseInt(paraments[1]));
			tomato.setLeftTimeToHarvers(Integer.parseInt(paraments[2]));
			tomato.setPurchasePrice(Integer.parseInt(paraments[3]));
			if(myFarm.getType() == 4)
				tomato.setIsIncrease();
			myFarm.tomatoList.add(tomato);
			tomato.startObserving(myFarm);
			break;
		}
	}
	
	
	/**
	 * using the animal name to identify which animal needs to by and how many needs to buy, and add the object to the list
	 * @param animalName,myFarm
	 */
	public void buyAnimal(String animalName, Farm myFarm) throws IOException {
		try {
			switch (animalName) {
			case "Pig":
				Pig p = new Pig();
				myFarm.decreaseMoney(p.getPurchasePrice());
				if(myFarm.getType() == 3)
					p.setIsIncrease();
				myFarm.pigList.add(p);
				p.startObserving(myFarm);
				break;
			case "Hen":
				Hen h = new Hen();
				myFarm.decreaseMoney(h.getPurchasePrice());
				if(myFarm.getType()==3)
					h.setIsIncrease();
				myFarm.henList.add(h);
				h.startObserving(myFarm);
				break;
			case "Cow":
				Cow c = new Cow();
				myFarm.decreaseMoney(c.getPurchasePrice());
				if(myFarm.getType()==3)
					c.setIsIncrease();
				myFarm.cowList.add(c);
				c.startObserving(myFarm);
				break;
			}
		} catch (Exception e) {
			throw new IOException(e.getMessage());
		}
	}

	/**
	 * when the play quit the game and start again , will need to reinitialized
	 * @param s,myFarm
	 */
	public void addConfigureAnimal(String s, Farm myFarm) {
		//String t = "Hen:" + h.getHappiness()+ ","+h.getHealth()+"\n";
		String[] sTemp = s.split(":");
		String[] paraments = sTemp[1].split(",");
		switch (sTemp[0]) {
		case "Pig":
			Pig p = new Pig();
			p.setHappiness(Integer.parseInt(paraments[0]));
			p.setHealth(Integer.parseInt(paraments[1]));
			if(myFarm.getType() == 3)
				p.setIsIncrease();
			myFarm.pigList.add(p);
			p.startObserving(myFarm);
			break;
		case "Hen":
			Hen h = new Hen();
			h.setHappiness(Integer.parseInt(paraments[0]));
			h.setHealth(Integer.parseInt(paraments[1]));
			if(myFarm.getType() == 3)
				h.setIsIncrease();
			myFarm.henList.add(h);
			h.startObserving(myFarm);
			break;
		case "Cow":
			Cow c = new Cow();
			c.setHappiness(Integer.parseInt(paraments[0]));
			c.setHealth(Integer.parseInt(paraments[1]));
			if(myFarm.getType() == 3)
				c.setIsIncrease();
			myFarm.cowList.add(c);
			c.startObserving(myFarm);
			break;
		}
	}
	
	/**
	 * using the items name to identify which crop needs to by and how many needs to buy, and add the object to the list
	 * @param itemsName,myFarm
	 */
	public void buyItems(String itemsName, Farm myFarm) throws IOException{
		try {
			switch (itemsName) {
			case "AnimalFeedItems":
				AnimalFeedItems p = new AnimalFeedItems();
				myFarm.decreaseMoney(p.getPurchasePrice());
				myFarm.animalFeedItemsList.add(p);				
				break;
			case "TimeAgentItems":
				TimeAgentItems h = new TimeAgentItems();
				myFarm.decreaseMoney(h.getPurchasePrice());
				myFarm.timeAgentitemsList.add(h);
				break;
			case "HappyAgentItems":
				HappyAgentItems c = new HappyAgentItems();
				myFarm.decreaseMoney(c.getPurchasePrice());
				myFarm.happyAgentItemsList.add(c);				
				break;
			}
		} catch (Exception  e) {
			throw new IOException(e.getMessage());
		}
	}

	/**
	 * when the play quit the game and start again , will need to reinitialized

	 */
	public void addConfigureItems(String s, Farm myFarm) {
		String[] sTemp = s.split(":");
		if(sTemp[1].equals(" 0"))
				return;
		int count = Integer.parseInt(sTemp[1].trim());
		switch (sTemp[0]) {
		case "AnimalFeedItems":
			for (int i =0; i < count;i++)
			{
			AnimalFeedItems p = new AnimalFeedItems();
			myFarm.animalFeedItemsList.add(p);		
			}
			break;
		case "TimeAgentItems":
			for (int i =0; i < count;i++)
			{
			TimeAgentItems h = new TimeAgentItems();
			myFarm.timeAgentitemsList.add(h);
			}
			break;
		case "HappyAgentItems":
			for (int i =0; i < count;i++)
			{
			HappyAgentItems c = new HappyAgentItems();
			myFarm.happyAgentItemsList.add(c);		
			}
			break;
		}
	}
	
	
	/**
	 * using the seedName to find the size in the list

	 */
	public int countCrops(String seedName, Farm myFarm) {
		int count = 0;
		switch (seedName) {
		case "Corn":
			count = myFarm.cornList.size();
			break;
		case "Carrot":
			count = myFarm.carrotList.size();
			break;
		case "Eggplant":
			count = myFarm.eggplantList.size();
			break;
		case "KiwiFruit":
			count = myFarm.kiwifruitList.size();
			break;
		case "Tomato":
			count = myFarm.tomatoList.size();
			break;
		}
		System.out.print("\n" +seedName + "\n");
		return count;
	}

	/**
	 * using the animalName to find the size in the list

	 */
	public int countAnimal(String animalName, Farm myFarm) {
		int count = 0;
		switch (animalName) {
		case "Pig":
			count = 0;
			count = myFarm.pigList.size();
			break;
		case "Hen":
			count = 0;
			count = myFarm.henList.size();
			break;
		case "Cow":
			count = 0;
			count = myFarm.cowList.size();
			break;
		}
		return count;

	}

	/**
	 * using the itemsName to find the size in the list
	 */
	public int countItems(String itemsName, Farm myFarm) {
		int count = 0;
		switch (itemsName) {
		case "AnimalFeedItems":
			count = 0;
			count = myFarm.animalFeedItemsList.size();
			break;
		case "TimeAgentItems":
			count = 0;
			count = myFarm.timeAgentitemsList.size();
			break;
		case "HappyAgentItems":
			count = 0;
			count = myFarm.happyAgentItemsList.size();
			break;
		}
		return count;
	}

	
	
	/**
	 * expand area
	 */
	public void expandFarmLand(Farm myFarm) {
		myFarm.expandArea();
		
	}
	
	/**
	 * using the seedName and index to find which object to be harvested and sold
	 */
	public boolean harvestAndSoldCrop(String seedName, int index , Farm myfarm) {
		
		boolean isSuccess = false;
		switch (seedName) {
		case "Corn":
			if (myfarm.henList.size() == 0) {
				isSuccess = false;
			} else {
				Corn corn = myfarm.cornList.get(index);
				if (corn.getLeftTimeToHarvest() == 0) {
					myfarm.cornList.remove(index);
					isSuccess = true;
					myfarm.increaseMoney(50);
				}
			}
			break;
		case "Carrot":
			if (myfarm.carrotList.size() == 0) {
				isSuccess = false;
			} else {
				Carrot c = myfarm.carrotList.get(index);
				if (c.getLeftTimeToHarvest() == 0) {
					myfarm.carrotList.remove(index);
					isSuccess = true;
					myfarm.increaseMoney(50);
				}
			}
			break;
		case "Eggplant":
			if (myfarm.eggplantList.size() == 0) {
				isSuccess = false;
			} else {
				Eggplant e = myfarm.eggplantList.get(index);
				if (e.getLeftTimeToHarvest() == 0) {
					myfarm.eggplantList.remove(index);
					isSuccess = true;
					myfarm.increaseMoney(50);
				}
			}

			break;
		case "KiwiFruit":
			if (myfarm.kiwifruitList.size() == 0) {
				isSuccess = false;
			} else {
				KiwiFruit k = myfarm.kiwifruitList.get(index);
				if (k.getLeftTimeToHarvest() == 0) {
					myfarm.kiwifruitList.remove(index);
					isSuccess = true;
					myfarm.increaseMoney(50);
				}
			}
			break;
		case "Tomato":
			if (myfarm.kiwifruitList.size() == 0) {
				isSuccess = false;
			} else {
				Tomato t = myfarm.tomatoList.get(index);
				if (t.getLeftTimeToHarvest() == 0) {
					myfarm.tomatoList.remove(index);
					isSuccess = true;
					myfarm.increaseMoney(50);
				}
			}
			break;
		}
		return isSuccess;

	}

	
	
	/**
	 * using the animalName and index to find which object to be feed 
	 */
	public boolean feedAnimal(String animalName, int index , Farm myfarm) throws IOException {
	
		System.out.print("\n Feed animal in farmer1");
		if(myfarm.animalFeedItemsList.size() == 0)
			return false;
			switch (animalName) {
			case "Pig":
					Pig p = myfarm.pigList.get(index);
					myfarm.consumeFeedItems();
					p.feed();
				break;
			case "Hen":
					Hen h = myfarm.henList.get(index);
					myfarm.consumeFeedItems();
					h.feed();
				break;
			case "Cow":
					Cow c = myfarm.cowList.get(index);
					myfarm.consumeFeedItems();
					c.feed();
				break;
			}
			return true;
		

	}

	

	/**
	 * using the animalName and index to find which object to be feed 

	 */
	public boolean useHappyAgentItem(String animalName, int index, Farm myfarm) throws IOException {
	
		if(myfarm.happyAgentItemsList.size() == 0)
				return false;
		switch (animalName) {
			case "Pig":
					Pig p = myfarm.pigList.get(index);
					myfarm.consumeHappyAgentItem();
					p.increaseHappiness();
				break;
			case "Hen":

					Hen h = myfarm.henList.get(index);
					myfarm.consumeHappyAgentItem();
					h.increaseHappiness();
				break;
			case "Cow":
					Cow c = myfarm.cowList.get(index);
					myfarm.consumeHappyAgentItem();
					c.increaseHappiness();
				break;
			}
		return true;
		
	}

	
	/**
	 * using the seedName and index to find which object to be decrease harvest time 

	 */
	public boolean useTimeAgentItem(String seedName, int index,Farm myfarm) throws IOException {
		if(myfarm.timeAgentitemsList.size() == 0)
			return false;
		
			switch (seedName) {
			case "Corn":		
					Corn corn = myfarm.cornList.get(index);			
					myfarm.consumeTimeAgentItem();
					corn.decreaseHarvestTime();
					corn.water();
				break;
			case "Carrot":
					Carrot c = myfarm.carrotList.get(index);			
					myfarm.consumeTimeAgentItem();
					c.decreaseHarvestTime();
					c.water();

				break;
			case "Eggplant":
					Eggplant e = myfarm.eggplantList.get(index);			
					myfarm.consumeTimeAgentItem();
					e.decreaseHarvestTime();
					e.water();
	
				break;
			case "KiwiFruit":

					KiwiFruit k = myfarm.kiwifruitList.get(index);			
					myfarm.consumeTimeAgentItem();
					k.decreaseHarvestTime();
					k.water();
				break;
			case "Tomato":
					Tomato t = myfarm.tomatoList.get(index);			
					myfarm.consumeTimeAgentItem();
					t.decreaseHarvestTime();
					t.water();
				break;
			}
			return true;
			
	}
	
	
	/**
	 * using the animalName and index to find which object to play

	 */
	public void playWithAnimal(String animalName, int index, Farm myfarm) throws IOException {
		switch (animalName) {
		case "Pig":
			Pig p = myfarm.pigList.get(index);
			p.play();

			break;
		case "Hen":

			Hen h = myfarm.henList.get(index);
			h.play();

			break;
		case "Cow":

			Cow c = myfarm.cowList.get(index);
			c.play();

			break;
		}

	}
	
	/**
	 * using the cropName and index to find which object to water
	 */
	public void waterCrop(String cropName, int index, Farm myfarm) throws IOException {
		
				switch (cropName) {
				case "Corn":
					Corn corn = myfarm.cornList.get(index);
					corn.water();
					break;
				case "Carrot":

					Carrot c = myfarm.carrotList.get(index);
					c.water();
					System.out.print("water Carrot in Farmer \n");
					break;
				case "Eggplant":

					Eggplant e = myfarm.eggplantList.get(index);
					e.water();
					break;
				case "KiwiFruit":

					KiwiFruit k = myfarm.kiwifruitList.get(index);
					k.water();
					break;
				case "Tomato":

					Tomato t = myfarm.tomatoList.get(index);
					t.water();

					break;
				}
			
		
		}
		
	
	
	/**
	 * get the Iteme'ta

	 */
	public static String getItemDetail(Farm myFarm) {
		String s = "Items-AnimalFeedItems: "+ myFarm.animalFeedItemsList.size()+ "\n";
		s += "Items-HappyAgentItems: "+ myFarm.happyAgentItemsList.size()+ "\n";
		s += "Items-TimeAgentItems: "+ myFarm.timeAgentitemsList.size()+ "\n";
		return s;
	}
	
	public static String getAniamlDetail(Farm myFarm) {
		String s= "";
		for(int i = 0 ; i<myFarm.henList.size(); i++)
		{
			Hen h = myFarm.henList.get(i);
			String t = "Animals-Hen:" + h.getHappiness()+ ","+h.getHealth()+"\n";
			s += t;
		}
		for(int i = 0 ; i<myFarm.cowList.size(); i++)
		{
			Cow c = myFarm.cowList.get(i);
			String t = "Animals-Cow:" + c.getHappiness()+ ","+c.getHealth()+"\n";
			s += t;
		}
		
		for(int i = 0 ; i<myFarm.pigList.size(); i++)
		{
			Pig p = myFarm.pigList.get(i);
			String t = "Animals-Pig:" + p.getHappiness()+ ","+p.getHealth()+"\n";
			s += t;
		}
		return s;
	}
	
	/**
	 * get the Iteme'ta

	 */	
	public static String getCropDetail(Farm myFarm) {
		String s= "";
		for(int i = 0 ; i<myFarm.carrotList.size(); i++)
		{
			Carrot h = myFarm.carrotList.get(i);
			String t = "Crop-Carrot:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
			s += t;
		}
		for(int i = 0 ; i<myFarm.cornList.size(); i++)
		{
			Corn h = myFarm.cornList.get(i);
			String t = "Crop-Corn:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
			s += t;
		}
		
		for(int i = 0 ; i<myFarm.eggplantList.size(); i++)
		{
			Eggplant h = myFarm.eggplantList.get(i);
			String t = "Crop-Eggplant:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
			s += t;
		}
		for(int i = 0 ; i<myFarm.kiwifruitList.size(); i++)
		{
			KiwiFruit h = myFarm.kiwifruitList.get(i);
			String t = "Crop-KiwiFruit:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
			s += t;
		}
		for(int i = 0 ; i<myFarm.tomatoList.size(); i++)
		{
			Tomato h = myFarm.tomatoList.get(i);
			String t = "Crop-Tomato:" + h.getHeigth()+ ","+h.getHarvestTime()+","+h.getLeftTimeToHarvest()+","+h.getSellingPrice()+"\n";
			s += t;
		}
		return s;
	}
	
}
