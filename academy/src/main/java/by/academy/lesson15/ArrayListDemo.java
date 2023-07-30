package by.academy.lesson15;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<HeavyBox> box = new ArrayList<>();
		HeavyBox box1 = new HeavyBox(1, 2, 5, 5);
		HeavyBox box2 = new HeavyBox(5, 6, 5, 7);
		HeavyBox box3 = new HeavyBox(1, 1, 1, 1);
		box.add(box1);
		box.add(box2);
		box.add(box3);

		for (HeavyBox b : box) {
			System.out.println(b);
		}

		System.out.println("---------------------------------------------------");

		box.get(0).setWeight(1);
		System.out.println(box.get(0));

		box.remove(box.size() - 1);
		System.out.println("----------------------------------------------------");
		
		Object[] objectArray = box.toArray();
		System.out.println(Arrays.toString(objectArray));

		HeavyBox[] stringArray1 = new HeavyBox[box.size()];
		box.toArray(stringArray1);
		System.out.println(Arrays.toString(stringArray1));
		System.out.println("----------------------------------------------------");
		
		box.clear() ;
		System.out.println(box);
	}
}
