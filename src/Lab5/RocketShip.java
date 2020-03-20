package Lab5;

public class RocketShip {
	 int MAX_FUEL_LEVEL = 100;

	    int fuelLevel;
	    int currentHeight;

	    public RocketShip(int fuelLevel) {
	        this.fuelLevel = fuelLevel;
	        this.currentHeight = 0;
	    }

	    public int getFuelLevel() {
	        return fuelLevel;
	    }

	    public int getCurrentHeight() {
	        return currentHeight;
	    }


	    public void fuelUp(int fuelAmount) {
	    	if(fuelAmount > 0) {
	            fuelLevel += fuelAmount;
	        } else {
	            throw new IllegalArgumentException("Fuel amount must be positive for fueling up");
	        }
	    }

	    public void takeOff() throws IllegalStateException {
	    	if(fuelLevel < 20)
	    	{
	    		throw new IllegalStateException("Not enough fuel!");
	    	}
	    	else {
	            fuelLevel -= 20;
	            currentHeight += 20;
	    	}
	     currentHeight += 20;
	    }

	    public void goHigher() {
	        fuelLevel -= 10;
	        currentHeight += 50;
	    }

	    public void goLower() {
	        currentHeight -= 50;
	    }

	    public void land() throws LandingException {
	    	if(currentHeight > 20)
	    	{
	    		throw new LandingException("Too high to land!");
	    	}
	        currentHeight = 0;
	    }
	    
	    public void testFlight() throws InsufficientFuelException{
	    	try {
	    			takeOff();
	    			
	    		}
	    	catch(IllegalStateException e){
	    	       System.out.println(e.getMessage());
	    	}
	    	try {
	    		goHigher();
    			goLower();
    			 land() ;
	    	}
	    	catch(LandingException e){
	    		System.out.println(e.getMessage());
	    	}
	    	finally {
	    		System.out.println("Cleaning up launch pad");
	    	}
	    	
	    	
	    }
}
