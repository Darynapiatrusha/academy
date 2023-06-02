package by.academy.lesson4.classwoork;

public class Task8 {

	public static void main(String[] args) {
		int n = (int) (Math.random() * 10);
		System.out.println(n);

		int result = 1;
		for (int i = 1; i <= n; i++) {
			if (n == 0) {
				System.out.println("n! = 1");
			}
			result *= i;
		}
		System.out.println("n! = " + result);
	}
}
