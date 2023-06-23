package by.academy.lesson6;

import java.util.Formatter;

public class Task5 {

//Создать строку, используя форматирование: 
//Студент [Фамилия] получил [оценка] по [предмету]. 
//Форматирование и вывод строки на консоль написать в отдельном методе, 
//который принимает фамилию, оценку и название предмета в качестве параметров. 

	public static void main(String[] args) {
		format("Петруша", 10, "английкий");
	}

	private static void format(String lastName, int mark, String subject) {
		Formatter f = new Formatter();
		f.format("Студент %s получил %s по предмету %s", lastName, mark, subject);
		System.out.print(f);
	}
}
