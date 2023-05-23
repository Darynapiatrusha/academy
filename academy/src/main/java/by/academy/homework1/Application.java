package by.academy.homework1;

import java.math.BigDecimal;

public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.nickname = "петр";
		cat1.money = new BigDecimal("125.5");
		cat1.initials = 'T';
		System.out.println(cat1);
		Cat cat2 = new Cat("Oskar");
		System.out.println(cat2);

		cat2.eat();

		cat2.sleep();

		cat2.walk();

		cat1.grow();
		cat1.grow();
		cat1.grow();
		System.out.println(cat1.age);
	}
}
