package by.academy.lesson4.classwoork;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите целое число");
		int a = sc.nextInt();
		
		sc.close();
		
		if(a>0 && a<=10) {
			System.out.println("Положительное число меньше 10"); 
		} else {
			System.out.println("Положительное число больше 10 или отрицательное");
		}
	}

}
