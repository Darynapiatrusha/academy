package by.academy.homework4.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array<T> {
	private T[] array;
	private int size;

	public Array() {
		super();
		array = (T[]) new Object[16];
		size = 0;
	}

	public Array(int n) {
		super();
		this.array = (T[]) new Object[n];
		size = 0;
	}

	public void add(T element) {
		if (size == array.length) {
			array = Arrays.copyOf(array, array.length * 2);
		}
		array[size++] = element;
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Такого элемента не существует");
		}
		return array[index];
	}

	public T getLast() {
		int newSize = size;
		return array[--newSize];
	}

	public T getFirst() {
		return array[0];
	}

	public void sizeOfArray() {
		System.out.println("Размер массива: " + array.length);
	}

	public void lastIndexOfArray() {
		int newSize = size;
		System.out.println("Индекс последнего заполненого элемента: " + (--newSize));
	}

	public T[] remove(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Такого элемента не существует");
		}
		List<T> list = new ArrayList<>(Arrays.asList(array));
		list.remove(index);

		array = (T[]) list.toArray(new Object[list.size()]);
		size--;
		return array;
	}

	public T[] removeObj(T object) {
		List<T> list = new ArrayList<>(Arrays.asList(array));
		list.remove(object);

		array = (T[]) list.toArray(new Object[list.size()]);
		size--;
		return array;
	}

	@Override
	public String toString() {
		return "Array [array=" + Arrays.toString(array) + ", size=" + size + "]";
	}
}
