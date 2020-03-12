package lab3;

public class GreenAlien {
	public String name;
	public int eyeCount;
	public String favouriteCandy;
	
	public GreenAlien() {
		name = "Kloup";
		eyeCount = 6;
		favouriteCandy = "Lollypops";
	}
	
	public GreenAlien(String tempName, int tempEye, String tempCandy) {
		name = tempName;
		eyeCount = tempEye;
		favouriteCandy = tempCandy;
	}
	
	public String toString() {
		return "This Alien is called "+name+" and has "+eyeCount+" eyes. Gross. It seems to enjoy eating "+favouriteCandy;
	}
	
	public boolean equals(GreenAlien other) {
		if(this.name == other.name && this.eyeCount == other.eyeCount && this.favouriteCandy == other.favouriteCandy)
			return true;
		else
			return false;
	}
    
	public static void main(String[] args) {
		GreenAlien kloup = new GreenAlien();
		GreenAlien lesap = new GreenAlien();
		GreenAlien gwerp = new GreenAlien("Gwerp", 4, "Marshmellows");
		GreenAlien blarg = new GreenAlien("Kloup", 3, "Pop Rocks");

		System.out.println(kloup.equals(lesap));
		System.out.println(gwerp.equals(lesap));
		System.out.println(kloup.equals(blarg));
	}
}
