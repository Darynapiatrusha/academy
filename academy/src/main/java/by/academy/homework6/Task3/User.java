package by.academy.homework6.Task3;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

public class User implements Closeable, Serializable {
	private static final long serialVersionUID = 1L;
	private String Surname;
	private String Name;
	private String Patronymic;

	public User() {
		super();
	}

	public User(String surname, String name, String patronymic) {
		super();
		Surname = surname;
		Name = name;
		Patronymic = patronymic;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPatronymic() {
		return Patronymic;
	}

	public void setPatronymic(String patronymic) {
		Patronymic = patronymic;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Name, Patronymic, Surname);
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
		return Objects.equals(Name, other.Name) && Objects.equals(Patronymic, other.Patronymic)
				&& Objects.equals(Surname, other.Surname);
	}

	@Override
	public String toString() {
		return "User [Surname=" + Surname + ", Name=" + Name + ", Patronymic=" + Patronymic + "]";
	}

	@Override
	public void close() throws IOException {
	}
}
