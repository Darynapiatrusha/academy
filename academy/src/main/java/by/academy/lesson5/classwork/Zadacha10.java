package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha10 {

	public static void main(String[] args) {
		int[] array = new int[10];

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(3) - 1;
		}
		System.out.println(Arrays.toString(array));

		int minusOne = 0;
		int zero = 0;
		int one = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				zero++;
			} else if (array[i] == -1) {
				minusOne++;
			} else {
				one++;
			}
		}
		if (minusOne > zero && minusOne > one) {
			System.out.println("-1 встречается в массиве чаще, чем все остальные");
		}
		if (zero > minusOne && zero > one) {
			System.out.println("0 встречается в массиве чаще, чем все остальные");
		}
		if (one > minusOne && one > zero) {
			System.out.println("1 встречается в массиве чаще, чем все остальные");
		}
	}

}
