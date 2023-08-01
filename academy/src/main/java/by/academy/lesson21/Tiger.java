package by.academy.lesson21;

public class Tiger extends Cat {
	public String name;
	protected int age;
	private double weight;
	
	public Tiger(String species, String color, double height, String name, int age, double weight) {
		super(species, color, height);
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	private double getWeight() {
		return weight;
	}
	private void setWeight(double weight) {
		this.weight = weight;
	}
}
