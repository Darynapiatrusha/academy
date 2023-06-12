package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите четное положительное число");
		int n = sc.nextInt();

		sc.close();

		int[] array = new int[n];
		Random rand = new Random();
		for (;;) {
			if (n % 2 != 0) {
				System.out.println("Ошибка! Необходимо ввести чётное положительное число");
			} else {
				for (int i = 0; i < array.length; i++) {
					array[i] = rand.nextInt(11) - 5;
				}
				System.out.println(Arrays.toString(array));
			}
		}
	}

}
