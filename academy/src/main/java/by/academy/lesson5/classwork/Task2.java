package by.academy.lesson5.classwork;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int[][] array = { { 1, 8, 10, 145, 85, 95, 85, 93 }, { 12, 15, 185, 96, 54, 63, 85, 85 },
				{ 12, 96, 45, 63, 254, 654, 95, 12 }, { 123, 54, 65, 85, 96, 54, 65, 125 },
				{ 254, 658, 45, 65, 12, 45, 63, 45 } };
		System.out.println(Arrays.deepToString(array));
		int[][] newArray = new int[5][2];
		int min = array[0][0];
		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			min = array[i][0];
			max = array[i][0];
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < min) {
					min = array[i][j];
				}
				newArray[i][0] = min;
				if (array[i][j] > max) {
					max = array[i][j];
				}
				newArray[i][1] = max;
			}
		}
		System.out.println(Arrays.deepToString(newArray));
	}
}
