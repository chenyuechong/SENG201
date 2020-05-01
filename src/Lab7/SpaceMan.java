package Lab7;

public class SpaceMan implements Observer {
	  
	  @Override
	  public void update(Observable o, Object arg) {
	    System.out.println("Received update!");
	  }
	}
