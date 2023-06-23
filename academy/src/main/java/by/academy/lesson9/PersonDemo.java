package by.academy.lesson9;

public class PersonDemo {

	public static void main(String[] args) {
		Person first = new Person();
		Person second = new Person("Виталий", 18);

		first.move();
		first.talk();
		second.move();
		second.talk();
	}
}
