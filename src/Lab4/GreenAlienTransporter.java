package Lab4;

import java.util.ArrayList;
import lab3.GreenAlien;
public class GreenAlienTransporter {

	private String transporterName;
	private final ArrayList<GreenAlien> transporterList;
	
	public GreenAlienTransporter(String name) {
		// TODO Auto-generated constructor stub
		transporterName = name;
		transporterList = new ArrayList<GreenAlien>();
	}

	public boolean addPassenger(GreenAlien alien) {
		if(transporterList.contains(alien)) {
			return false;
		}
		else {
			transporterList.add(alien);
			return true;
		}		
		
	}
	
	public boolean removePassenger(GreenAlien alien) {
		if(transporterList.contains(alien)) {
			transporterList.remove(alien);
			return true;
		}
		else {
			return false;
		}				
	}
	
	public void listPassengers() {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("The passengers on "+ transporterName+" are:");
		for(GreenAlien alien :transporterList) {
			list.add(alien.name);
		}
		StringBuilder sb = new StringBuilder();
		for(String name : list) {
			sb.append(name);
			sb.append(", ");			
		}
		System.out.println(sb);
		
	}
	
	
	public int countEyes() {
		int numEye = 0;
		for(GreenAlien alien :transporterList) {
			numEye += alien.eyeCount;
		}

		return numEye;
	}
	
	public ArrayList<String> shoppingList(){
		ArrayList<String> list = new ArrayList<String> ();
		for(GreenAlien alien :transporterList) {
			list.add(alien.favouriteCandy);
		}
		return list;
	}
	
	public void printDetails() {
		 listPassengers();
			System.out.println("The number of eyes on this transporter is: "+ countEyes());
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreenAlienTransporter transporter = new GreenAlienTransporter("Fun Club");

		GreenAlien kloup = new GreenAlien("Yyest", 2, "Biscuits");
		GreenAlien gwerp = new GreenAlien("Lmona", 99, "Marshmellows");
		GreenAlien blarg = new GreenAlien("Troll", 5, "Pop Rocks");
		GreenAlien lesap = new GreenAlien("Nemoa", 3, "Marshmellows");
		GreenAlien hugso = new GreenAlien("Hugso", 8, "Pop Rocks");

		transporter.addPassenger(kloup);
		System.out.println(transporter.addPassenger(kloup));
		transporter.removePassenger(kloup);
		System.out.println(transporter.addPassenger(kloup));
		transporter.addPassenger(gwerp);
		transporter.addPassenger(blarg);
		transporter.addPassenger(lesap);
		transporter.addPassenger(hugso);

		transporter.printDetails();
	}

}
