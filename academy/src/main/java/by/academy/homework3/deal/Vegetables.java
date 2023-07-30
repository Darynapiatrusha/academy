package by.academy.homework3.deal;

import java.util.Objects;

import by.academy.lesson15.Producer;

@Producer(age = 0, country = { "" }, name = "Vegetables")
public class Vegetables extends Product {
	protected String countryOfProducer;
	protected String sort;

	public Vegetables() {
		super();
	}

	public Vegetables(String name, double price, double quantity) {
		super(name, price, quantity);
	}

	public Vegetables(String name, double price, double quantity, String countryOfProducer, String sort) {
		super(name, price, quantity);
		this.countryOfProducer = countryOfProducer;
		this.sort = sort;
	}

	protected double discount() {
		if (quantity > 5 && countryOfProducer == "Бelarus") {
			return 0.85;
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
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(countryOfProducer, sort);
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
		Vegetables other = (Vegetables) obj;
		return Objects.equals(countryOfProducer, other.countryOfProducer) && Objects.equals(sort, other.sort);
	}

	@Override
	public String toString() {
		return "Name of product: " + name + ", price: " + price + ", quantity: " + quantity + ", country of producer: "
				+ countryOfProducer + ", sort: " + sort;
	}
}
