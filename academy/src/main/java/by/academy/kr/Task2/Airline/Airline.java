package by.academy.kr.Task2.Airline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.academy.kr.Task2.PlaneTypes.Plane;

public class Airline {
	private String name;
	private List<Plane> planes;

	public Airline(String name, ArrayList<Plane> planes) {
		super();
		this.name = name;
		this.planes = planes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Plane> getPlanes() {
		return planes;
	}

	public void setPlanes(ArrayList<Plane> planes) {
		this.planes = planes;
	}

	public void culcTotalCapacity() {
		int carryingCapacity = 0;
		int seatingCapacity = 0;
		for (int i = 0; i < planes.size(); i++) {
			carryingCapacity += planes.get(i).getCarryingCapacity();
			seatingCapacity += planes.get(i).getSeatingCapacity();
		}
		System.out.println("Total carryingCapacity: " + carryingCapacity);
		System.out.println("Total seatingCapacity: " + seatingCapacity);
	}

	public void sortByRangeOfFligth() {
		Collections.sort(planes, (p1, p2) -> p1.getRangeOfFligth() - (p2.getRangeOfFligth()));
		for (Plane plane : planes) {
			System.out.println(plane);
		}
	}

	public void planeByFuelReserve(int minFuelReserve, int maxFuelReserve) {
		for (int i = 0; i < planes.size(); i++) {
			int fuelReserve = planes.get(i).getFuelReserve();
			if (fuelReserve >= minFuelReserve && fuelReserve <= maxFuelReserve) {
				System.out.println(planes.get(i));
			}
		}
	}

	@Override
	public String toString() {
		return "Airline [name=" + name + ", planes=" + planes + "]";
	}
}
