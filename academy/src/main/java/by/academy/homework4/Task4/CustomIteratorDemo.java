package by.academy.homework4.Task4;

public class CustomIteratorDemo {

	public static void main(String[] args) {
		String[] array = { "Vasya", "Petya", "Nikita", "Darina" };

		CustomIterator<String> itetator = new CustomIterator<>(array);

		while (itetator.hasNext()) {
			System.out.println(itetator.next());
		}

		System.out.println();

		Integer[] array2 = { 1, 5, 5, 7, 8 };

		CustomIterator<Integer> itetator2 = new CustomIterator<>(array2);

		while (itetator2.hasNext()) {
			System.out.println(itetator2.next());
		}
	}
}
