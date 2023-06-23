package by.academy.lesson9;

import java.util.Objects;

public class Smartphone extends Product {
	String model;
	double version;

	public Smartphone() {
		super();
	}

	public Smartphone(String name, double price, double quantity) {
		super(name, price, quantity);
	}

	public Smartphone(String model, double version) {
		super();
		this.model = model;
		this.version = version;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(model, version);
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
		Smartphone other = (Smartphone) obj;
		return Objects.equals(model, other.model)
				&& Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}

	@Override
	public String toString() {
		return "Smartphone [model=" + model + ", version=" + version + "]";
	}

}
