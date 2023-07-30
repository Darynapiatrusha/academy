package by.academy.lesson18;

public class TestException {
	public static void main(String[] args) {
		int[] array = new int[3];

		try {
			array[7] = 9;
			array[8] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array");

		}
	}
}
