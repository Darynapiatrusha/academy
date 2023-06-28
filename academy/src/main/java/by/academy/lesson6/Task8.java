package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("c*a*b");
		Matcher matcher = pattern.matcher("aaab");
		boolean b = matcher.matches();
		System.out.println(b);
	}
}
