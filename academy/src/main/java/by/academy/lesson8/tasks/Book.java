package by.academy.lesson8.tasks;

import java.util.Objects;

public class Book {
	String nameOfBook;
	String authorOfBook;

	public Book() {
		super();
	}
	
	public Book(String nameOfBook) {
		super();
		this.nameOfBook = nameOfBook;
	}
	
	public Book(String nameOfBook, String authorOfBook) {
		super();
		this.nameOfBook = nameOfBook;
		this.authorOfBook = authorOfBook;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public String getAuthorOfBook() {
		return authorOfBook;
	}

	public void setAuthorOfBook(String authorOfBook) {
		this.authorOfBook = authorOfBook;
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorOfBook, nameOfBook);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorOfBook, other.authorOfBook) && Objects.equals(nameOfBook, other.nameOfBook);
	}

	@Override
	public String toString() {
		return nameOfBook;
	}
}
