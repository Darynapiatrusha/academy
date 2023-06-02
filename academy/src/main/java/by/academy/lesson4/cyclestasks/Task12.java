package by.academy.lesson4.cyclestasks;

public class Task12 {

	public static void main(String[] args) {
		int result = 1;
		for (int i = 10; i <= 99; i++) {
			if (i % 2 != 0 && i % 13 == 0) {
				result = result * i;
				System.out.println(i);
			}
		}
		System.out.println(result);
	}

}
