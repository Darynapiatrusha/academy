package by.academy.lesson5;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(array));

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				if (array[0] < array[i]) {
					int temp = array[i];
					array[i] = array[0];
					array[0] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
