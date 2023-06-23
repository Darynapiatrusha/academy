package by.academy.lesson9;

public class Person {
	protected String fullName;
	protected int age;
	
	protected void move() {
		System.out.println(fullName + " двигается");
	}
	public void talk() {
		System.out.println(fullName + " говорит");
	}
	public Person() {
		super();
	}
	public Person(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}
}
