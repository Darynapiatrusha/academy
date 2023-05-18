package by.academy.lesson2;

public class CatDemo {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		System.out.println(cat1);
		Cat cat2 = new Cat("Васька", "Cерый", 8.0, 7);
		System.out.println(cat2);

		cat2.sleep();

		cat2.eat();
		System.out.println(cat2);

		cat2.walk();
		System.out.println(cat2);
	}
}
