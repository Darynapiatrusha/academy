package by.academy.lesson5;

import java.util.Arrays;

import java.util.Random;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		int[] array = new int[10];

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
		System.out.println(Arrays.toString(array));

		int[] array2 = new int[10];

		for (int j = 0; j < array.length; j++) {
			array2[j] = array[j];
		}
		System.out.println(Arrays.toString(array2));

		array[0] = -1;
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));

		int[] array3 = new int[10];
		System.arraycopy(array2, 0, array3, 0, array.length);

		System.out.println(Arrays.toString(array3));
	}
}
