package by.academy.lesson19;

public class CloseableCatDemo {
	public static void main(String[] args) {
		
		try(CloseableCat cat = new CloseableCat()){
			System.out.println("inside try-with resourses");
		}
	}
}
