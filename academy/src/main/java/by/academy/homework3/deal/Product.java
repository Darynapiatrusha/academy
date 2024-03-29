package by.academy.homework3.deal;

import java.io.Serializable;
import java.util.Objects;

public abstract class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String name;
	protected double price;
	protected double quantity;

	public Product() {
		super();
	}

	public Product(String name, double price, double quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	protected double calcFullPrice() {
		return price * quantity * discount();
	}

	protected abstract double discount();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(quantity) == Double.doubleToLongBits(other.quantity);
	}

	@Override
	public String toString() {
		return "Name of product: " + name + ", price: " + price + ", quantity: " + quantity;
	}
}
