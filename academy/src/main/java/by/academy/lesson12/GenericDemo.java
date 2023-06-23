package by.academy.lesson12;

public class GenericDemo {

	public static void main(String[] args) {
		Generic<String, Cat, Long> Gen = new Generic<>("T", new Cat("FF"), 16515L);

		Gen.printNameOfClasses();
	}
}
