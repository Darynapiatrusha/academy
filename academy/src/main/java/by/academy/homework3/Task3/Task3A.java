package by.academy.homework3.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3A {
	static Pattern pattern = Pattern.compile("^(0[1-9]|[12]\\d|3[01])(-(0[1-9]|1[0-2])-(([1-2]\\d{3}))$");

	public static void main(String[] args) {
		System.out.println(test("12-02-2023"));
		System.out.println(test("12/02/2023"));
		System.out.println(test("12.02.1958"));
	}

	public static boolean test(String testString) {
		Matcher matcher = pattern.matcher(testString);
		return matcher.matches();
	}
}
