package by.academy.lesson14;

public class PrintableDemo {

	public static void main(String[] args) {
		Printable p = new Printable() {

			@Override
			public void print() {
				System.out.println("hello");
			}
		};
		p.print();
	}
}
