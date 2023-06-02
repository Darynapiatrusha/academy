package by.academy.homework2;

import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {
		String[] suits = { "черв", "бубен", "треф", "пик" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
		int cardsPerPlayer = 5;
		int players = 0;
		int cards = suits.length * rank.length;

		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите количество игроков: ");

			if (sc.hasNextInt()) {
				players = sc.nextInt();

				if (cardsPerPlayer * players <= cards && players != 0) {
					break;
				} else {
					if (players == 0) {
						System.out.println("Игра прекращена, недостаточно игроков");

					} else if (players < 0) {

						System.out.println("Число игроков не может быть меньше 0");

					} else {

						System.out.println("Слишком много игроков!");
					}
				}
			} else {
				System.out.println("Вы ввели не число, или Ваше число слишком большое!");
				break;
			}
			sc.close();
		}

		String[] deck = new String[cards];
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = rank[i] + " " + suits[j];
			}
		}

		for (int i = 0; i < cards; i++) {
			int r = i + (int) (Math.random() * (cards - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < players * cardsPerPlayer; i++) {
			System.out.println(deck[i]);
			if (i % cardsPerPlayer == cardsPerPlayer - 1)
				System.out.println();
		}
	}
}
