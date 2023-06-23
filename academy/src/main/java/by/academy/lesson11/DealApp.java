package by.academy.lesson11;

import java.util.Arrays;
import java.util.Scanner;

import by.academy.homework3.deal.Deal;
import by.academy.homework3.deal.Fruits;
import by.academy.homework3.deal.Nuts;
import by.academy.homework3.deal.Product;
import by.academy.homework3.deal.User;
import by.academy.homework3.deal.Vegetables;

public class DealApp {

	public static void main(String[] args) {
		System.out.println("Заполните данные о сделке");
//		Deal d = inputDeal();

		System.out.println("Информация о сделке: ");
//		outputDeal(d);
	}

//	public static String keyboardInput(String inputValue) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(inputValue);
//
//		String value = sc.next();
//		return value;
//	}
//
//	public static User inputBuyer() {
//		String buyerName = keyboardInput("Имя покупателя: ");
//		int buyerAge = Integer.parseInt(keyboardInput("Возраст покупателя: "));
//		double buyerMoney = Double.valueOf(keyboardInput("Количество денег у покупателя: "));
//		String dateOfBirth = keyboardInput("Дата рождения в формате dd/MM/yyyy или dd-MM-yyyy: ");
//		String phoneNumber = keyboardInput("Номер телефона: ");
//		String emailAddress = keyboardInput("Адре электронной почты: ");
//
//		User buyer = new User(buyerName, buyerAge, buyerMoney, dateOfBirth, phoneNumber, emailAddress);
//
//		buyer.setName(buyerName);
//		buyer.setAge(buyerAge);
//		buyer.setMoney(buyerMoney);
//		buyer.setDateOfBirth(dateOfBirth);
//		buyer.setPhoneNumber(phoneNumber);
//		buyer.setEmailAddress(emailAddress);
//
//		return buyer;
//	}
//
//	public static User inputSeller() {
//		String sellerName = keyboardInput("Имя продавца");
//		int sellerAge = Integer.parseInt(keyboardInput("Возраст продавца"));
//		double sellerMoney = Double.valueOf(keyboardInput("Количество денег у продавца"));
//		String dateOfBirth = keyboardInput("Дата рождения в формате dd/MM/yyyy или dd-MM-yyyy: ");
//		String phoneNumber = keyboardInput("Номер телефона: ");
//		String emailAddress = keyboardInput("Адре электронной почты: ");
//		User seller = new User(sellerName, sellerAge, sellerMoney, dateOfBirth, phoneNumber, emailAddress);
//
//		seller.setName(sellerName);
//		seller.setAge(sellerAge);
//		seller.setMoney(sellerMoney);
//		seller.setDateOfBirth(dateOfBirth);
//		seller.setPhoneNumber(phoneNumber);
//		seller.setEmailAddress(emailAddress);
//
//		return seller;
//	}
//
//	public static Product inputVegetables() {
//		String nameOfProduct = keyboardInput("Название продукта");
//		double priceOfProduct = Double.valueOf(keyboardInput("Цена продукта"));
//		double quantityOfProduct = Double.valueOf(keyboardInput("Количество продукта"));
//		String countryOfProducer = keyboardInput("Страна поставщик");
//		String sort = keyboardInput("Сорт продукта");
//		;
//
//		Product product = new Vegetables(nameOfProduct, priceOfProduct, quantityOfProduct, countryOfProducer, sort);
//		product.setName(nameOfProduct);
//		product.setPrice(priceOfProduct);
//		product.setQuantity(quantityOfProduct);
//
//		return product;
//	}
//
//	public static Product inputNuts() {
//		String nameOfProduct = keyboardInput("Название продукта: ");
//		double priceOfProduct = Double.valueOf(keyboardInput("Цена продукта: "));
//		double quantityOfProduct = Double.valueOf(keyboardInput("Количество продукта: "));
//		String countryOfProducer = keyboardInput("Страна поставщик: ");
//		String saltedOrNot = keyboardInput("Выберите вид продукта: ");
//
//		Product product = new Nuts(nameOfProduct, priceOfProduct, quantityOfProduct, countryOfProducer, saltedOrNot);
//		product.setName(nameOfProduct);
//		product.setPrice(priceOfProduct);
//		product.setQuantity(quantityOfProduct);
//
//		return product;
//	}
//
//	public static Product inputFruits() {
//		String nameOfProduct = keyboardInput("Название продукта: ");
//		double priceOfProduct = Double.valueOf(keyboardInput("Цена продукта: "));
//		double quantityOfProduct = Double.valueOf(keyboardInput("Количество продукта: "));
//		String countryOfProducer = keyboardInput("Страна поставщик: ");
//		String sortOfProduct = keyboardInput("Сорт продукта: ");
//
//		Product product = new Fruits(nameOfProduct, priceOfProduct, quantityOfProduct, countryOfProducer,
//				sortOfProduct);
//		product.setName(nameOfProduct);
//		product.setPrice(priceOfProduct);
//		product.setQuantity(quantityOfProduct);
//
//		return product;
//	}
//
//	public static Deal inputDeal() {
//		User buyer = inputBuyer();
//		User seller = inputSeller();
//		Product[] products = new Product[3];
//		products[0] = inputVegetables();
//		products[1] = inputNuts();
//		products[2] = inputFruits();
//
//		Deal deal = new Deal(buyer, seller, products);
//		deal.setBuyer(buyer);
//		deal.setSeller(seller);
//		deal.setProducts(products);
//
//		return deal;
//	}
//
//	public static void outputDeal(Deal d) {
//
//		System.out.println("Покупатель: " + d.getBuyer());
//		System.out.println("Продавец: " + d.getSeller());
//		System.out.println("Товары: " + Arrays.toString(d.getProducts()));
//		System.out.println("Конечная сумма сделки: " + d.calcPrice());
//	}
}
