package by.academy.lesson4.cyclestasks;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите сумму вклада");
		BigDecimal sum = sc.nextBigDecimal();

		System.out.println("Введите срок вклада");
		int age = sc.nextInt();

		sc.close();
		BigDecimal percent = new BigDecimal("1.03");
		BigDecimal result = sum;

		for (int i = 1; i <= age; i++) {
			result = result.multiply(percent);
		}
		System.out.println(result);
	}
}
