package by.academy.homework3.deal;

import java.util.Arrays;
import java.util.Scanner;

public class DealDemo {

	public static void main(String[] args) {
		System.out.println("Заполните данные о продавце: ");
		User seller = inputSeller();

		System.out.println("Заполните данные о покупателе: ");
		User buyer = inputBuyer();

		printMenu();

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

		Product[] products = new Product[3];
		Deal d = new Deal(buyer, seller, products);

		while (s != 0) {
			switch (s) {
			case 0:
				return;
			case 1:
				Product p = createProduct(sc);
				if (p == null) {
					break;
				}
				d.addProduct(p);
				System.out.println("Добавление продукта");
				break;
			case 2:
				System.out.println("Информация о сделке: ");
				outputDeal(d);
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
		System.out.println("Нажмите 2 вывода информации о сделке на экран");
		System.out.println("Нажмите 0 для выхода из программы");
	}

	public static String keyboardInput(String inputValue) {
		Scanner sc = new Scanner(System.in);
		System.out.println(inputValue);

		String value = sc.next();
		return value;
	}

	public static User inputSeller() {
		String sellerName = keyboardInput("Имя продавца: ");
		int sellerAge = Integer.parseInt(keyboardInput("Возраст продавца: "));
		double sellerMoney = Double.valueOf(keyboardInput("Количество денег у продавца: "));
		String dateOfBirth = keyboardInput("Дата рождения в формате dd/MM/yyyy или dd-MM-yyyy: ");
		String phoneNumber = keyboardInput("Номер телефона: ");
		String emailAddress = keyboardInput("Адреc электронной почты: ");
		User seller = new User(sellerName, sellerAge, sellerMoney, dateOfBirth, phoneNumber, emailAddress);

		seller.setName(sellerName);
		seller.setAge(sellerAge);
		seller.setMoney(sellerMoney);
		seller.setDateOfBirth(dateOfBirth);
		seller.setPhoneNumber(phoneNumber);
		seller.setEmailAddress(emailAddress);

		return seller;
	}

	public static User inputBuyer() {
		String buyerName = keyboardInput("Имя покупателя: ");
		int buyerAge = Integer.parseInt(keyboardInput("Возраст покупателя: "));
		double buyerMoney = Double.valueOf(keyboardInput("Количество денег у покупателя: "));
		String dateOfBirth = keyboardInput("Дата рождения в формате dd/MM/yyyy или dd-MM-yyyy: ");
		String phoneNumber = keyboardInput("Номер телефона: ");
		String emailAddress = keyboardInput("Адреc электронной почты: ");

		User buyer = new User(buyerName, buyerAge, buyerMoney, dateOfBirth, phoneNumber, emailAddress);

		buyer.setName(buyerName);
		buyer.setAge(buyerAge);
		buyer.setMoney(buyerMoney);
		buyer.setDateOfBirth(dateOfBirth);
		buyer.setPhoneNumber(phoneNumber);
		buyer.setEmailAddress(emailAddress);

		return buyer;
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

		switch (type) {
		case "Овощи":
			return new Vegetables(name, price, quantity, countryOfProducer, sort);

		case "Фрукты":
			return new Fruits(name, price, quantity, countryOfProducer, sort);
		case "Орехи":
			return new Nuts(name, price, quantity, countryOfProducer, sort);
		default:
			System.out.println("try again");
		}
		return null;
	}

	public static void outputDeal(Deal d) {

		System.out.println("Покупатель - " + d.getBuyer());
		System.out.println("Продавец - " + d.getSeller());
		System.out.println("Товары - " + Arrays.toString(d.getProducts()));
		System.out.println("Конечная сумма сделки - " + d.calcPrice());
	}
}
