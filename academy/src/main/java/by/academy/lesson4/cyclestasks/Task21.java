package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите натуральное число");
		double n = sc.nextDouble();

		sc.close();

		double result = 0;
		for (double i = 2; i <= 2*n; i += 2) {
			result += (1 / (i * i));
		}
		System.out.println(result);
	}

}
