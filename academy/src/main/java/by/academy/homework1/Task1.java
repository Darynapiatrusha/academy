package by.academy.homework1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите сумму покупки");
		BigDecimal sum = sc.nextBigDecimal();

		System.out.println("Введите ваш возраст");
		int age = sc.nextInt();

		sc.close();

		BigDecimal sum1 = new BigDecimal("100");
		BigDecimal sum2 = new BigDecimal("200");
		BigDecimal sum3 = new BigDecimal("300");
		BigDecimal sum4 = new BigDecimal("400");

		int result1 = sum.compareTo(sum1); // сумму сравниваем с 100
		int result2 = sum.compareTo(sum2); // сумму сравниваем с 200
		int result3 = sum.compareTo(sum3);// сумму сравниваем с 300
		int result4 = sum.compareTo(sum4);// сумму сравниваем с 400

		BigDecimal percent1 = new BigDecimal("0.95");
		BigDecimal percent2 = new BigDecimal("0.93");
		BigDecimal percent3 = new BigDecimal("0.88");
		BigDecimal percent4 = new BigDecimal("0.85");
		BigDecimal percent5 = new BigDecimal("0.80");
		BigDecimal newPercent3 = new BigDecimal("0.84");
		BigDecimal percentNew3 = new BigDecimal("0.91");

		if (result1 == -1) {
			System.out.println("Ваша скидка 5%, финальная сумма: " + sum.multiply(percent1));
		}
		if (result1 >= 0 && result2 == -1) {
			System.out.println("Ваша скидка 7%, финальная сумма: " + sum.multiply(percent2));
		}
		if (result2 >= 0 && result3 == -1) {
			if (age > 18) {
				System.out.println("Ваша скидка 16%, финальная сумма: " + sum.multiply(newPercent3));
			} else
				System.out.println("Ваша скидка 9%, финальная сумма: " + sum.multiply(percentNew3));
		}
		if (result3 >= 0 && result4 == -1) {
			System.out.println("Ваша скидка 15%, финальная сумма: " + sum.multiply(percent4));
		}
		if (result4 >= 0) {
			System.out.println("Ваша скидка 20%, финальная сумма: " + sum.multiply(percent5));
		}
	}
}
