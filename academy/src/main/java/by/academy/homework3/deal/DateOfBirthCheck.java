package by.academy.homework3.deal;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DateOfBirthCheck implements Validator {
	private static final Pattern pattern = Pattern
			.compile("^(0[1-9]|[12]\\d|3[01])(/|-)(0[1-9]|1[0-2])(/|-)(([1-2]\\d{3}))$");

	public DateOfBirthCheck() {
		super();
	}

	@Override
	public Pattern getPattern() {
		return pattern;
	}

	public static void Main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		sc.close();
		DateOfBirthCheck dateOfBirthCheck = null;
		dateOfBirthCheck.isValid(date);
	}
}
