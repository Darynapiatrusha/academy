package by.academy.lesson4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число");
		int n = sc.nextInt();

		sc.close();

		int result = 0;

		for (int i = 1; i <= n; i++) {
			result = result + i;
		}
		System.out.println(result);
	}
}
