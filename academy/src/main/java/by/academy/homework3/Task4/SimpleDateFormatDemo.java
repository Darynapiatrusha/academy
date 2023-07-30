package by.academy.homework3.Task4;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите дату в формате dd/MM/yyyy или dd-MM-yyyy ");
		String inputDate = sc.nextLine();
		sc.close();

		if (inputDate.contains("/")) {
			DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

			Date date = (Date) format.parse(inputDate);
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
			System.out.println("День: " + simpleDateFormat.format(date));
			
			simpleDateFormat = new SimpleDateFormat("MM");
			System.out.println("Месяц: " + simpleDateFormat.format(date));
			
			simpleDateFormat = new SimpleDateFormat("YYYY");
			System.out.println("Год: " + simpleDateFormat.format(date));
		}
		if (inputDate.contains("-")) {
			DateFormat format = new SimpleDateFormat("dd-MM-yyyy");

			Date date = (Date) format.parse(inputDate);
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
			System.out.println("День: " + simpleDateFormat.format(date));
			
			simpleDateFormat = new SimpleDateFormat("MM");
			System.out.println("Месяц: " + simpleDateFormat.format(date));
			
			simpleDateFormat = new SimpleDateFormat("YYYY");
			System.out.println("Год: " + simpleDateFormat.format(date));

		}
	}

}
