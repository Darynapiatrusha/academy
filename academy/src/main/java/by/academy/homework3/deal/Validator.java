package by.academy.homework3.deal;

import java.util.regex.Pattern;

public interface Validator {

	default boolean isValid(String value) {
		return getPattern().matcher(value).matches();
	};

	Pattern getPattern();
}
