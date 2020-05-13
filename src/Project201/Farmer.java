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
	
	public Crop buySeed(String seedName)
	{
		switch(seedName) {
		case "Corn":
			Corn corn = new Corn();
			return corn;
		case "Carrot":
			Carrot carrot = new Carrot();
			return carrot;
		case "Eggplant":
			Eggplant eggplant = new Eggplant();
			return eggplant;
		case "KiwiFruit":
			KiwiFruit kiwifruit = new KiwiFruit();
			return kiwifruit;
		case "Tomato":
			Tomato tomato = new Tomato();
			return tomato;
		
		}
		return null;
	}
	
	public void sowSeed(String seedName)
	{
		
	}
	public void SoldCrop(String seedName)
	{
		
	}
	public void SoldAnimal(String animalName)
	{
		
	}
	public void feedAnimal(String animalName)
	{
		
	}
	
	public void playWithAnimal(String animalName)
	{
		
	}
	
	public void useHappyAgentItem()
	{
		
	}
	
	public void useTimeAgentItem()
	{
		
	}
}
