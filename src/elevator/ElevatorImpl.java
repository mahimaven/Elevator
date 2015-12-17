package elevator;

import java.util.ArrayList;

import javax.swing.text.Utilities;

import Floor.FloorManager;


public class ElevatorImpl implements elevator {
private static long traveltime=100;
private static long doortoggletime=200;
private static long dooridletime=300;
private static long idletime=500;
private int currentFloor;
private int defaultFloorNum;
private int elevatorNumber;
private ArrayList<Integer> dest = new ArrayList<Integer>();


private ElevDirection direction;
private ElevStatus status;
	public ElevatorImpl(int elevatorNum, int floorNum) {
		currentFloor = floorNum;
		setDefaultFloorNum(floorNum);
		setElevatorNumber(elevatorNum);
		setDirection(ElevDirection.UP);
		setStatus(ElevStatus.IDLEINITIAL);
		// TODO Auto-generated constructor stub
	}

	private void setStatus(ElevStatus idleinitial) {
		// TODO Auto-generated method stub
		
	}

	private void setDirection(ElevDirection up) {
		// TODO Auto-generated method stub
		
	}

	private void setElevatorNumber(int elevatorNum) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultFloorNum(int floorNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
try
{
	while(true){
		if(dest.size()==0)
		{
			if(getCurrentFloor() != getDefaultFloor())
			{
				System.out.printf("%s Elev %d timeout\n", Utilities.timetoString(),getElevatorNumber());
				synchronized(this);	
				setStatus(ElevStatus.IDLE);
				setDirection(ElevDirection.NONE);
			}
		}
	}
}
	}
	private int getDefaultFloor() {
		// TODO Auto-generated method stub
		return 0;
	}

	private Object getElevatorNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertDestination(int f) {
		if(f <= 0 || f > FloorManager.getInstance().getNumberOfFloors()) {
			throw new IllegalArgumentException("Cannot insert floor that is less than 1 or more than the total number of floors");
		}

		if ((direction == ElevDirection.UP && (f < getCurrentFloor() || f == getCurrentFloor()))) {
			System.out.printf("%s Elevator %d for Floor %d is not in the current direction of travel - ignored\n", Utilities.timeToString(), getElevatorNumber(), f);
			return;
		} else if ((direction == ElevDirection.DOWN) && (f > getCurrentFloor() || f == getCurrentFloor())) {
			System.out.printf("%s Elevator %d for Floor %d is not in the current direction of travel - ignored\n", Utilities.timeToString(), getElevatorNumber(), f);
			return;
		} 
			
		if(getStatus() == ElevStatus.IDLE || getStatus() == ElevStatus.IDLEINITIAL){
			if(f > currentFloor)
				setDirection(ElevDirection.UP);
			else if(f < currentFloor)
				setDirection(ElevDirection.DOWN);
		}	
		
		dest.add(f);
		sortDestinations();
	}
	private void sortDestinations() {
		// TODO Auto-generated method stub
		
	}

	private int getCurrentFloor() {
		// TODO Auto-generated method stub
		return 0;
	}

	private ElevStatus getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	//*Creates String rep of remaining dest */
	public String destinationsToString(){
		String s = "[";
		
		int destsLeft = dest.size();
		for(int i = 0; i < destsLeft - 1; i++){
			s += dest.get(i) + ", ";
		}

		if(destsLeft > 0){
			s += dest.get(destsLeft - 1);
		}
		return s + "]";
	}
	@Override
	public void Dest(int f) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.printf("%s Elevator %d arrived at Floor %d. Opening Door\n", Utilities.timeToString(), elevatorNumber, currentFloor);

	}

}
