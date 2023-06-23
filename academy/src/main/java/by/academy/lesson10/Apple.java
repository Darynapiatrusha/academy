package by.academy.lesson10;

public class Apple extends Fruit {
	protected double price;

	@Override
	protected double calcPrice() {
		return weight * price;
	}

	public Apple(double weight, double price) {
		super(weight);
		this.price = price;
	}
}
