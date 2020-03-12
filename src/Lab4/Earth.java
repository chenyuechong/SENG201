package Lab4;

public class Earth extends Planet{

	public Earth() {
		// TODO Auto-generated constructor stub
		super("Earth", 3, "Warm");
	}
	
	public String home() {
		return ("Home to every one of us");
	}

	
	/*public static void main(String[] args) {
		Earth earth = new Earth();
		System.out.println(earth instanceof Planet);
		System.out.println(earth);
		System.out.println(earth.home());
	}*/
}
