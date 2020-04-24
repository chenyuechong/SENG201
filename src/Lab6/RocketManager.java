package Lab6;

import java.util.ArrayList;
public class RocketManager {
	String name;
	ArrayList<Rocket> RocketList = new ArrayList<Rocket>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	 public ArrayList<Rocket> getRocketList() {
		 return RocketList;
	 }
	 
	 public void setRocketList(ArrayList<Rocket> newList) {
		 RocketList = newList;
	 }
	 
	 public void launchMainScreen() {
		 MainScreen mainWindow = new MainScreen(this);
	 }
	 
	 public void closeMainScreen(MainScreen mainWindow) {
		 mainWindow.closeWindows();
	 }
	 
	 public void launchSetupScreen() {
		 SetupScreen setupWindow = new SetupScreen(this);
	 }
	 public void closeSetupScreen(SetupScreen setupWindow) {
		 setupWindow.closeWindows();
		 launchMainScreen();
	 }
	 
	 public static void main(String[] args) {
		 RocketManager manager = new RocketManager();   
		 manager.launchSetupScreen();
	 }
	 
	 
}

