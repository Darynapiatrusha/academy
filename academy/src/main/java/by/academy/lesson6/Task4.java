package by.academy.lesson6;

public class Task4 {

	public static void main(String[] args) {
		String str = "хорошо";
		char[] part = new char[2];

		str.getChars((str.length() / 2) - 1, (str.length() / 2 + 1), part, 0);
		System.out.println(part);
	}
}
