package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите натуральное число");
		double n = sc.nextInt();

		sc.close();

		double result = 0;
		for (double i = 1; i <= n; i++) {
			result += (1 / i);
		}
		System.out.println(result);
	}
}
