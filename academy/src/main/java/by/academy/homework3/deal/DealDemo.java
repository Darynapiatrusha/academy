package by.academy.homework3.deal;

public class DealDemo {

	public static void main(String[] args) {
		Deal deal = new Deal();
		Menu menu = new Menu(deal);
		menu.start();
	}
}
