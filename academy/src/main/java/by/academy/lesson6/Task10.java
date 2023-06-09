package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {

	public static void main(String[] args) {
		String string = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		String pattern = "Java\\s+\\d{1,2}";
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(string);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
