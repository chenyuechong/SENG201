package Lab4;

public class Rover implements  RemoteControllable {

	private double latitude ;
	private double longitude;
	private String mission;
	public void setLocation(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getLocation() {
		String s ="The rover is located "+ latitude+", "+ longitude+" on the planet.";
		return s;
	}
	
	public String getStatusReport() {
		String s1= getLocation();
		String s = s1 +"\n" + "The rover is driving to: " + this.mission;	
		return s;
	}
	
	public void updateMission(String mission) {
		this.mission = mission;
	}
	
}
