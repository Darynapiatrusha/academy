package by.academy.lesson4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число");
		int number = sc.nextInt();

		sc.close();

		if (number % 2 == 0)
			System.out.println("Число четное");
		else
			System.out.println("Число нечетное");
	}
}
