package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число a");
		int a = sc.nextInt();

		System.out.println("Введите число n");
		int n = sc.nextInt();

		sc.close();

		int result = a;
		int sum = 0;
		for (int i = 1; i <= (n - 1); i++) {
			sum = a + i;
			result *= sum;
		}
		System.out.println(result);
	}

}
