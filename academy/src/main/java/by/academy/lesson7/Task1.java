package by.academy.lesson7;

public class Task1 {

	public static void main(String[] args) {
		String str = "Lorem";

		StringBuilder sb = new StringBuilder(str);

		System.out.println(sb);

		sb.append(" Ipsum").append(" is").append(" simply").append(" dummy").append(" text");
		System.out.println(sb);

		String result = sb.toString();

		sb.replace(result.indexOf("is"), result.indexOf("is") + "is".length(), "abc");
		System.out.println(sb);

	}
}
