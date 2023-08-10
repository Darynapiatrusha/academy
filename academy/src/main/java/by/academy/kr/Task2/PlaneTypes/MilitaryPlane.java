package by.academy.kr.Task2.PlaneTypes;

public abstract class MilitaryPlane extends Plane {
	private int carryingCapacity;

	public MilitaryPlane(String manufacturer, String model, int rangeOfFligth, int fuelReserve, int carryingCapacity) {
		super(manufacturer, model, rangeOfFligth, fuelReserve);
		this.carryingCapacity = carryingCapacity;
	}

	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}
	 
	public int getSeatingCapacity() {
		return 0;
	}
}
