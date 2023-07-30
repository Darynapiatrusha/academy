package by.academy.lesson20;

import java.util.function.Consumer;
import java.util.function.Predicate;

import by.academy.homework3.deal.Nuts;
import by.academy.homework3.deal.Product;
import by.academy.lesson15.HeavyBox;

public class LambdaDemo {

	public static void main(String[] args) {
		Printable<Product> printable = p -> System.out.println(p);

		Nuts nuts = new Nuts("arahis", 1.2, 56);
		printable.print(nuts);

		Printable<Product> printable2 = p -> System.out.println(p.getPrice());
		printable2.print(nuts);

		Predicate<String> predicate = p -> p != null;

		System.out.println(predicate.test("fdhgfh"));

		System.out.println();
		Predicate<String> predicate2 = p -> !p.isEmpty();
		System.out.println(predicate2.test("ghjdfkhl"));

		System.out.println();
		System.out.println(predicate.and(predicate2).test(""));

		System.out.println();
		Predicate<String> predicate3 = p -> p.startsWith("J");
		Predicate<String> predicate4 = p -> p.startsWith("N");
		Predicate<String> predicate5 = p -> p.endsWith("A");
		System.out.println(predicate3.or(predicate4).and(predicate5).test("JfjkA"));

		System.out.println();
		HeavyBox box = new HeavyBox(2, 5, 5, 4);

		Consumer<HeavyBox> consumer = c -> System.out.println("Отгрузили ящик с весом " + c.getWeight());
		Consumer<HeavyBox> consumer2 = c -> System.out.println("Отправляем ящик с весом " + c.getWeight());
		consumer.andThen(consumer2).accept(box);
	}

}
