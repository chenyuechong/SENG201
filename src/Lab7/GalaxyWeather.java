package Lab7;


public class GalaxyWeather extends Observable{
	private boolean isSolarFlare = false;
	private boolean isSpaceStorm = false;
	private boolean isComets = false;
	public boolean getIsSolarFlare()
	{
		return isSolarFlare;
	}
	public boolean getIsSpaceStorm()
	{
		return isSpaceStorm;
	}
	public boolean getIsComets()
	{
		return isComets;
	}
	
	public void setIsSolarFlare(boolean isSolarFlare)
	{
		if(isSolarFlare)
		{
		this.isSolarFlare = isSolarFlare;
		super.setChanged();
		super.notifyObservers("SolarFlare");
		}
		else
			this.isSolarFlare = isSolarFlare;
	
	}
	
	public void setIsSpaceStorm(boolean isSpaceStorm)
	{
		if(isSpaceStorm)
		{
			this.isSpaceStorm = isSpaceStorm;
		
			super.setChanged();
			super.notifyObservers("SpaceStorm");
		}
		else
			this.isSpaceStorm = isSpaceStorm;
	}
	public void setIsComets(boolean isComets)
	{
		if(isComets)
		{
			this.isComets = isComets;
			super.setChanged();
			super.notifyObservers("Comets");
		}
		else
			this.isComets = isComets;
	}
	
	public static void main(String[] args) {
		//GalaxyWeather weather = new GalaxyWeather();
		//System.out.println(weather.getIsComets());
		
		//GalaxyWeather weather = new GalaxyWeather();
		//SpaceMan spacey = new SpaceMan();
		//weather.addObserver(spacey);
		//System.out.println(weather.countObservers());
		//weather.setIsSolarFlare(true);
		
		//GalaxyWeather weather = new GalaxyWeather();
		//Starman spacey = new Starman();
		//weather.addObserver(spacey);
		//weather.setIsComets(true);
		
		
		GalaxyWeather weather = new GalaxyWeather();
		Starman spacey = new Starman();
		spacey.startObserving(weather);
		weather.setIsComets(true);
	}
}
