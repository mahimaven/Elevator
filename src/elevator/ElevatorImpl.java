package elevator;

public class ElevatorImpl implements elevator {
private static long traveltime=100;
private static long doortoggletime=200;
private static long dooridletime=300;
private static long idletime=500;
private int currentFloor;
private int defaultFloorNum;
private int elevatorNumber;

	public ElevatorImpl(int elevatorNum, int floorNum) {
		// TODO Auto-generated constructor stub
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
				System.out.printf(%sElev %d timeout\n", Utilities.timetoString(),getElevatorNumber());"
				synchronized(this);		
			}
		}
	}
}
	}

	@Override
	public void Dest(int f) throws InterruptedException {
		// TODO Auto-generated method stub

	}

}
