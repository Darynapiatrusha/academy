package by.academy.lesson2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите кличку");
		String nikname = sc.next();
		
		System.out.println("Введите цвет шерсти");
		String color = sc.next();
		
		System.out.println("Введите вес");
		double weight = sc.nextDouble();
		
		System.out.println("Введите возраст");
		int age = sc.nextInt();

		sc.close();
		
		Cat cat2 = new Cat(nikname, color, weight, age);
		System.out.println(cat2);
	}

}
