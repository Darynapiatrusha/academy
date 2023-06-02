package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое число");
		int n = sc.nextInt();

		sc.close();
		int result = 0;

		for (int i = 1; i <= n; i++) {
			result += i * i;
		}
		System.out.println(result);
	}

}
