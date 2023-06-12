package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha8 {

	public static void main(String[] args) {
		int min = -15;
		int max = 15;

		Random random = new Random();
		int[] array = new int[12];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(max - min + 1) + min;
		}
		System.out.println(Arrays.toString(array));
		int maximum = array[0];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= maximum) {
				maximum = array[i];
				index = i;
			}
		}
		System.out.println(index);
	}

}
