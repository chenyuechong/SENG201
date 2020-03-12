package Lab4;

import java.util.*;
public class StarmansBoss {

	
	int getCollectiveAge(Collection<Astronaut> o) {
		int count = 0;
		for(Astronaut a:o) {
			count += a.age;
		}
		return count;
	}
	public static void main(String[] args) {
		Astronaut spaceman = new Astronaut("Spaceman", 20, "Hash browns", "0001 to Mars");
		Astronaut spacegirl = new Astronaut("Spacegirl", 21, "Pizza", "0002 to the Moon");
		Astronaut spacedog = new Astronaut("Spacedog", 7, "Hash browns", "0001 to Mars");

		List<Astronaut> astronautList = List.of(spaceman, spacegirl, spacedog);

		StarmansBoss boss = new StarmansBoss();
		System.out.println(boss.getCollectiveAge(astronautList));
	}
}
