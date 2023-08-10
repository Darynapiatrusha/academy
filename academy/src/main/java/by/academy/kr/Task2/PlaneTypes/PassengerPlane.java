package by.academy.kr.Task2.PlaneTypes;

public abstract class PassengerPlane extends Plane {
	private int carryingCapacity;
	private int seatingCapacity;

	public PassengerPlane(String manufacturer, String model, int rangeOfFligth, int fuelReserve, int carryingCapacity,
			int seatingCapacity) {
		super(manufacturer, model, rangeOfFligth, fuelReserve);
		this.carryingCapacity = carryingCapacity;
		this.seatingCapacity = seatingCapacity;
	}

	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
}
