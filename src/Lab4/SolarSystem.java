package Lab4;
import java.util.*;
public class SolarSystem {

	ArrayList<Planet> pList;
	public SolarSystem() {
		// TODO Auto-generated constructor stub
		pList = new ArrayList<Planet>();
	}

	
	public void addPlanet(Planet planet) {
		pList.add(planet);
	}
	
	public void printAllPlanets() {
		for(Planet p: pList) {
			System.out.println(p.toString());
		}
	}
	
	public int getPlanetCount() {
		return pList.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet mercury = new Mercury();
		Planet venus = new Venus();
		Planet earth = new Earth();
		Planet saturn = new Saturn();

		SolarSystem solarsystem = new SolarSystem();
		solarsystem.addPlanet(mercury);
		solarsystem.addPlanet(venus);
		solarsystem.addPlanet(earth);
		solarsystem.addPlanet(saturn);

		solarsystem.printAllPlanets();
		System.out.println(solarsystem.getPlanetCount());
	}

}
