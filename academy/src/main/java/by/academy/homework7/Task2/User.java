package by.academy.homework7.Task2;

import java.time.LocalDate;
import java.util.Objects;

public class User extends Person {
	private String login;
	private String password;
	private String email;

	public User() {
		super();
	}

	public User(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public User(String login, String password, String email, String firstName, String lastName, int age, int year,
			int month, int day) {
		super(firstName, lastName, age, year, month, day);
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public void printUserInfo() {
		System.out.println("User info: login - " + login + ", password -  " + password + ", email - " + email
				+ ", last name - " + getLastName() + ", first name - " + getFirstName() + ", age - " + getAge()
				+ ", date of birth -  " + getDateOfBirth());
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(email, login, password);
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
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(login, other.login)
				&& Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", email=" + email +  ", last name - " + getLastName() + ", first name - " + getFirstName() + ", age - " + getAge()
		+ ", date of birth -  " + getDateOfBirth();
	}
}
