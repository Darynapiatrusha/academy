package by.academy.lesson11;

import java.util.Scanner;

import by.academy.homework3.deal.Deal;
import by.academy.homework3.deal.Fruits;
import by.academy.homework3.deal.Nuts;
import by.academy.homework3.deal.Product;
import by.academy.homework3.deal.Vegetables;

public class Menu {

	public static void main(String[] args) {
		printMenu();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

		Product[] products = new Product[3];
		Deal d = new Deal();

		while (s != 0) {
			switch (s) {
			case (0):
				return;
			case (1):
				Product p = createProduct(sc);
				if (p == null) {
					break;
				}
				d.addProduct(p);
				System.out.println("Добавление продукта");
				break;
			default:
				System.out.println("Ошибка! Попробуйте еще раз!");
			}
			printMenu();
			s = sc.nextInt();
		}
		System.out.println("Выход из программы");
		sc.close();
	}

	public static void printMenu() {
		System.out.println("Нажмите 1 для добавления продукта");
		System.out.println("Нажмите 0 для выхода из программы");
	}

	public static Product createProduct(Scanner sc) {
		System.out.println("Выберите тип продукта: Фрукты, Овощи, Орехи");
		String type = sc.next();
		System.out.println("Введите наименование продукта: ");
		String name = sc.next();
		System.out.println("Введите цену продукта: ");
		double price = sc.nextDouble();
		System.out.println("Введите количество: ");
		double quantity = sc.nextDouble();
		System.out.println("Введите страну поставщика продукта: ");
		String countryOfProducer = sc.next();
		System.out.println("Введите сорт продукта: ");
		String sort = sc.next();
		System.out.println("Введите сорт продукта: ");
		String saltedOrNot = sc.next();

		switch (type) {
		case "Овощи":
			return new Vegetables(name, price, quantity, countryOfProducer, sort);

		case "Фрукты":
			return new Fruits(name, price, quantity, countryOfProducer, sort);
		case "Орехи":
			return new Nuts(name, price, quantity, countryOfProducer, saltedOrNot);
		default:
			System.out.println("try again");
		}
		return null;
	}
}
