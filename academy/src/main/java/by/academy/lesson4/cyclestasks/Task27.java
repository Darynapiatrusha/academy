package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество денег");
		double m = sc.nextDouble();

		System.out.println("Введите стоимость мороженного");
		double k = sc.nextDouble();

		sc.close();

		int i = 0;
		while ((m - k) >= 0) {
			m -=k;
			i++;
			System.out.println(m);
		}
		System.out.println("Петя купил " + i + " пачек мороженого, у него осталось " + m + " рублей" );
	}

}
