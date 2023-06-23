package by.academy.lesson10;

public class Pear extends Fruit {
	protected double price;

	@Override
	protected double calcPrice() {
		return weight * price;
	}

	public Pear(double weight, double price) {
		super(weight);
		this.price = price;
	}
}
