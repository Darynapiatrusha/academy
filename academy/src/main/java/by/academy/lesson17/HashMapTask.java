package by.academy.lesson17;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {

	public static void main(String[] args) {
		Map<String, Toy> toys = new HashMap<>();

		toys.put("jeep", new Toy("car", "blue"));
		toys.put("Masha", new Toy("doll", "green"));
		toys.put("Smallball", new Toy("ball", "yellow"));

		for (Map.Entry<String, Toy> entry : toys.entrySet()) {
			System.out.println(entry);
		}

		System.out.println();

		for (String key : toys.keySet()) {
			System.out.println(key);
		}

		System.out.println();

		for (Toy value : toys.values()) {
			System.out.println(value);
		}
	}
}
