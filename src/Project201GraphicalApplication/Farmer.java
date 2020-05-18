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

	public void buySeed(String seedName, Farm myFarm) throws IOException{
		try {
		switch (seedName) {
		case "Corn":
			Corn corn = new Corn();			
			myFarm.decreaseMoney(corn.getPurchasePrice());
			corn.startObserving(myFarm);
			myFarm.cornList.add(corn);
			break;
		case "Carrot":
			Carrot carrot = new Carrot();			
			myFarm.decreaseMoney(carrot.getPurchasePrice());
			carrot.startObserving(myFarm);
			myFarm.carrotList.add(carrot);
			break;
		case "Eggplant":
			Eggplant eggplant = new Eggplant();
			myFarm.decreaseMoney(eggplant.getPurchasePrice());
			eggplant.startObserving(myFarm);
			myFarm.eggplantList.add(eggplant);
			break;
		case "KiwiFruit":
			KiwiFruit kiwifruit = new KiwiFruit();			
			myFarm.decreaseMoney(kiwifruit.getPurchasePrice());
			myFarm.kiwifruitList.add(kiwifruit);
			kiwifruit.startObserving(myFarm);
			break;
		case "Tomato":
			Tomato tomato = new Tomato();			
			myFarm.decreaseMoney(tomato.getPurchasePrice());
			myFarm.tomatoList.add(tomato);
			tomato.startObserving(myFarm);
			break;
		}
		}
		catch (Exception  e) {
			throw new IOException(e.getMessage());
		}

	}

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
			myFarm.cornList.add(corn);
			break;
		case "Carrot":
			Carrot carrot = new Carrot();			
			carrot.setHeigth(Integer.parseInt(paraments[0]));
			carrot.setHarvestTime(Integer.parseInt(paraments[1]));
			carrot.setLeftTimeToHarvers(Integer.parseInt(paraments[2]));
			carrot.setPurchasePrice(Integer.parseInt(paraments[3]));
			carrot.startObserving(myFarm);
			myFarm.carrotList.add(carrot);
			break;
		case "Eggplant":
			Eggplant eggplant = new Eggplant();
			eggplant.setHeigth(Integer.parseInt(paraments[0]));
			eggplant.setHarvestTime(Integer.parseInt(paraments[1]));
			eggplant.setLeftTimeToHarvers(Integer.parseInt(paraments[2]));
			eggplant.setPurchasePrice(Integer.parseInt(paraments[3]));
			eggplant.startObserving(myFarm);
			myFarm.eggplantList.add(eggplant);
			break;
		case "KiwiFruit":
			KiwiFruit kiwifruit = new KiwiFruit();			
			kiwifruit.setHeigth(Integer.parseInt(paraments[0]));
			kiwifruit.setHarvestTime(Integer.parseInt(paraments[1]));
			kiwifruit.setLeftTimeToHarvers(Integer.parseInt(paraments[2]));
			kiwifruit.setPurchasePrice(Integer.parseInt(paraments[3]));
			myFarm.kiwifruitList.add(kiwifruit);
			kiwifruit.startObserving(myFarm);
			break;
		case "Tomato":
			Tomato tomato = new Tomato();			
			tomato.setHeigth(Integer.parseInt(paraments[0]));
			tomato.setHarvestTime(Integer.parseInt(paraments[1]));
			tomato.setLeftTimeToHarvers(Integer.parseInt(paraments[2]));
			tomato.setPurchasePrice(Integer.parseInt(paraments[3]));
			myFarm.tomatoList.add(tomato);
			tomato.startObserving(myFarm);
			break;
		}
	}
	
	public void buyAnimal(String animalName, Farm myFarm) throws IOException {
		try {
			switch (animalName) {
			case "Pig":
				Pig p = new Pig();
				myFarm.decreaseMoney(p.getPurchasePrice());
				myFarm.pigList.add(p);
				p.startObserving(myFarm);
				break;
			case "Hen":
				Hen h = new Hen();
				myFarm.decreaseMoney(h.getPurchasePrice());
				myFarm.henList.add(h);
				h.startObserving(myFarm);
				break;
			case "Cow":
				Cow c = new Cow();
				myFarm.decreaseMoney(c.getPurchasePrice());
				myFarm.cowList.add(c);
				c.startObserving(myFarm);
				break;
			}
		} catch (Exception e) {
			throw new IOException(e.getMessage());
		}
	}

	public void addConfigureAnimal(String s, Farm myFarm) {
		//String t = "Hen:" + h.getHappiness()+ ","+h.getHealth()+"\n";
		String[] sTemp = s.split(":");
		String[] paraments = sTemp[1].split(",");
		switch (sTemp[0]) {
		case "Pig":
			Pig p = new Pig();
			p.setHappiness(Integer.parseInt(paraments[0]));
			p.setHealth(Integer.parseInt(paraments[1]));
			myFarm.pigList.add(p);
			p.startObserving(myFarm);
			break;
		case "Hen":
			Hen h = new Hen();
			h.setHappiness(Integer.parseInt(paraments[0]));
			h.setHealth(Integer.parseInt(paraments[1]));
			myFarm.henList.add(h);
			h.startObserving(myFarm);
			break;
		case "Cow":
			Cow c = new Cow();
			c.setHappiness(Integer.parseInt(paraments[0]));
			c.setHealth(Integer.parseInt(paraments[1]));
			myFarm.cowList.add(c);
			c.startObserving(myFarm);
			break;
		}
	}
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
	
	public int countCrops(String seedName, Farm myFarm) {
		int count = 0;
		switch (seedName) {
		case "Corn":
			count = 0;
			count = myFarm.cornList.size();
			break;
		case "Carrot":
			count = 0;
			count = myFarm.carrotList.size();
			break;
		case "Eggplant":
			count = 0;
			count = myFarm.eggplantList.size();
			break;
		case "KiwiFruit":
			count = 0;
			count = myFarm.kiwifruitList.size();
			break;
		case "Tomato":
			count = 0;
			count = myFarm.tomatoList.size();
			break;
		}
		return count;

	}

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

	
	public  void checkCropStore(int index, Farm myFarm) {
		
	}
	
	
	public void expandFarmLand(Farm myFarm) {
		myFarm.expandArea();
		
	}
	
	
	public void SoldCrop(String seedName) {
		
	}

	public void SoldAnimal(String animalName) {

	}

	
	
	
	public void feedAnimal(String animalName, int index , Farm myfarm) throws IOException {
		try {
			if(countAnimal(animalName, myfarm) == 0 || myfarm.animalFeedItemsList.size() <= 0)
				throw new IOException("oops, you do not have animal to feed\n");
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
		} catch (IllegalArgumentException e) {
			throw new IOException(e.getMessage());
		}

	}

	

	
	public void useHappyAgentItem(String animalName, int index, Farm myfarm) throws IOException {
		try {
			if (myfarm.happyAgentItemsList.size() == 0 || countAnimal(animalName,myfarm) == 0)
				throw new IOException("oops, you do not have happyAgentItem to use\n");
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
		} catch (IllegalStateException e) {
			throw new IOException(e.getMessage());
		}
	}

	public void useTimeAgentItem(String seedName, int index,Farm myfarm) throws IOException {
		try {
			if(countCrops(seedName,myfarm)==0 || myfarm.timeAgentitemsList.size() == 0)
				throw new IOException("oops, you do not have crops or timeAgentItems to use \n");
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
			}
			catch (Exception  e) {
				throw new IOException(e.getMessage());
			}
	}
	
	public void playWithAnimal(String animalName, int index, Farm myfarm) throws IOException {

		if (countAnimal(animalName, myfarm) == 0) {
			throw new IOException("oops, you do not have " + animalName + " to play\n");
		}

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
	
	
	public void waterCrop(String cropName, int index, Farm myfarm) throws IOException {
		try {
			if (countCrops(cropName, myfarm) == 0)
				throw new IOException("oops, you do not have crops or timeAgentItems to use \n");
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
		} catch (Exception e) {
			throw new IOException(e.getMessage());
		}
	}
	
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
