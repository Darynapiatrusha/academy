package by.academy.lesson6;

public class Task1 {

	public static void main(String[] args) {
		printLastChar("i like java!!!!");
		endWithSign("i like java!!!!");
		startWithSign("i like java!!!!");
		containSign("i like java!!!!");
		indexOfSign("i like java!!!!");
		replaceSign("i like java!!!!");
		upperCase("i like java!!!!");
		lowerCase("I like java!!!!");
		subStringDemo("I like java!!!!");
	}

	public static void printLastChar(String str) {
		System.out.println(str.charAt(str.length() - 1));
	}

	public static void endWithSign(String str) {
		System.out.println(str.endsWith("!!!"));
	}

	public static void startWithSign(String str) {
		System.out.println(str.startsWith("i like"));
	}

	public static void containSign(String str) {
		System.out.println(str.contains("java"));
	}

	public static void indexOfSign(String str) {
		System.out.println(str.indexOf("java"));
	}

	public static void replaceSign(String str) {
		System.out.println(str.replace('a', 'o'));
	}

	public static void upperCase(String str) {
		System.out.println(str.toUpperCase());
	}

	public static void lowerCase(String str) {
		System.out.println(str.toLowerCase());
	}
	
	public static void subStringDemo(String str) {
		System.out.println(str.substring(1, str.length()-2));
	}
}
