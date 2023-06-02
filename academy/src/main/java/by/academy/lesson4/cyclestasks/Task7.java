package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Введите пару чисел");
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a > b) {
				System.out.println(a + " большее число");
			} else if (b > a) {
				System.out.println(b + " большее число");
			} else {
				System.out.println("числа равны между собой");
			}
		}
		sc.close();
	}

}
