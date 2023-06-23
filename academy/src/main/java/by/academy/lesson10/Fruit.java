package by.academy.lesson10;

public abstract class Fruit {
	protected double weight;

	protected final void printManufacturerInfo() {
		System.out.print("Made in Ukraine");
	}

	protected abstract double calcPrice();

	public Fruit() {
		super();
	}

	public Fruit(double weight) {
		super();
		this.weight = weight;
	}
}
