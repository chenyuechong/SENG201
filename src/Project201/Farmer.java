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
	
}
