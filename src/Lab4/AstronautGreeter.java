package Lab4;

import java.util.*;
public class AstronautGreeter {

	public void greetAstronauts(Collection<Astronaut> astronauts) {
        System.out.print("Hello ");
        for (Astronaut astronaut : astronauts) {
            System.out.print(astronaut.name + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AstronautGreeter astronautGreeter = new AstronautGreeter();

        Astronaut spaceman = new Astronaut("Spaceman", 20, "Hash browns", "0001 to Mars");
        Astronaut spacegirl = new Astronaut("Spacegirl", 21, "Pizza", "0002 to the Moon");
        Astronaut spacedog = new Astronaut("Spacedog", 20, "Hash browns", "0001 to Mars");

        List<Astronaut> astronautList = new ArrayList<Astronaut>();
        astronautList.add(spaceman);
        astronautList.add(spacegirl);
        astronautList.add(spacedog);

        System.out.println("Greeting a list of astronauts:");
        astronautGreeter.greetAstronauts(astronautList);

        Set<Astronaut> astronautSet = new HashSet<Astronaut>();
        astronautSet.add(spaceman);
        astronautSet.add(spacegirl);
        astronautSet.add(spacedog);
        System.out.println("Greeting a set of astronauts:");
        astronautGreeter.greetAstronauts(astronautSet);
    }

}
