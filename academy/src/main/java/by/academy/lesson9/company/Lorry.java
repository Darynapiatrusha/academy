package by.academy.lesson9.company;

import java.util.Objects;

import by.academy.lesson9.company.vehicles.Car;

public class Lorry extends Car {
	int carrying;

	public Lorry() {
		super();
	}

	public Lorry(int carrying) {
		super();
		this.carrying = carrying;
	}

	public int getCarrying() {
		return carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carrying);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lorry other = (Lorry) obj;
		return carrying == other.carrying;
	}

	@Override
	public String toString() {
		return "Lorry [carrying=" + carrying + "]";
	}

}
