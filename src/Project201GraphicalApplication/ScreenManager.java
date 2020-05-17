package Project201GraphicalApplication;

import java.util.ArrayList;

import Project201.Controller;
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

	public void launchAnimalScreen() {
		AnimalScreen setupWindow = new AnimalScreen(this);
	}
	
	public void launchCropScreen() {
		CropScreen CropWindow = new CropScreen(this);
	}
	
	public void launchStoreScreen() {
		StoreScreen storeWindow = new StoreScreen(this);
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
	
	
	public static void main(String[] args) {
		String s = Controller.readFromFile();
		ScreenManager manager = new ScreenManager();
		if (s.length() == 0) {		
			manager.launchSetupScreen();
		} else {
			String[] p = s.split("-");
			int typeId = Integer.parseInt(p[0].trim());
			String farmerName = p[1];
			String farmName = p[2];
			int playDays = Integer.parseInt(p[3].trim());
			Controller.createFarm(typeId, farmerName.toUpperCase(), farmName.toUpperCase(), playDays);
			Controller.readPlayConfigureFromFile();
			manager.launchMainScreen();
		}

	}
	 
	 
}

