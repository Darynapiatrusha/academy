package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha17 {

	public static void main(String[] args) {
		int[][] array = new int[6][7];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 7; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
		System.out.println(Arrays.deepToString(array));

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 7; j++) {
				if (array[i][0] < array[i][j]) {
					int temp = array[i][j];
					array[i][j] = array[i][0];
					array[i][0] = temp;
				}

			}
		}
		System.out.println(Arrays.deepToString(array));
	}

}