package by.academy.lesson9.company;

import java.util.Objects;

public class SportCar {
	double speed;

	public SportCar() {
		super();
	}

	public SportCar(double speed) {
		super();
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SportCar other = (SportCar) obj;
		return Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	@Override
	public String toString() {
		return "SportCar [speed=" + speed + "]";
	}

}
