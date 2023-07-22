package by.academy.homework5.Task3;

public class IteratorDemo {

	public static void main(String[] args) {
		String[][] array = { { "Vasya", "Petya", "Nikita", "Darina" },
				{ "Vasya1", "Petya1", "Nikita1", "Darina1", "Vasya1", "Petya1", "Nikita1", "Darina1" } };

		IteratorCustom<String> itetator = new IteratorCustom<>(array);

		while (itetator.hasNext()) {
			System.out.println(itetator.next());
		}

		System.out.println();

		Integer[][] array2 = { { 1, 5, 5, 7, 8 }, { 9, 59, 545, 778, 879, 5, 565, 556, 5 } };
		IteratorCustom<Integer> itetator2 = new IteratorCustom<>(array2);

		while (itetator2.hasNext()) {
			System.out.println(itetator2.next());
		}
	}

}
