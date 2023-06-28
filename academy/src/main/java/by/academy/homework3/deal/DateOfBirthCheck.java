package by.academy.homework3.deal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateOfBirthCheck {
	public static final Pattern DATE_FORMAT_DD_MM_YYYY_1 = Pattern
			.compile("^(0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-(([1-2]\\d{3}))$");
	public static final Pattern DATE_FORMAT_DD_MM_YYYY_2 = Pattern
			.compile("^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/(([1-2]\\d{3}))$");

	private static final DateTimeFormatter FORMATTER_1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	private static final DateTimeFormatter FORMATTER_2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static boolean isValidDate(String p) {
		return isValidDate1(p) || isValidDate2(p);
	}

	private static boolean isValidDate1(String p) {
		Matcher matcher1 = DATE_FORMAT_DD_MM_YYYY_1.matcher(p);
		return matcher1.matches();
	}

	private static boolean isValidDate2(String p) {
		Matcher matcher2 = DATE_FORMAT_DD_MM_YYYY_2.matcher(p);
		return matcher2.matches();
	}

	public static LocalDate parse(String date) {
		if (isValidDate1(date)) {
			return LocalDate.parse(date, FORMATTER_1);
		}
		if (isValidDate2(date)) {
			return LocalDate.parse(date, FORMATTER_2);
		}
		return null;
	}
}
