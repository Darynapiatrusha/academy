package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество учеников в классе");
		int n = sc.nextInt();
		double result = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Введите рост ученика");
			double height = sc.nextDouble();
			result += height;
		}

		sc.close();

		System.out.println(result / n);
	}

}
