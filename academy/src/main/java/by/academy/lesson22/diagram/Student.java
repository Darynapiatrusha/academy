package by.academy.lesson22.diagram;

import java.util.Objects;

public class Student {
	private String Name;
	private String Address;
	private String email;
	private Integer number;
	private float averagePerformance;

	public Student() {
		super();
	}

	public Student(String name, String address, String email, Integer number, float averagePerformance) {
		super();
		Name = name;
		Address = address;
		this.email = email;
		this.number = number;
		this.averagePerformance = averagePerformance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public float getAveragePerformance() {
		return averagePerformance;
	}

	public void setAveragePerformance(float averagePerformance) {
		this.averagePerformance = averagePerformance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Address, Name, averagePerformance, email, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(Name, other.Name)
				&& Float.floatToIntBits(averagePerformance) == Float.floatToIntBits(other.averagePerformance)
				&& Objects.equals(email, other.email) && Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Address=" + Address + ", email=" + email + ", number=" + number
				+ ", averagePerformance=" + averagePerformance + "]";
	}
}
