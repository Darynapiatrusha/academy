package by.academy.kr.Task3;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOfIterators<T> implements Iterator<T> {
	private ArrayList<T> array;
	private int index;
	
	public IteratorOfIterators() {
		super();
	}
	
	public IteratorOfIterators(ArrayList<T> array) {
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
