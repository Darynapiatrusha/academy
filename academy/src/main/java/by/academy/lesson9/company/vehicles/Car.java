package by.academy.lesson9.company.vehicles;

import by.academy.lesson9.company.details.Engine;
import by.academy.lesson9.company.professions.Driver;

public class Car {
	protected String carBrand;
	protected String carClass;
	protected double weight;
	protected Driver carDriver;
	protected Engine carMotor;

	void start() {
		System.out.println("Поехали");
	}

	void stop() {
		System.out.println("Останавливаемся");
	}

	void turnRight() {
		System.out.println("Поворот направо");
	}

	void turnLeft() {
		System.out.println("Поворот налево");
	}

	void printInfo() {
		System.out.println("Марка автомобиля: " + carBrand + " класс автомобиля: " + carClass + " вес автомобиля: "
				+ weight + " " + carDriver + " " + carMotor);
	}

	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", carClass=" + carClass + ", weight=" + weight + ", carDriver="
				+ carDriver + ", carMotor=" + carMotor + "]";
	}

}
