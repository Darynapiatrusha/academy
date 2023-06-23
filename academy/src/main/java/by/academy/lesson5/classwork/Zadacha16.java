package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha16 {

	public static void main(String[] args) {
		int[][] array = new int[7][4];
		Random rand = new Random();

		int max;
		int[] maximum = new int[7];
		for (int i = 0; i < array.length; i++) {
			max = 1;
			for (int j = 0; j < array[j].length; j++) {
				array[i][j] = rand.nextInt(11) - 5;
				max *= array[i][j];
			}
			if (max < 0) {
				max *= -1;
				maximum[i] = max;
			} else {
				maximum[i] = max;
			}
		}
		max = maximum[0];
		int maxi = 0;
		for (int i = 0; i < maximum.length; i++) {
			if (maximum[i] > max) {
				max = maximum[i];
				maxi = i;
			}
		}
		System.out.println(Arrays.deepToString(array));
		System.out.println(Arrays.toString(maximum));
		System.out.println(maxi);
	}
}
