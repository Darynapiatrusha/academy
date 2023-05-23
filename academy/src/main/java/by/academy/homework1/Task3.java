package by.academy.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число от 1 до 10");
		int number = sc.nextInt();
		
		sc.close();

		for (int i = 1; i < 11; i++) {
			switch (number) {
			case 1:
				System.out.print(number + " * " + i + " = " + number * i);
				System.out.println("");
				break;

			case 2:
				System.out.print(number + " * " + i + " = " + number * i);
				System.out.println("");
				break;

			case 3:
				System.out.print(number + " * " + i + " = " + number * i);
				System.out.println("");
				break;

			case 4:
				System.out.print(number + " * " + i + " = " + number * i);
				System.out.println("");
				break;

			case 5:
				System.out.print(number + " * " + i + " = " + number * i);
				System.out.println("");
				break;

			case 6:
				System.out.print(number + " * " + i + " = " + number * i);
				System.out.println("");
				break;

			case 7:
				System.out.print(number + " * " + i + " = " + number * i);
				System.out.println("");
				break;

			case 8:
				System.out.print(number + " * " + i + " = " + number * i);
				System.out.println("");
				break;

			case 9:
				System.out.print(number + " * " + i + " = " + number * i);
				System.out.println("");
				break;

			case 10:
				System.out.print(number + " * " + i + " = " + number * i);
				System.out.println("");
				break;

			default:
				System.out.print("Число не попадает в диапозон от 1 до 10");
			}
		}

	}

}
