package Floor;

import java.util.ArrayList;

public class FloorManager {
	private static FloorManager floorManager;
	private static ArrayList<Floor> floors;
	private FloorManager() {
		floors = new ArrayList<Floor>();
	}
	public static Object getInstance() {
		if(floorManager == null) {
			floorManager = new FloorManager();
			floors = new ArrayList<Floor>();
			// TODO Auto-generated method stub
		
	}
return floorManager;
}
	//*
	public void setNumberOfFloors(int numFloors) {
		for(int i=1; i <= numFloors; i++){
			floors.add(new Floor(i));
		}
}
}
