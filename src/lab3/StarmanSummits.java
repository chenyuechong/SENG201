package lab3;

public class StarmanSummits {
	

	public void climbMountain(double height, double dash, double slide) {
		int times = 0;
		float climbHeigh = 0;
		while(climbHeigh < height) {
			
			climbHeigh += dash ;
			times ++;
			if(climbHeigh >= height)
				break;
			else
				climbHeigh -= slide;
			
		}
		
		System.out.println("Starman needs to dash "+times+" times before he reaches the top of the mountain");
	}
	
	public static void main(String[] args) {
		StarmanSummits starman = new StarmanSummits();
		starman.climbMountain(21287.4, 16.4, 4.3);
	}
}
