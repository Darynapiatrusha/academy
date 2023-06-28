package by.academy.lesson8;

public class Person {
	private String fullName;
	private int age;

	public Person() {
		super();
	}

	public Person(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}

	public void move(String fullName) {
		System.out.println(fullName + " двигается");
	}

	public void talk(String fullName) {
		System.out.println(fullName + " говорит");
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", age=" + age + "]";
	}
}
