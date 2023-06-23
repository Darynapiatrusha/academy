package by.academy.homework3.deal;

import java.util.regex.Pattern;

public class BelarusianPhoneValidator implements Validator {
	private static final Pattern pattern = Pattern.compile("^\\+375((44)|(29)|(33)|(25))[0-9]{7}$");

	@Override
	public Pattern getPattern() {
		return pattern;
	}
}
