package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;

public class Zadacha5 {

	public static void main(String[] args) {
		int[] firstArray = new int[5];
		int[] secondArray = new int[5];

		Random rand = new Random();
		int firstSum = 0;
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = rand.nextInt(5);
			firstSum += firstArray[i];
		}
		int secondSum = 0;
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = rand.nextInt(5);
			secondSum += secondArray[i];
		}
		System.out.println(Arrays.toString(firstArray));
		System.out.println(Arrays.toString(secondArray));
		
		if ((firstSum / firstArray.length) > (secondSum / secondArray.length)) {
			System.out.println("Среднее арифметическое первого массива больше, чем второго");
		} else if ((secondSum / secondArray.length) > (firstSum / firstArray.length)) {
			System.out.println("Среднее арифметическое второго массива больше, чем первого");
		} else {
			System.out.println("Среднее арифметическое первого массива равно среднему арифметическому второго массива");
		}

	}
}
