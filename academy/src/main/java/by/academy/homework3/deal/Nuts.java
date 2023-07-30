package by.academy.homework3.deal;

import java.io.Serializable;
import java.util.Objects;

import by.academy.lesson15.Producer;

@Producer(age = 0, country = { "" }, name = "Nuts")
public class Nuts extends Product implements Serializable {
	private static final long serialVersionUID = 1L;
	private String countryOfProducer;
	private String varieties;

	public Nuts() {
		super();
	}

	public Nuts(String name, double price, double quantity) {
		super(name, price, quantity);
	}

	public Nuts(String name, double price, double quantity, String countryOfProducer, String varieties) {
		super(name, price, quantity);
		this.countryOfProducer = countryOfProducer;
		this.varieties = varieties;
	}

	@Override
	protected double discount() {
		if (countryOfProducer == "China" && varieties == "salted") {
			return 0.7;
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
		return varieties;
	}

	public void setSort(String sort) {
		this.varieties = sort;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(countryOfProducer, varieties);
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
		Nuts other = (Nuts) obj;
		return Objects.equals(countryOfProducer, other.countryOfProducer) && varieties == other.varieties;
	}

	@Override
	public String toString() {
		return "Name of product: " + name + ", price: " + price + ", quantity: " + quantity + ", country of producer: "
				+ countryOfProducer + ", varieties: " + varieties;
	}
}
