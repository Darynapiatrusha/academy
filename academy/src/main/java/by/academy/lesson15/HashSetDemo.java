package by.academy.lesson15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}
		sc.close();

		System.out.println(s);
	}
}
