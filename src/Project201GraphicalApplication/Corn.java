/**
 * 
 * Corn class inherit from Crop
 */
package Project201GraphicalApplication;

public class Corn extends Crop{
	public Corn()
	{
		super("Corn", 2, 5, 2,10);
	}
	
	public String toString() {
		
		System.out.print("sow a Corn seed");
		return ("sow a Corn seed");
		
	}

}
