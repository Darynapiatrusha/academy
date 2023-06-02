package by.academy.lesson5;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		int[] array = new int[10];

		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
	}
}
