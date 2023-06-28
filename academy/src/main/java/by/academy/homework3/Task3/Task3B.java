package by.academy.homework3.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3B {
	static Pattern pattern = Pattern.compile("^(0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-(([1-2]\\d{3}))$");

	public static void main(String[] args) {
		System.out.println(match("12-02-2023"));
		System.out.println(match("12/02/2099"));
		System.out.println(match("12/02/1258"));
	}

	public static boolean match(String testString) {
		Matcher matcher = pattern.matcher(testString);
		return matcher.matches();
	}
}
