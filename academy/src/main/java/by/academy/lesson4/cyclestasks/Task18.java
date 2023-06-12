package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите натуральное число");
		int n = sc.nextInt();
		sc.close();

		int number = 1;
		int result = 0;
		for (int i = 0; i < n; i++) {
			if (number < n && number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				result++;
			}
			number++;
		}
		System.out.println(result);
	}
}
