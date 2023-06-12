package by.academy.lesson4.cyclestasks;

public class Task24 {

	public static void main(String[] args) {
		long result = 1L;
		int sum = 1;
		for (int i = 2; i <= 10; i++) {
			sum += i;
			result *=sum;
		}
		System.out.println(result);
	}

}
