package Lab4;

import java.util.ArrayList;


public class StarmanOrganises{

	ArrayList<Object> list1;
	
	public void addControllable(Object o) {
		if(o instanceof RemoteControllable)
			list1.add(o);
	}

	
	void getAllStatusReports() {
		for(Object o: list1) {
			RemoteControllable r = (RemoteControllable)o;
			System.out.println(r.getStatusReport());
		}
	}
	
	
	public StarmanOrganises() {
		// TODO Auto-generated constructor stub
		list1 = new ArrayList<Object>();
	}
	
	public static void main(String[] args) {
		SpaceStation station = new SpaceStation("Mars");
		station.updateMission("Store food rations for hungry space travelers");

		Rover rover = new Rover();
		rover.setLocation(100.0, 42.0);
		rover.updateMission("Find water");

		StarmanOrganises organise = new StarmanOrganises();
		organise.addControllable(station);
		organise.addControllable(rover);
		organise.getAllStatusReports();
	}

}
