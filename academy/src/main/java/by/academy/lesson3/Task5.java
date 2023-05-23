package by.academy.lesson3;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число");
		int a = sc.nextInt();

		System.out.println("Введите второе число");
		int b = sc.nextInt();

		sc.close();

		int[] numbers = { a, b };
		double result = 0;

		for (double d : numbers) {
			result += d;
		}
		if (a > b) {
			System.out.println(
					a + " большее число, " + b + " меньшее число," + " cреднее арифметическое: " + result / numbers.length);
		} else {
			System.out.println(
					b + " большее число, " + a + " меньшее число," + " cреднее арифметическое: " + result / numbers.length);
		}
	}

}
