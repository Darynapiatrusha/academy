package by.academy.lesson16;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), 
//реализующих операции объединения и пересечения множеств.
// Протестируйте работу этих методов на предварительно заполненных множествах.
public class Task4 {

	public static void main(String[] args) {
		List<String> list1 = List.of("a", "b", "c", "d");
		List<String> list2 = List.of("d", "e", "f", "c");
		System.out.println(union(list1, list2));
		System.out.println(intersect(list1, list2));
	}

	public static Set<String> union(Collection<String>... set) {
		Set<String> unionSet = new HashSet<>();
		for (Collection<String> s : set) {
			unionSet.addAll(s);
		}
		return unionSet;
	}

	public static Set<String> intersect(Collection<String>... set) {
		Set<String> unionIntersect = new HashSet<>();
		for (Collection<?> s : set) {
			unionIntersect.retainAll(s);
		}
		return unionIntersect;
	}
}
