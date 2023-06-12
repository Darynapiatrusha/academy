package by.academy.lesson4.cyclestasks;

public class Task19 {

	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if ((100 * i + j) % (i * j) == 0) {
					System.out.println("Подходящие двухзначные числа: " + i + " и " + j);
				}
			}
		}

	}
}
