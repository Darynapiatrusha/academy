package by.academy.lesson11;

import java.util.Scanner;

public class MenuDemo {

	public static void main(String[] args) {
		printMenu();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

//		Product[] products = new Product[10];

		while (s != 0) {
			switch (s) {
			case (0):
				return;
			case (1):
				System.out.println("Add product");
				break;
			default:
				System.out.println("Try again");
			}
			printMenu();
			s = sc.nextInt();
		}
		System.out.println("End programm");
		sc.close();
	}

	protected static void printMenu() {
		System.out.println("Press 1 to add product");
		System.out.println("Press 0 to exit programm");
	}
}
