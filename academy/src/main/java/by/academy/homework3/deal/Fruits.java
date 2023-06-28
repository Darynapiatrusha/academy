package by.academy.homework3.deal;

import java.util.Objects;

public class Fruits extends Product {
	private String countryOfProducer;
	private String color;

	public Fruits() {
		super();
	}

	public Fruits(String name, double price, double quantity) {
		super(name, price, quantity);
	}

	public Fruits(String name, double price, double quantity, String countryOfProducer, String color) {
		super(name, price, quantity);
		this.countryOfProducer = countryOfProducer;
		this.color = color;
	}

	@Override
	protected double discount() {
		if (quantity > 3) {
			return 0.8;
		}
		return 1;
	}

	public String getCountryOfProducer() {
		return countryOfProducer;
	}

	public void setCountryOfProducer(String countryOfProducer) {
		this.countryOfProducer = countryOfProducer;
	}

	public String getSort() {
		return color;
	}

	public void setSort(String sort) {
		this.color = sort;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(countryOfProducer, color);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruits other = (Fruits) obj;
		return Objects.equals(countryOfProducer, other.countryOfProducer) && Objects.equals(color, other.color);
	}

	@Override
	public String toString() {
		return "Name of product: " + name + ", price: " + price + ", quantity: " + quantity
				+ ", country of producer: " + countryOfProducer + ", color: " + color;
	}
}
