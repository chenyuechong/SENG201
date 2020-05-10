/**
 * 
 */
package Project201;

public class Farm {

	
	private String name ;
	private int type ;
	private int money;
	Farmer myFarmer;
	/**
	 * 
	 */
	public Farm() {
		// TODO Auto-generated constructor stub
		 name = "";
		 type = 0;
		 money = 0;
	}
	
	public void setType(int n)
	{
		type = n;
	}
	public void setMoney(int n)
	{
		money = n;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public int getMoney()
	{
		return money;
	}
	public String getName()
	{
		return name;
	}
	public int getType()
	{
		return type;
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
