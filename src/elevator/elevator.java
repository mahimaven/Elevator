package elevator;

public interface elevator extends Runnable {
public enum ElevDirection{
	UP,DOWN,NONE
}
public enum ElevStatus{
	MOVING,DOOROPEN,DOORCLOSE,IDLE,IDLEINITIAL
}
public void Dest(int f) throws InterruptedException;
}
