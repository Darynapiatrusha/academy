package by.academy.lesson6;

public class Task2 {

	public static void main(String[] args) {
		String str = "3";

		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb1 = new StringBuilder(str);
		StringBuilder sb2 = new StringBuilder(str);

		sb.append(" + ").append("56").append(" = ").append(3 + 56);
		System.out.println(sb);

		sb1.append(" - ").append("56").append(" = ").append(3 - 56);
		System.out.println(sb1);

		sb2.append(" * ").append("56").append(" = ").append(3 * 56);
		System.out.println(sb2);

		sb.insert(sb.indexOf("="), " равно ");
		sb.delete(sb.indexOf("="), sb.indexOf("=") + 1);
		System.out.println(sb);

		sb1.insert(sb1.indexOf("="), " равно ");
		sb1.delete(sb1.indexOf("="), sb1.indexOf("=") + 1);
		System.out.println(sb1);

		sb2.replace(sb2.indexOf("="), sb2.indexOf("=") + 1, " равно");
		System.out.println(sb2);
	}

}
