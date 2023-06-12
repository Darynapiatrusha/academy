package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Task0 {

	public static void main(String[] args) {
		int[] array = new int[5];
		Random random = new Random();

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(200);
			sum += array[i];
		}
		System.out.println("Массив: " + Arrays.toString(array));

		int result = sum / array.length;
		System.out.println("Среднее арифметическое: " + result);

		for (int i = 0; i < array.length; i++) {
			if (array[i] < result) {
				System.out.println(array[i]);
			}
		}
	}

}
