package by.academy.homework3.deal;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
	private Deal deal;
	private Validator phoneValidator = new BelarusianPhoneValidator();
	private Validator emailValidator = new EmailValidator();
	private Scanner sc = new Scanner(System.in);

	public Menu(Deal deal) {
		super();
		this.deal = deal;
	}

	public void start() {
		int choice;
		do {
			printMenu();
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				return;
			case 1:
				addProduct();
				break;
			case 2:
				createSeller();
				break;
			case 3:
				createBuyer();
				break;
			case 4:
				removeProduct();
				break;
			case 5:
				printProducts();
				break;
			case 6:
				deal();
				break;
			default:
				System.out.println("Ошибка! Попробуйте еще раз!");
				break;
			}
		} while (choice != 0);
	}

	private User createUser() {
		User user = new User();
		System.out.println("Enter user name: ");
		user.setName(sc.next());
		System.out.println("Enter user age: ");
		user.setAge(sc.nextInt());
		System.out.println("Enter user money: ");
		user.setMoney(sc.nextDouble());
		String dateOfBirth;
		do {
			System.out.println("Enter user date of birth (dd/mm/yyyy or dd-mm-yyyy): ");
			dateOfBirth = sc.next();

		} while (!DateOfBirthCheck.isValidDate(dateOfBirth));
		user.setDateOfBirth(DateOfBirthCheck.parse(dateOfBirth));

		String phoneNumber;
		do {
			System.out.println("Enter user phone number (+375xxxxxxxxx): ");
			phoneNumber = sc.next();

		} while (!phoneValidator.isValid(phoneNumber));
		user.setPhoneNumber(phoneNumber);

		String emailAddress;
		do {
			System.out.println("Enter user email address: ");
			emailAddress = sc.next();

		} while (!emailValidator.isValid(emailAddress));
		user.setEmailAddress(emailAddress);

		return user;
	}

	public void createSeller() {
		System.out.println("Enter info about seller: ");
		deal.setSeller(createUser());
	}

	public void createBuyer() {
		System.out.println("Enter info about buyer: ");
		deal.setBuyer(createUser());
	}

	public void removeProduct() {
		System.out.println("Print product index: ");
		int index = sc.nextInt();
		deal.removeProduct(index);
	}

	public void printProducts() {
		deal.print();
	}

	public void deal() {
		System.out.println("Deal is finished");
		System.out.println("Buyer - " + deal.getBuyer());
		System.out.println("Seller - " + deal.getSeller());
		System.out.println("Products - " + Arrays.toString(deal.getProducts()));
		System.out.println("Deadline of deal - " + deal.getDeadLineDate());
		System.out.println("The final amount of the deal - " + deal.calcPrice());
	}

	public void addProduct() {
		System.out.println("Enter product type (Fruits, Vegetables, Nuts): ");
		String type = sc.next();
		System.out.println("Enter " + type + " name: ");
		String name = sc.next();
		System.out.println("Enter " + type + " price: ");
		double price = sc.nextDouble();
		System.out.println("Enter " + type + " quantity: ");
		double quantity = sc.nextDouble();
		System.out.println("Enter " + type + " country of producer ");
		String countryOfProducer = sc.next();
		System.out.println("Enter " + type + " sort ");
		String sort = sc.next();

		switch (type) {
		case "Vegetables":
			deal.addProduct(new Vegetables(name, price, quantity, countryOfProducer, sort));
			break;
		case "Fruits":
			deal.addProduct(new Fruits(name, price, quantity, countryOfProducer, sort));
			break;
		case "Nuts":
			deal.addProduct(new Nuts(name, price, quantity, countryOfProducer, sort));
			break;
		default:
			System.out.println("ry again");
		}
	}

	public void printMenu() {
		System.out.println("Make some choice");
		System.out.println("0 - Exit program");
		System.out.println("1 - Add product");
		System.out.println("2  - Set seller");
		System.out.println("3 - Set buyer");
		System.out.println("4 - Remove products");
		System.out.println("5 - Print products");
		System.out.println("6 - deal");
	}
}
