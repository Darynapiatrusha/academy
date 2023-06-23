package by.academy.homework3.deal;

import java.util.Objects;

public class User {
	protected String name;
	protected int age;
	protected double money;
	private String dateOfBirth;
	private String phoneNumber;
	private String emailAddress;
	DateOfBirthCheck dateOfBirthCheck = new DateOfBirthCheck();
	BelarusianPhoneValidator belarusianPhoneValidator = new BelarusianPhoneValidator();
	EmailValidator emailValidator = new EmailValidator();

	public User() {
		super();
	}

	public User(String name, int age, double money) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
	}

	public User(String name, int age, double money, String dateOfBirth, String phoneNumber, String emailAddress) {
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

	public void setDateOfBirth(String dateOfBirth) {
		if (dateOfBirthCheck.isValid(dateOfBirth) == true) {
			this.dateOfBirth = dateOfBirth;
		} else {
			System.out.println("Неправильный формат даты, укажите дату в формате dd/MM/yyyy или dd-MM-yyyy");
		}
	}

	public void setPhoneNumber(String phoneNumber) {
		if (belarusianPhoneValidator.isValid(phoneNumber) == true) {
			this.phoneNumber = phoneNumber;
		} else {
			System.out.println("Неправильный формат номера телефона, укажите номер в формате +375ххххххххх");
		}
	}

	public void setEmailAddress(String emailAddress) {
		if (emailValidator.isValid(emailAddress) == true) {
			this.emailAddress = emailAddress;
		} else {
			System.out.println("Неправильный формат email, укажите правильный адрес");
		}
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
		return "Имя: " + name + ", возраст: " + age + ", количество денег: " + money + ", дата рождения: " + dateOfBirth
				+ ", номер телефона: " + phoneNumber + ", email: " + emailAddress + "]";
	}
}
