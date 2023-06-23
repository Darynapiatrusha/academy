package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha12 {

	public static void main(String[] args) {
		int[] array = new int[12];
		int positive = 0;
		int negative = 0;

		Random rand = new Random();

		do {
			for (int i = 0; i < array.length; i++) {
				array[i] = rand.nextInt(21) - 10;
				if (array[i] > 0) {
					positive++;
				}
				if (array[i] < 0) {
					negative++;
				}
				if (array[i] == 0) {
					i--;
				}
				if (i == array.length - 1 && positive != array.length / 2) {
					positive = 0;
					negative = 0;
				}
			}
		} while (positive != array.length / 2 && negative != array.length / 2);

		System.out.println(Arrays.toString(array));
	}
}
