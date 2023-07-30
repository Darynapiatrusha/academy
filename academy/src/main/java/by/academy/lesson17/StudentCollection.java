package by.academy.lesson17;

import java.util.ArrayList;

public class StudentCollection {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		ArrayList<Integer> indexes = new ArrayList<>();

		students.add(new Student("Petya", "alal", 5, 7.0));
		students.add(new Student("Vasya", "adad", 5, 2.0));
		students.add(new Student("Alina", "afdg", 5, 4.0));
		students.add(new Student("Alina", "afdg", 5, 2.0));
		students.add(new Student("Polina", "afdg", 5, 6.0));
		students.add(new Student("Misha", "afdg", 5, 1.0));
		

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getMarks() <= 3) {
				indexes.add(i);
			}
		}

		for (int i = students.size() - 1; i >= 0; i--) {
			if (indexes.contains(i)) {
				students.remove(i);
			}
		}
		System.out.println(students);
	}

}
