package by.academy.lesson17;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Double> marks = new HashMap<>();

		System.out.println(marks.isEmpty());
		marks.put("Petrov", 8.0);
		marks.put("Sidorov", 7.0);
		marks.put("Ivanov", 6.0);

		System.out.println(marks.isEmpty());
		System.out.println();

		if (marks.containsKey("Petrov")) {
			Double newValue = (marks.get("Petrov") + 6.0) / 2;
			System.out.println(newValue);
		}

		System.out.println();

		for (String key : marks.keySet()) {
			System.out.println(marks.get(key));
		}

		System.out.println();

		for (Double value : marks.values()) {
			System.out.println(value);
		}

		System.out.println();

	}
}
