package elevator;

public class ElevatorNext {
	public static elevator create(int elevatorNum, int floorNum) {
		return new ElevatorImpl(elevatorNum, floorNum);
	}

}
