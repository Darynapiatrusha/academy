package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите значение a");
		double a = sc.nextDouble();

		System.out.println("Введите значение степени b");
		double b = sc.nextDouble();

		sc.close();

		double result;
		result = Math.pow(a, b);
		System.out.println(result);
	}

}
