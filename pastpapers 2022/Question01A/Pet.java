package Question01A;

public abstract class Pet implements PointAllocator {

	@Override
	public void getter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setter() {
		// TODO Auto-generated method stub

	}
	
	abstract public void feed();
	
	abstract public void clean();
	
	abstract public void cuddle();
	
	abstract public void GetTotalPoint();
}
