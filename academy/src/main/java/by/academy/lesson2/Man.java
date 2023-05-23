package by.academy.lesson2;

public class Man {

	String name;
	String hairColor;
	String passpotrNumber;

	int age;
	double weight;
	double height;

	public void grow() {
		age = age + 1;
	}

	@Override
	public String toString() {
		return "Name: " + name + " hair color: " + hairColor + ", passport number " + passpotrNumber + " age: " + age;
	}

}
