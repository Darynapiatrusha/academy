package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha3 {

	public static void main(String[] args) {
		int[] array = new int[15];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(9);

		}
		System.out.println(Arrays.toString(array));
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i] !=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
