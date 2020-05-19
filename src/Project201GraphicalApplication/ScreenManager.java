package Project201GraphicalApplication;

import java.util.ArrayList;

public class ScreenManager {
	String name;
	//ArrayList<Rocket> RocketList = new ArrayList<Rocket>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	/*
	 * public ArrayList<Rocket> getRocketList() { return RocketList; }
	 * 
	 * public void setRocketList(ArrayList<Rocket> newList) { RocketList = newList;
	 * }
	 */
	 
	 public void launchMainScreen() {
		 MainScreen mainWindow = new MainScreen(this);
	 }
	 
	 public void closeMainScreen(MainScreen mainWindow) {
		 mainWindow.closeWindows();
	 }
	 
	public void launchSetupScreen() {
		SetupScreen setupWindow = new SetupScreen(this);
	}

	public void launchAnimalScreen(String animalName, int index) {
		System.out.print("lunchAnimalScreen");
		AnimalScreen setupWindow = new AnimalScreen(this, animalName, index);
	}
	
	public void launchCropScreen(String cropName, int index) {
		CropScreen CropWindow = new CropScreen(this, cropName, index);
	}
	
	public void launchStoreScreen() {
		StoreScreen storeWindow = new StoreScreen(this);
	}
	
	public void launchProfileScreen() {
		ProfileScreen profileWindow = new ProfileScreen(this);
	}
	
	
	public void closeSetupScreen(SetupScreen setupWindow) {
		setupWindow.closeWindows();
		launchMainScreen();
	}

	public void closeStoreScreen(StoreScreen storeWindow) {
		storeWindow.closeWindows();
		launchMainScreen();
	}
	
	public void closeAnimalScreen(AnimalScreen animalWindow) {
		animalWindow.closeWindows();
		launchMainScreen();
	}
	public void closeCropScreen(CropScreen cropWindow) {
		cropWindow.closeWindows();
		launchMainScreen();
	}
	
	
	public void closeProfileScreen(ProfileScreen profileWindow) {
		profileWindow.closeWindows();
		launchMainScreen();
	}
	
	public static void main(String[] args) {
		ScreenManager manager = new ScreenManager();
		//CommandLineEntrance.main();  CommandLineApplication entrance
		
		  if (Controller.isFirstLogin() == false) { manager.launchSetupScreen(); } else
		  {
		  
		  if(Controller.isPlayed()) Controller.init(); String s =
		  Controller.readFromFile(); String[] p = s.split("-"); int typeId =
		  Integer.parseInt(p[0].trim()); String farmerName = p[1]; String farmName =
		  p[2]; int playDays = Integer.parseInt(p[3].trim());
		  Controller.createFarm(typeId, farmerName.toUpperCase(),
		  farmName.toUpperCase(), playDays); manager.launchMainScreen(); }
		 
	}
	 
	 
}

