package by.academy.homework5.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class RemoveDublicates {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Барсик");
		arrayList.add("Оскар");
		arrayList.add("Василек");
		arrayList.add("Барсик");
		arrayList.add("Барсик");
		arrayList.add("Рыжик");
		arrayList.add("Оскар");

		System.out.println(arrayList);

		System.out.println();
		System.out.println(removeDublicates(arrayList));

		ArrayList<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(5);
		arrayList2.add(1);
		arrayList2.add(5);
		arrayList2.add(5);

		System.out.println(arrayList2);

		System.out.println();
		System.out.println(removeDublicates(arrayList2));
	}

	public static <T> Collection<T> removeDublicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}
}
