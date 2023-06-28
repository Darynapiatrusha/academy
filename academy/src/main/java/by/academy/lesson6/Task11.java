package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {

	public static void main(String[] args) {
		String string = "One two three раз два три one1 two2 123 ";
		String pattern = "[A-Za-z]";
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(string);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
