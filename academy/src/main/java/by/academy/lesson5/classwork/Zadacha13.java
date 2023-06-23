package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadacha13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int n;
		for (;;) {
			System.out.println("Введите натуральное число больше 3");
			n = sc.nextInt();
			if (n <= 3) {
				System.out.println("Не подходящие число! Попробуйте еще раз!");
			} else {
				int[] array = new int[n];
				int even = 0;
				for (int i = 0; i < array.length; i++) {
					array[i] = random.nextInt(n + 1);
					if (array[i] % 2 == 0 && array[i] != 0) {
						even++;
					}
				}
				System.out.println(Arrays.toString(array));
				if (even > 0) {
					int[] secondArray = new int[even];
					for (int i = 0, b = 0; i < array.length; i++) {
						if (array[i] % 2 == 0 && array[i] != 0) {
							secondArray[b] = array[i];
							b++;
						}
					}
					System.out.println(Arrays.toString(secondArray));
				}

				break;
			}
		}
	}

}
