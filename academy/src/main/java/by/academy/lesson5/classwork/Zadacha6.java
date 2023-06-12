package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha6 {

	public static void main(String[] args) {
		int min = 10;
		int max = 99;

		Random random = new Random();
		int[] array = new int[4];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(max - min + 1) + min;
		}
		System.out.println(Arrays.toString(array));

		boolean flag = true;
		for (int i = 1; i < array.length; i++) {
			if (array[i] <= array[i - 1]) {
				flag = false;
				break;
			}
		}
		if(flag){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
	}
}
