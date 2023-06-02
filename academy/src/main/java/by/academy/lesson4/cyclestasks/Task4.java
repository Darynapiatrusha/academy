package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество n");
		int n = sc.nextInt();
		int number;
		int positive = 0;
		int negative = 0;
		int zero = 0;

		for (int i = 1; i <= n; i++) {
			System.out.println("Введите число");
			number = sc.nextInt();
			if (number == 0) {
				zero++;
			} else if (number < 0) {
				negative++;
			} else {
				positive++;
			}
		}
		sc.close();

		System.out.println(zero + " " + negative + " " + positive);
	}
}
