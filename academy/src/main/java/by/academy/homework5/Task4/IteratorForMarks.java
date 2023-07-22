package by.academy.homework5.Task4;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorForMarks<T> implements Iterator<T> {
	private ArrayList<T> array;
	private int index;

	public IteratorForMarks() {
		super();
	}

	public IteratorForMarks(ArrayList<T> array) {
		super();
		this.array = array;
	}


	@Override
	public boolean hasNext() {
		if (array == null || array.size() <= index) {
			return false;
		}
		return array.get(index) != null;
	}

	@Override
	public T next() {
		return array.get(index++);
	}
}
