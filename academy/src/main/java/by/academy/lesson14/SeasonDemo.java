package by.academy.lesson14;

public class SeasonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Season s = Season.SUMMER;
		System.out.println(s);

		switch (s) {
		case WINTER:
			System.out.println("I like WINTER");
			break;
		case AUTUMN:
			System.out.println("I like AUTUMN");
			break;
		case SPRING:
			System.out.println("I like SPRING");
			break;
		case SUMMER:
			System.out.println("I like SUMMER");
			break;
		default:
			System.out.println("I like all of them");
		}
		for (Season s1 : Season.values()) {
			System.out.println("Season: " + s1 + ", Average Temperature: " + s1.getAverageTemperature() + ", Description: "
					+ s1.getDescription());
		}
	}
}
