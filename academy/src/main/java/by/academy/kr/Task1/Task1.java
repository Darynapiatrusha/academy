package by.academy.kr.Task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			for (;;) {
				System.out.println("Enter a word: ");
				String str = sc.next();
				if (Pattern.compile("^[a-zA-Z]*$").matcher(str).find()) {
					System.out.println(counter(str));
					break;
				} else {
					System.out.println("Something going wrong, try again");
				}
			}
		}
	}

	public static String counter(String str) {
		StringBuilder compressedStr = new StringBuilder();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedStr.append(str.charAt(i));
				compressedStr.append(count);
				count = 0;
			}
		}
		int compressedLenth = compressedStr.length();
		if (compressedLenth >= str.length()) {
			return str;
		} else {
			return compressedStr.toString();
		}
	}
}
