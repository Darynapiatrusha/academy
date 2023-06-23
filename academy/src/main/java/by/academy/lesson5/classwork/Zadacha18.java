package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha18 {

	public static void main(String[] args) {
		int[][] array = new int[15][3];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(8) + 2;
				if (j == array[i].length - 1) {
					array[i][j] = array[i][j - 2] * array[i][j - 1];
					for (int q = 0; q < i; q++) {
						if (array[i][j] == array[q][j] && i > 0) {
							if (array[i][j - 1] == array[q][j - 1] || array[i][j - 2] == array[q][j - 2])
								--i;
						}
					}
				}
			}
		}
		for(int i = 0; i<array.length; i++) {
			System.out.println("Пример №" + (i + 1) + ": " + array[i][0] + " * " + array[i][1] + " = ");
		}
	}
}
