package by.academy.lesson9.company.details;

import java.util.Objects;

public class Engine {
	protected int power;
	protected String company;

	public Engine() {
		super();
	}

	public Engine(int power, String company) {
		super();
		this.power = power;
		this.company = company;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, power);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return Objects.equals(company, other.company) && power == other.power;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", company=" + company + "]";
	}

}
