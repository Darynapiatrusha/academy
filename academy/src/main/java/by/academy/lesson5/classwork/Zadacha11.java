package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random rand = new Random();

		for (;;) {
			System.out.println("Введите четное положительное число");
			int n = sc.nextInt();
			int[] array = new int[n];
			if (n % 2 != 0) {
				System.out.println("Ошибка! Необходимо ввести чётное положительное число");
			} else {
				sc.close();
				for (int i = 0; i < array.length; i++) {
					array[i] = rand.nextInt(11) - 5;
				}
				System.out.println(Arrays.toString(array));
				int sum1 = 0;
				int sum2 = 0;
				for (int i = 0; i < array.length / 2; i++) {
					if (array[i] < 0) {
						array[i] *= -1;
						sum1 += array[i];
					} else {
						sum1 += array[i];
					}

				}
				for (int i = array.length / 2; i < array.length; i++) {
					if (array[i] < 0) {
						array[i] *= -1;
						sum2 += array[i];
					} else {
						sum2 += array[i];
					}

				}
				if (sum1 > sum2) {
					System.out.println("Сумма левой половины массива больше");
				} else if (sum2 > sum1) {
					System.out.println("Сумма правой половины массива больше");
				} else {
					System.out.println("Суммs равны");
				}
				break;
			}
		}
	}
}