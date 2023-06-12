package by.academy.lesson4.cyclestasks;

public class Task20 {

	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if ((100 * i + j) % 99 == 0 && (100 * j + i) % 49 == 0) {
					System.out.println("Число A: " + i + " число B: " + j);
				}
			}
		}
	}
}
