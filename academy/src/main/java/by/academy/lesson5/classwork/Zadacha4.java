package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha4 {

	public static void main(String[] args) {
		int min = 1;
		int max = 10;

		Random random = new Random();
		int[] array = new int[8];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(max - min + 1) + min;
		}
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				array[i] = 0;
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
