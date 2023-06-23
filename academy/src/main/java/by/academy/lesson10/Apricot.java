package by.academy.lesson10;

public class Apricot extends Fruit {
	protected double price;

	@Override
	protected double calcPrice() {
		return weight * price;
	}

	public Apricot(double weight, double price) {
		super(weight);
		this.price = price;
	}
}
