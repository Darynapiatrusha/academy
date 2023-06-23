package by.academy.lesson10;

public class FruitDemo {

	public static void main(String[] args) {
		Apple a = new Apple(5, 7);
		Pear p = new Pear(10, 8);
		Apricot r = new Apricot(10, 8);
		
		System.out.println("Стоимость яблок: " + a.calcPrice() + ", стоимость груш: " + p.calcPrice() + ", стоимость абрикосов " +  r.calcPrice());
	}

}
