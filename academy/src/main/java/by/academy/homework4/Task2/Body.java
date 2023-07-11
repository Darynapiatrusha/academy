package by.academy.homework4.Task2;

public class Body {
	static int i = 1;
	Heart heart;
	Lungs lungs;

	public class Heart {

		public void live() {
			while (i <= Integer.MAX_VALUE) {
				if (i % 100 == 0) {
					System.out.println("Knock-knock-knockin' on heaven's door");
				}
				break;
			}
		}
	}

	public class Lungs {

		public void live() {
			while (i <= Integer.MAX_VALUE) {
				if (i % 50 == 0 && i % 100 != 0) {
					System.out.println("breathe in");
				}
				if (i % 100 == 0) {
					System.out.println("breathe out");
				}
				break;
			}
		}
	}

	public Body() {
		super();
		Body.Heart heart = new Heart();
		this.heart = heart;
		Body.Lungs lungs = new Lungs();
		this.lungs = lungs;

	}

	public void live() {
		while (i <= Integer.MAX_VALUE) {
			heart.live();
			lungs.live();
			i++;
		}

		System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. \r\n"
				+ "And I believe that you are free, and life has only begun\r\n" + "");
	}

}
