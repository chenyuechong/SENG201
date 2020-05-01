package Lab7;

public class Starman implements Observer {
	  
	  @Override
	  public void update(Observable o, Object arg) {
		  if(arg == "SolarFlare")
			  System.out.println("Sigh... no adventuring today");
		  if(arg == "Comets")
			  System.out.println("I'll show those comets who's boss!");
	  }
	  public void startObserving(GalaxyWeather galaxyWeather)
	  {
		  galaxyWeather.addObserver(this);
	  }
	  
	  public void stopObserving(GalaxyWeather galaxyWeather) 
	  {
		  galaxyWeather.deleteObserver(this);
		  
	  }

}
