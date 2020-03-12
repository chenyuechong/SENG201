package Lab4;

public class SpaceStation implements  RemoteControllable{

	private String planet;
	private String mission;
	public SpaceStation(String planet) {
		// TODO Auto-generated constructor stub
		this.planet = planet;
	}

	public String getLocation() {
		String s = "The space station floats around the planet "+ this.planet;
		return s;
	}
	
	public String getStatusReport() {
		String s = getLocation()+"\n"+"The station is on a mission to: "+ this.mission;
		return s;
	}
	
	public void updateMission(String mission) {
		this.mission = mission;
	}
	
	/*public static void main(String[] args) {
		SpaceStation station = new SpaceStation("Mars");
		System.out.println(station instanceof RemoteControllable);
		station.updateMission("Store food rations for hungry space travelers");
		System.out.println(station.getStatusReport());
	}*/
}
