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
//		for (int i = 0; i < 10; i++) {
//			str.add("hello " + i);
//		}

		ArrayList<String> str2 = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			str2.add("alalal " + i);
		}

		Iterator<Integer> itetator1 = petrov.iterator();
		Iterator<Integer> itetator2 = sidorov.iterator();
		Iterator<String> itetator3 = str.iterator();
		Iterator<String> itetator4 = str2.iterator();

		Iterator[] arrayOfIterators = { itetator1, itetator2, itetator3, itetator4 };

		@SuppressWarnings("unchecked")
		IteratorOfIterators<Iterator> mainIterator = new IteratorOfIterators<>(arrayOfIterators);

		while (mainIterator.hasNext()) {
			System.out.println(mainIterator.next());
		}
	}
}
