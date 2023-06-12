package by.academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) {
		String str = "[,.?!:;]";
		Pattern pattern = Pattern.compile(str);
		Matcher matcher = pattern
				.matcher("Инструмент проверки текста на орфографические и грамматические ошибки онлайн,"
						+ " позволит исправить самые громоздкие ошибки, с высокой степенью точности и скорости,"
						+ " а также улучшить свой письменный русский язык.");
		int counter = 0;
		while (matcher.find()) {
			counter++;
		}
		System.out.println(counter);
	}

}
