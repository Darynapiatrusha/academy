package by.academy.lesson12;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	public Cat(String name) {
		super(name);
	}
}
