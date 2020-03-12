package Lab4;

public class Astronaut {

	 public String name;
	    public int age;
	    public String favouriteFood;
	    public String spaceMission;

	    public Astronaut() {
	        name = "Starman";
	        age = 23;
	        favouriteFood = "Burgers";
	        spaceMission = "0000 space exploration";
	    }

	    public Astronaut(String tempName, int tempAge, String tempFood, String tempMission) {
	        name = tempName;
	        age = tempAge;
	        favouriteFood = tempFood;
	        spaceMission = tempMission;

	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getFavouriteFood() {
	        return favouriteFood;
	    }

	    public String getSpaceMission() {
	        return spaceMission;
	    }

	    public boolean equals(Astronaut other) {
	        if (this.name == other.getName() &&
	                this.age == other.getAge() &&
	                this.favouriteFood == other.getFavouriteFood() &&
	                this.spaceMission == other.getSpaceMission()) {

	            return true;
	        }
	        return false;
	    }

	    public String toString() {
	        return "Hi, my name is " + name + " and I am " + age + " years old. " +
	                "My favourite food is " + favouriteFood + " and I am on mission "
	                + spaceMission + ".";
	    }

}
