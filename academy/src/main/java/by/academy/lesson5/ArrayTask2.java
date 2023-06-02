package by.academy.lesson5;

import java.util.Arrays;

public class ArrayTask2 {

	public static void main(String[] args) {
		String[][] array = new String[3][6];
		char c = 'a';
		for (int i = 0; i < array.length; i++) {
			for (int g = 0; g < array[i].length; g++) {
				array[i][g] = "" + c + g;
			}
			c++;
		}
		System.out.println(Arrays.deepToString(array));
	}
}
