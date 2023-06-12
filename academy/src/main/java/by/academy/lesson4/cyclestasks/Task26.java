package by.academy.lesson4.cyclestasks;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите x");
		int x = sc.nextInt();
		
		System.out.println("Введите n");
		int n = sc.nextInt();
		
		sc.close();
				
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += Math.pow(Math.sin(x), i);
		}
		System.out.println(result);
	}
}
