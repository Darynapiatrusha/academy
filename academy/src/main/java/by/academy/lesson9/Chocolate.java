package by.academy.lesson9;

import java.util.Objects;

public class Chocolate {
	String producer;
	boolean isBlack;

	public Chocolate() {
		super();
	}

	public Chocolate(String producer, boolean isBlack) {
		super();
		this.producer = producer;
		this.isBlack = isBlack;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public boolean isBlack() {
		return isBlack;
	}

	public void setBlack(boolean isBlack) {
		this.isBlack = isBlack;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isBlack, producer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		return isBlack == other.isBlack && Objects.equals(producer, other.producer);
	}

	@Override
	public String toString() {
		return "Chocolate [producer=" + producer + ", isBlack=" + isBlack + "]";
	}
}
