package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество сенокосилок");
		int n = sc.nextInt();
		sc.close();
		int m = 60;
		double result = 0;
		for (int i = 0; i < n; i++) {
			result += m;
			m = m + 10;
		}
		System.out.println("Бригада работала " + result / 60 + " часа");
	}

}
