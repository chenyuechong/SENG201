package Lab4;

public class Planet {

	private String pName;
	private int pOrder;
	private String pTemp;
	public Planet(String name, int order, String temperature) {
		// TODO Auto-generated constructor stub
		pName = name;
		pOrder = order;
		pTemp = temperature;
	}

	public String orderFromSun() {
		String s = pName +" is number " + pOrder +" from the Sun";
		return s;
	}
	
	public String getName() {
		return pName;
	}
	
	public String getTemperature() {
		return pTemp;
	}
	
	public String toString() {
		return (orderFromSun() +" and is " + pTemp);
	}
	
	
	
}
