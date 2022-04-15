package project;

public class Santa {
	private int dollsCount = 0;
	private int bicyclesCount = 0;
	
	public int getDollsCount() {
		return dollsCount;
	}

	public void setDollsCount(int dollsCount) {
		this.dollsCount = dollsCount;
	}
	
	public int getBicyclesCount() {
		return bicyclesCount;
	}

	public void setBicyclesCount(int bicyclesCount) {
		this.bicyclesCount = bicyclesCount;
	}
	
	public String toysInBag() {
		return ": В торбата има " + getDollsCount() + " бр. кукли и " + getBicyclesCount() + " бр. колела!";
	}
}
