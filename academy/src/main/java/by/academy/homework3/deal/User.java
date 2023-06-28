package by.academy.homework3.deal;

import java.time.LocalDate;
import java.util.Objects;

public class User {
	protected String name;
	protected int age;
	protected double money;
	private LocalDate dateOfBirth;
	private String phoneNumber;
	private String emailAddress;

	public User() {
		super();
	}

	public User(String name, int age, double money) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
	}

	public User(String name, int age, double money, LocalDate dateOfBirth, String phoneNumber, String emailAddress) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dateOfBirth, emailAddress, money, name, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(emailAddress, other.emailAddress)
				&& Double.doubleToLongBits(money) == Double.doubleToLongBits(other.money)
				&& Objects.equals(name, other.name) && Objects.equals(phoneNumber, other.phoneNumber);
	}

	@Override
	public String toString() {
		return "Name " + name + ", age: " + age + ", money: " + money + ", date of birth " + dateOfBirth
				+ ", phone number: " + phoneNumber + ", email: " + emailAddress;
	}
}
