package by.academy.lesson18;

import java.util.Arrays;

public class WrongLoginException extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongLoginException() {
		super();
	}

	public WrongLoginException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return "WrongLoginException [getMessage()=" + getMessage() + ", getLocalizedMessage()=" + getLocalizedMessage()
				+ ", getCause()=" + getCause() + ", toString()=" + super.toString() + ", fillInStackTrace()="
				+ fillInStackTrace() + ", getStackTrace()=" + Arrays.toString(getStackTrace()) + ", getSuppressed()="
				+ Arrays.toString(getSuppressed()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
