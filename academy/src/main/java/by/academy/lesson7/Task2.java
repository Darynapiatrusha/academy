package by.academy.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число n");

		int n = sc.nextInt();

		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Введите строку");
			array[i] = sc.next();
		}
		sc.close();
		System.out.println(Arrays.toString(array));
	}

}
