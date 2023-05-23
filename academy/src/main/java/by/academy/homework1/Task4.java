package by.academy.homework1;

public class Task4 {

	public static void main(String[] args) {
		int number = 2;
		int result = number;
		int power = 1;
		while (result < 1_000_000){
			System.out.println(power);
			power++;
			result = number * result;
		}
	}
}
