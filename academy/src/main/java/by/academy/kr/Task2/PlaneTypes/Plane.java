package by.academy.kr.Task2.PlaneTypes;

import java.util.Objects;

public abstract class Plane {
	private String manufacturer;
	private String model;
	private int rangeOfFligth;
	private int fuelReserve;

	public Plane() {
		super();
	}

	public Plane(String manufacturer, String model, int rangeOfFligth, int fuelReserve) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.rangeOfFligth = rangeOfFligth;
		this.fuelReserve = fuelReserve;
	}

	public abstract int getCarryingCapacity();

	public abstract int getSeatingCapacity();

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRangeOfFligth() {
		return rangeOfFligth;
	}

	public void setRangeOfFligth(int rangeOfFligth) {
		this.rangeOfFligth = rangeOfFligth;
	}

	public int getFuelReserve() {
		return fuelReserve;
	}

	public void setFuelReserve(int fuelReserve) {
		this.fuelReserve = fuelReserve;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fuelReserve, manufacturer, model, rangeOfFligth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		return fuelReserve == other.fuelReserve && Objects.equals(manufacturer, other.manufacturer)
				&& Objects.equals(model, other.model) && rangeOfFligth == other.rangeOfFligth;
	}

	@Override
	public String toString() {
		return "Plane: [manufacturer=" + manufacturer + ", model=" + model + ", rangeOfFligth=" + rangeOfFligth
				+ ", fuelReserve=" + fuelReserve + ", carryingCapacity " + getCarryingCapacity() + ", seatingCapacity "
				+ getSeatingCapacity() + "]";
	}
}
