package by.academy.lesson8.tasks;

import java.util.Arrays;
import java.util.Objects;

//4.	Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
//Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги).
//Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
// Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".

public class Reader {
	private String fullName;
	private int numberOfReaderTicket;
	private String faculty;
	private String dateOfBirth;
	private String phoneNumber;

	public Reader() {
		super();
	}

	public Reader(String fullName, int numberOfReaderTicket, String faculty, String dateOfBirth, String phoneNumber) {
		super();
		this.fullName = fullName;
		this.numberOfReaderTicket = numberOfReaderTicket;
		this.faculty = faculty;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

	protected void takeBook(int quantity) {
		System.out.println(fullName + " взял " + quantity + " книг/книги");
	}

	protected void takeBook(String[] nameOfBook) {
		System.out.println(fullName + " взял " + Arrays.toString(nameOfBook));
	}

	protected void takeBook(Book[] books) {
		System.out.println(fullName + " взял книги: " + Arrays.toString(books));
	}

	protected void returnBook(int quantity) {
		System.out.println(fullName + " взял " + quantity + " книг/книги");
	}

	protected void returnBook(String[] nameOfBook) {
		System.out.println(fullName + " взял " + Arrays.toString(nameOfBook));
	}

	protected void returnBook(Book[] books) {
		System.out.println(fullName + " взял книги: " + Arrays.toString(books));
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getNumberOfReaderTicket() {
		return numberOfReaderTicket;
	}

	public void setNumberOfReaderTicket(int numberOfReaderTicket) {
		this.numberOfReaderTicket = numberOfReaderTicket;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, faculty, fullName, numberOfReaderTicket, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reader other = (Reader) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(faculty, other.faculty)
				&& Objects.equals(fullName, other.fullName) && numberOfReaderTicket == other.numberOfReaderTicket
				&& Objects.equals(phoneNumber, other.phoneNumber);
	}

	@Override
	public String toString() {
		return "Reader [fullName=" + fullName + ", numberOfReaderTicket=" + numberOfReaderTicket + ", faculty="
				+ faculty + ", dateOfBirth=" + dateOfBirth + ", phoneNumber=" + phoneNumber + "]";
	}
}
