package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите тип данных");
		String type = sc.next();

		switch (type) {
		case "int":
			System.out.println("Введите переменную");
			int variableInt = sc.nextInt();
			System.out.println(variableInt % 2);
			break;

		case "double":
			System.out.println("Введите переменную");
			double variableDouble = sc.nextDouble();
			System.out.println(variableDouble * 0.7);
			break;

		case "float":
			System.out.println("Введите переменную");
			double variableFloat = sc.nextFloat();
			System.out.println(Math.pow(variableFloat, 2));
			break;

		case "char":
			System.out.println("Введите переменную");
			char variableChar = sc.next().charAt(0);
			int code = variableChar;
			System.out.println(code);
			break;

		case "String":
			System.out.println("Введите переменную");
			String variableString = sc.next();
			System.out.println("Hello " + variableString);
			break;

		default:
			System.out.println("Введите переменную");
			var variable = sc.next();
			System.out.println("Unsupported type");
		}

		sc.close();

	}
}
