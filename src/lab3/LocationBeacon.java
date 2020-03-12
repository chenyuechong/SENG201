package lab3;

public class LocationBeacon {
	
	private int hours = 14;
	private int minutes = 31;
	private int distance = 300000;
	
	public void heartBeat(int startHour, int startMinute, int startDistance, int speed, int duration) {
		
		hours = startHour;
		minutes = startMinute;
		distance = startDistance;
		int times = duration / 10;
		for(int i =1; i <= times; i++) {
	        minutes += 10;
	        if(minutes >= 60)
	        {
	        	hours += 1;
	        	minutes = minutes % 60;
	        }
	        if(hours >= 24)
	        {
	        	hours = hours % 24;
	        }
	        distance +=speed /6 ;
			System.out.println("["+ hours+ ":"+ minutes +"] Starman is " + distance+"km away from Earth");
		}
	}
	
	
	public static void main(String[] args) {

		LocationBeacon beacon = new LocationBeacon();
		beacon.heartBeat(23, 28, 630000, 10000, 90);
	}
}
