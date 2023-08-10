package by.academy.kr.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class IteratorDemo {

	public static <T> void main(String[] args) {
		ArrayList<Integer> petrov = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			petrov.add(rand.nextInt(9) + 1);
		}

		ArrayList<Integer> sidorov = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			sidorov.add(rand.nextInt(9) + 1);
		}

		ArrayList<String> str = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			str.add("hello " + i);
		}

		ArrayList<String> str2 = new ArrayList<>();
		for (int i = 10; i >= 0; i--) {
			str2.add("alalal " + i);
		}

		ArrayList<Iterator> iterators = new ArrayList<>();

		IteratorSimple<Integer> itetator1 = new IteratorSimple<>(petrov);
		IteratorSimple<Integer> itetator2 = new IteratorSimple<>(sidorov);
		IteratorSimple<String> itetator3 = new IteratorSimple<>(str);
		IteratorSimple<String> itetator4 = new IteratorSimple<>(str2);
		iterators.add(itetator1);
		iterators.add(itetator2);
		iterators.add(itetator3);
		iterators.add(itetator4);

		IteratorOfIterators<Iterator> mainIterator = new IteratorOfIterators<>(iterators);
		Iterator value;
		while (mainIterator.hasNext()) {
			value = mainIterator.next();
			System.out.println(value);
		}
	}
}
