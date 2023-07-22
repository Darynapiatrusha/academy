package by.academy.homework5.Task3;

import java.util.Iterator;

public class IteratorCustom<T> implements Iterator<T> {
	private T[][] array;
	private int i;
	private int j;

	public IteratorCustom() {
		super();
	}

	public IteratorCustom(T[][] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		for (int i = this.i; i < array.length; i++) {
			for (int j = this.j; j < array[i].length;) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T next() {
		T arrayT = array[i][j];
		j++;
		for (int i = this.i; i < array.length; i++) {
			for (int j = (i == this.i ? this.j : 0); j < array[i].length;) {
				this.i = i;
				this.j = j;
				return arrayT;
			}
		}
		return arrayT;
	}
}
