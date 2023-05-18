package by.academy.lesson2;

public class Cat {

	String nikname;
	String color;
	String breed;
	double weight;
	int age;
	

	public Cat() {
		super();
	}

	public Cat(String nikname, String color, double weight, int age) {
		super();
		this.nikname = nikname;
		this.color = color;
		this.weight = weight;
		this.age = age;
	}

	public void sleep() {
		System.out.println(nikname + " спит");
	}

	public void eat() {
		weight = weight + 1;
		System.out.println(nikname + " ест , вес теперь " + weight);
	}

	public void walk() {
		weight = weight - 1;
		System.out.println(nikname + " гуляет , вес теперь " + weight);
	}

	@Override
	public String toString() {
		return "Nikname: " + nikname + " color: " + color + " weight: " + weight + " age: " + age;
	}
}
