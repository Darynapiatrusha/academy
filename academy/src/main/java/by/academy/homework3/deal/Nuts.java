package by.academy.homework3.deal;

import java.util.Objects;

public class Nuts extends Product {
	private String countryOfProducer;
	private String sort;

	public Nuts() {
		super();
	}

	public Nuts(String name, double price, double quantity) {
		super(name, price, quantity);
	}

	public Nuts(String name, double price, double quantity, String countryOfProducer, String sort) {
		super(name, price, quantity);
		this.countryOfProducer = countryOfProducer;
		this.sort = sort;
	}

	@Override
	protected double discount() {
		if (countryOfProducer == "Беларусь" && sort == "Соленые") {
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
		Nuts other = (Nuts) obj;
		return Objects.equals(countryOfProducer, other.countryOfProducer) && sort == other.sort;
	}

	@Override
	public String toString() {
		return "Наименование продукта: " + name + " цена продукта: " + price + " количество продукта: " + quantity
				+ " страна поставщик: " + countryOfProducer + " вид продукта: " + sort;
	}
}
