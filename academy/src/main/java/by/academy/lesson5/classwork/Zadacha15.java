package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha15 {

	public static void main(String[] args) {
		int[][] array = new int[8][5];
		Random rand = new Random();

		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[j].length; j++) {
				array[i][j] = rand.nextInt(199) - 99;
				if (array[i][j] >= max) {
					max = array[i][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(array));
		System.out.println(max);
	}

}
