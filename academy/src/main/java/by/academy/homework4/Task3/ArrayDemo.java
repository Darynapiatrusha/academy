package by.academy.homework4.Task3;

public class ArrayDemo {

	public static void main(String[] args) {
		Array<Object> array = new Array<>();

		array.add(2);
		array.add(1);
		array.add("G");
		array.add(8);
		array.add(9);

		array.sizeOfArray();
		array.lastIndexOfArray();
		System.out.println("Элемент по индексу: " + array.get(3));
		System.out.println("Первый элемент: " + array.getFirst());
		System.out.println("Последниий элемент: " + array.getLast());
		System.out.println();
		array.remove(0);
		
		System.out.println("Первый элемент после удаления: " + array.getFirst());
		array.sizeOfArray();
		array.lastIndexOfArray();
		System.out.println();
		
//		array.removeObj(G);
		System.out.println("Первый элемент после удаления: " + array.getFirst());
		array.sizeOfArray();
		array.lastIndexOfArray();
	}
}