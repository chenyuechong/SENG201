package Project201;

public class Farmer {
	private String name = "";
	private int age = 18;
	public Farmer(String farmerName) {
		name = farmerName;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int n)
	{
		age = n;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void buySeed(String seedName, Farm myFarm)
	{
		switch(seedName) {
		case "Corn":
			Corn corn = new Corn();
			myFarm.cornList.add(corn);
			myFarm.decreaseMoney(corn.getPurchasePrice());
			break;
		case "Carrot":
			Carrot carrot = new Carrot();
			myFarm.carrotList.add(carrot);
			myFarm.decreaseMoney(carrot.getPurchasePrice());
			break;
		case "Eggplant":
			Eggplant eggplant = new Eggplant();
			myFarm.eggplantList.add(eggplant);
			myFarm.decreaseMoney(eggplant.getPurchasePrice());
			break;
		case "KiwiFruit":
			KiwiFruit kiwifruit = new KiwiFruit();
			myFarm.kiwifruitList.add(kiwifruit);
			myFarm.decreaseMoney(kiwifruit.getPurchasePrice());
			break;
		case "Tomato":
			Tomato tomato = new Tomato();
			myFarm.tomatoList.add(tomato);
			myFarm.decreaseMoney(tomato.getPurchasePrice());
			break;
		}
		
	}
	
	public void buyAnimal(String animalName, Farm myFarm) {
		switch(animalName) {
		case "Pig":
			Pig p = new Pig();
			myFarm.pigList.add(p);
			double leftMoney = myFarm.getMoney() - p.getPurchasePrice();
			myFarm.setMoney(leftMoney);
			break;
		case "Hen":
			Hen h = new Hen();
			myFarm.henList.add(h);
			double leftMoney1 = myFarm.getMoney() - h.getPurchasePrice();
			myFarm.setMoney(leftMoney1);
			break;
		case "Cow":
			Cow c = new Cow();
			myFarm.cowList.add(c);
			double leftMoney2 = myFarm.getMoney() - c.getPurchasePrice();
			myFarm.setMoney(leftMoney2);
			break;
		}
	}
	
	
	public void buyItems(String itemsName, Farm myFarm) {
		switch(itemsName) {
		case "AnimalFeedItems":
			AnimalFeedItems p = new AnimalFeedItems();
			myFarm.animalFeedItemsList.add(p);
			double leftMoney = myFarm.getMoney() - p.getPurchasePrice();
			myFarm.setMoney(leftMoney);
			break;
		case "TimeAgentItems":
			TimeAgentItems h = new TimeAgentItems();
			myFarm.timeAgentitemsList.add(h);
			double leftMoney1 = myFarm.getMoney() - h.getPurchasePrice();
			myFarm.setMoney(leftMoney1);
			break;
		case "HappyAgentItems":
			HappyAgentItems c = new HappyAgentItems();
			myFarm.happyAgentItemsList.add(c);
			double leftMoney2 = myFarm.getMoney() - c.getPurchasePrice();
			myFarm.setMoney(leftMoney2);
			break;
		}
	}
	
	public int countCrops(String seedName, Farm myFarm)
	{
		int count = 0;
		switch(seedName) {
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
	
	public int countAnimal(String animalName, Farm myFarm)
	{
		int count = 0;
		switch(animalName) {
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
	
	
	public int countItems(String itemsName, Farm myFarm)
	{
		int count = 0;
		switch(itemsName) {
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
	public void SoldCrop(String seedName)
	{
		
	}
	public void SoldAnimal(String animalName)
	{
		
	}
	public void feedAnimal(String animalName,Farm myfarm)
	{
		
		/*
		 * if (myfarm.animalFeedItemsList.size() <= 0) {
		 * System.out.print("You donot have enough foods to feed animal"); return; }
		 * else {
		 * 
		 * switch (animalName) { case "Pig": for (int i = 0; i < myfarm.pigList.size();
		 * i++) { Pig p = myfarm.pigList[i]; } break; case "Hen": count = 0; count =
		 * myFarm.henList.size(); break; case "Cow": count = 0; count =
		 * myFarm.cowList.size(); break; } }
		 */
		 
	}
	
	public void playWithAnimal(String animalName)
	{
		/*
		 * switch(animalName) { case "Pig": Pig p = new Pig(); myFarm.pigList.add(p);
		 * double leftMoney = myFarm.getMoney() - p.getPurchasePrice();
		 * myFarm.setMoney(leftMoney); break; case "Hen": Hen h = new Hen();
		 * myFarm.henList.add(h); double leftMoney1 = myFarm.getMoney() -
		 * h.getPurchasePrice(); myFarm.setMoney(leftMoney1); break; case "Cow": Cow c =
		 * new Cow(); myFarm.cowList.add(c); double leftMoney2 = myFarm.getMoney() -
		 * c.getPurchasePrice(); myFarm.setMoney(leftMoney2); break;
		 */
	}
	
	public void useHappyAgentItem()
	{
		
	}
	
	public void useTimeAgentItem()
	{
		
	}
}
