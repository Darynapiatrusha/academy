package by.academy.kr.Task3;

import java.util.Iterator;

public class IteratorOfIterators<T> implements Iterator<T> {
	private Iterator<T>[] arrayOfIterators;
	private int index;

	public IteratorOfIterators(Iterator<T>[] arrayOfIterators) {
		super();
		this.arrayOfIterators = arrayOfIterators;
	}

	@Override
	public boolean hasNext() {
		for (int i = 0; i < arrayOfIterators.length; i++) {
			if (index + i < arrayOfIterators.length && arrayOfIterators[index + i].hasNext()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T next() {
		if (arrayOfIterators[index].hasNext() || arrayOfIterators[++index].hasNext()) {
			return arrayOfIterators[index].next();
		} else {
			return null;
		}
	}
}
