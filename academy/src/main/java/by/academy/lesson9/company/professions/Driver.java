package by.academy.lesson9.company.professions;

import java.util.Objects;

import by.academy.lesson9.Person;

public class Driver extends Person{
	protected String fullName;
	protected int drivingExperience;
	
	public Driver() {
		super();
	}

	public Driver(String fullName, int drivingExperience) {
		super();
		this.fullName = fullName;
		this.drivingExperience = drivingExperience;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getDrivingExperience() {
		return drivingExperience;
	}

	public void setDrivingExperience(int drivingExperience) {
		this.drivingExperience = drivingExperience;
	}

	@Override
	public int hashCode() {
		return Objects.hash(drivingExperience, fullName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		return drivingExperience == other.drivingExperience && Objects.equals(fullName, other.fullName);
	}

	@Override
	public String toString() {
		return "Driver [fullName=" + fullName + ", drivingExperience=" + drivingExperience + "]";
	}
	
}
