package by.academy.lesson4.classwoork;

public class Task2 {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		if(number == 1) {
			System.out.println("Понедельник");
		} else if(number == 2) {
			System.out.println("Вторник");
		} else if(number == 3) {
			System.out.println("Среда");
		} else if (number == 4) {
			System.out.println("Четверг");
		} else if (number == 5 ) {
			System.out.println("Пятница");
		} else if (number ==6 || number == 7) {
			System.out.println("Выходные");
		} else {
			System.out.println("Такого дня нет");
		}
	}

}
