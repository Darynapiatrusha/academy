package by.academy.lesson12;

import java.io.Serializable;

public class Generic<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {
	private T first;
	private V second;
	private K third;

	public Generic(T first, V second, K third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public T getFirst() {
		return first;
	}

	public V getSecond() {
		return second;
	}

	public K getThird() {
		return third;
	}

	public void printNameOfClasses() {
		System.out.println(first.getClass());
		System.out.println(second.getClass());
		System.out.println(third.getClass());
	}

	@Override
	public String toString() {
		return "Generic [first=" + first + ", second=" + second + ", third=" + third + "]";
	}
}
