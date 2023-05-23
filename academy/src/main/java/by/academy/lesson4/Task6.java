package by.academy.lesson4;

public class Task6 {

	public static void main(String[] args) {
		int result = 0;
		int tries = 0;
		for (int i = 100; i <= 10000; i++) {
			if (i % 7 == 0) {
				result += i;
				tries++;
				System.out.println(result);
				if (tries == 3) {
					break;
				}
			}
		}
		System.out.println(result);
	}

}
