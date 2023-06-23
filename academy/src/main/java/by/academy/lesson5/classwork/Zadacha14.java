package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha14 {

	public static void main(String[] args) {
		int[][] array = new int[8][5];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[j].length; j++) {
				array[i][j] = rand.nextInt(90) + 10;
			}
		}
		System.out.println(Arrays.deepToString(array));
	}
}
