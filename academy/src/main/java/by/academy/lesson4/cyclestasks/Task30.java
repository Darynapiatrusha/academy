package by.academy.lesson4.cyclestasks;

public class Task30 {

	public static void main(String[] args) {
		int n = 1;
		int result = 0;

		while (n <= 99) {
			if (n % 2 != 0) {
				result += n;
			}

			n++;
		}
		System.out.println(result);
	}

}
