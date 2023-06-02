package by.academy.lesson4.classwoork;

public class Task5 {

	public static void main(String[] args) {
		int i = 1;
		int result;
		do {
			result = i % 5;
			if (result == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 100);
	}
}
