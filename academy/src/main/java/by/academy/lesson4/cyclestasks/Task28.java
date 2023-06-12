package by.academy.lesson4.cyclestasks;

public class Task28 {

	public static void main(String[] args) {
		double m = 2000;
		double s = 6000;
		int n = 0;
		while (m < s) {
			n++;
			m *= 1.2;
			System.out.println(m);

		}
		System.out.println(n);
	}

}
