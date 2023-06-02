package by.academy.lesson4.classwoork;

public class Task3 {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		switch (number) {
		case 1:
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Средв");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятница");
			break;
		case 6:
			System.out.println("Выходные");
			break;
		case 7:
			System.out.println("Выходные");
			break;
		default:
			System.out.println("Такого дня не существует");
		}

	}

}
