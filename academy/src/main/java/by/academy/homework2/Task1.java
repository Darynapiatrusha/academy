package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите первое слово");
		String firstWord = sc.next();

		System.out.println("Введите второе слово");
		String secondWord = sc.next();

		sc.close();

		boolean resultPermutation = permutation(firstWord, secondWord);
		System.out.println(resultPermutation);

	}

	public static boolean permutation(String firstWord, String secondWord) {
		if (firstWord.length() != secondWord.length()) {
			return false;
		}

		int[] letters = new int[1256];

		for (int i = 0; i < firstWord.length(); i++) {
			char c = firstWord.charAt(i);
			letters[c]++;
		}

		for (int i = 0; i < secondWord.length(); i++) {
			char c = secondWord.charAt(i);
			if (--letters[c] < 0) {
				return false;
			}
		}
		return true;
	}
}
