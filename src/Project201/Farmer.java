package Project201;

import java.io.IOException;

import Lab5.LandingException;

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
			myFarm.cornList.add(corn);
			break;
		case "Carrot":
			Carrot carrot = new Carrot();			
			myFarm.decreaseMoney(carrot.getPurchasePrice());
			myFarm.carrotList.add(carrot);
			break;
		case "Eggplant":
			Eggplant eggplant = new Eggplant();
			myFarm.decreaseMoney(eggplant.getPurchasePrice());
			myFarm.eggplantList.add(eggplant);
			break;
		case "KiwiFruit":
			KiwiFruit kiwifruit = new KiwiFruit();			
			myFarm.decreaseMoney(kiwifruit.getPurchasePrice());
			myFarm.kiwifruitList.add(kiwifruit);
			break;
		case "Tomato":
			Tomato tomato = new Tomato();			
			myFarm.decreaseMoney(tomato.getPurchasePrice());
			myFarm.tomatoList.add(tomato);
			break;
		}
		}
		catch (Exception  e) {
			throw new IOException(e.getMessage());
		}

	}

	public void buyAnimal(String animalName, Farm myFarm) throws IOException {
		try {
			switch (animalName) {
			case "Pig":
				Pig p = new Pig();
				myFarm.decreaseMoney(p.getPurchasePrice());
				myFarm.pigList.add(p);
				break;
			case "Hen":
				Hen h = new Hen();
				myFarm.decreaseMoney(h.getPurchasePrice());
				myFarm.henList.add(h);
				break;
			case "Cow":
				Cow c = new Cow();
				myFarm.decreaseMoney(c.getPurchasePrice());
				myFarm.cowList.add(c);
				break;
			}
		} catch (Exception e) {
			throw new IOException(e.getMessage());
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
	
	public void SoldCrop(String seedName) {
		/*
		 * try { switch (seedName) { case "Corn": Corn corn = new Corn();
		 * myFarm.decreaseMoney(corn.getPurchasePrice()); myFarm.cornList.add(corn);
		 * break; case "Carrot": Carrot carrot = new Carrot();
		 * myFarm.decreaseMoney(carrot.getPurchasePrice());
		 * myFarm.carrotList.add(carrot); break; case "Eggplant": Eggplant eggplant =
		 * new Eggplant(); myFarm.decreaseMoney(eggplant.getPurchasePrice());
		 * myFarm.eggplantList.add(eggplant); break; case "KiwiFruit": KiwiFruit
		 * kiwifruit = new KiwiFruit();
		 * myFarm.decreaseMoney(kiwifruit.getPurchasePrice());
		 * myFarm.kiwifruitList.add(kiwifruit); break; case "Tomato": Tomato tomato =
		 * new Tomato(); myFarm.decreaseMoney(tomato.getPurchasePrice());
		 * myFarm.tomatoList.add(tomato); break; } } catch (IllegalStateException e) {
		 * System.out.println(e.getMessage()); }
		 */
	}

	public void SoldAnimal(String animalName) {

	}

	
	
	
	public void feedAnimal(String animalName, Farm myfarm) throws IOException {
		try {
			if(countAnimal(animalName, myfarm) == 0)
				throw new IOException("oops, you do not have animal to feed\n");
			switch (animalName) {
			case "Pig":
				for (int i = 0; i < myfarm.pigList.size(); i++) {
					Pig p = myfarm.pigList.get(i);
					myfarm.consumeFeedItems();
					p.feed();
				}
				break;
			case "Hen":
				for (int i = 0; i < myfarm.henList.size(); i++) {
					Hen h = myfarm.henList.get(i);
					myfarm.consumeFeedItems();
					h.feed();
				}
				break;
			case "Cow":
				for (int i = 0; i < myfarm.cowList.size(); i++) {
					Cow c = myfarm.cowList.get(i);
					myfarm.consumeFeedItems();
					c.feed();
				}
				break;
			}
		} catch (IllegalArgumentException e) {
			throw new IOException(e.getMessage());
		}

	}

	

	
	public void useHappyAgentItem(String animalName, Farm myfarm) throws IOException {
		try {
			if (myfarm.happyAgentItemsList.size() == 0 || countAnimal(animalName,myfarm) == 0)
				throw new IOException("oops, you do not have happyAgentItem to use\n");
			switch (animalName) {
			case "Pig":
				for (int i = 0; i < myfarm.pigList.size(); i++) {
					Pig p = myfarm.pigList.get(i);
					myfarm.consumeHappyAgentItem();
					p.increaseHappiness();
				}
				break;
			case "Hen":
				for (int i = 0; i < myfarm.henList.size(); i++) {
					Hen h = myfarm.henList.get(i);
					myfarm.consumeHappyAgentItem();
					h.increaseHappiness();
				}
				break;
			case "Cow":
				for (int i = 0; i < myfarm.cowList.size(); i++) {
					Cow c = myfarm.cowList.get(i);
					myfarm.consumeHappyAgentItem();
					c.increaseHappiness();
				}
				break;
			}
		} catch (IllegalStateException e) {
			throw new IOException(e.getMessage());
		}
	}

	public void useTimeAgentItem(String seedName, Farm myfarm) throws IOException {
		try {
			if(countCrops(seedName,myfarm)==0 || myfarm.timeAgentitemsList.size() == 0)
				throw new IOException("oops, you do not have crops or timeAgentItems to use \n");
			switch (seedName) {
			case "Corn":
				for (int i = 0; i < myfarm.cornList.size(); i++) 
				{
					Corn corn = myfarm.cornList.get(i);			
					myfarm.consumeTimeAgentItem();
					corn.decreaseHarvestTime();
				}
				break;
			case "Carrot":
				for (int i = 0; i < myfarm.carrotList.size(); i++) 
				{
					Carrot c = myfarm.carrotList.get(i);			
					myfarm.consumeTimeAgentItem();
					c.decreaseHarvestTime();
				}
				break;
			case "Eggplant":
				for (int i = 0; i < myfarm.eggplantList.size(); i++) 
				{
					Eggplant c = myfarm.eggplantList.get(i);			
					myfarm.consumeTimeAgentItem();
					c.decreaseHarvestTime();
				}
				break;
			case "KiwiFruit":
				for (int i = 0; i < myfarm.kiwifruitList.size(); i++) 
				{
					KiwiFruit c = myfarm.kiwifruitList.get(i);			
					myfarm.consumeTimeAgentItem();
					c.decreaseHarvestTime();
				}
				break;
			case "Tomato":
				for (int i = 0; i < myfarm.tomatoList.size(); i++) 
				{
					Tomato c = myfarm.tomatoList.get(i);			
					myfarm.consumeTimeAgentItem();
					c.decreaseHarvestTime();
				}
				break;
			}
			}
			catch (Exception  e) {
				throw new IOException(e.getMessage());
			}
	}
	
	public void playWithAnimal(String animalName, Farm myfarm) throws IOException{

			if (countAnimal(animalName, myfarm) ==0 )
			{
				throw new IOException("oops, you do not have " + animalName + " to play\n" );
			}
			
			switch (animalName) {
			case "Pig":
				for (int i = 0; i < myfarm.pigList.size(); i++) {
					Pig p = myfarm.pigList.get(i);
					p.play();
				}
				break;
			case "Hen":
				for (int i = 0; i < myfarm.henList.size(); i++) {
					Hen h = myfarm.henList.get(i);
					h.play();
				}
				break;
			case "Cow":
				for (int i = 0; i < myfarm.cowList.size(); i++) {
					Cow c = myfarm.cowList.get(i);
					c.play();
				}
				break;
			}
		
	}
}
