package by.academy.homework3.deal;

import java.util.Objects;

public class Fruits extends Product {
	private String countryOfProducer;
	private String sort;

	public Fruits() {
		super();
	}

	public Fruits(String name, double price, double quantity) {
		super(name, price, quantity);
	}

	public Fruits(String name, double price, double quantity, String countryOfProducer, String sort) {
		super(name, price, quantity);
		this.countryOfProducer = countryOfProducer;
		this.sort = sort;
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
		Fruits other = (Fruits) obj;
		return Objects.equals(countryOfProducer, other.countryOfProducer) && Objects.equals(sort, other.sort);
	}

	@Override
	public String toString() {
		return "Наименование продукта: " + name + " цена продукта: " + price + " количество продукта: " + quantity
				+ " страна поставщик: " + countryOfProducer + " сорт продукта: " + sort;
	}
}
