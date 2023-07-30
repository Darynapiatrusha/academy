package by.academy.lesson8.tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество строк в матрице: ");
		int n = sc.nextInt();

		System.out.println("Введите количество столбцов в матрице: ");
		int m = sc.nextInt();

		sc.close();

		Matrix matrix = new Matrix(n,m);
		int[][] array1 = new int[n][m];
		int[][] array2 = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array1[i][j] = rand.nextInt(10);
			}
		}
		System.out.println(Arrays.deepToString(array1));
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array2[i][j] = rand.nextInt(10);
			}
		}
		System.out.println(Arrays.deepToString(array2));
		
		System.out.println("-----------------------------------------");

		System.out.println(Arrays.deepToString(matrix.addition(array1, array2)));
		matrix.addition(array1, array2);
		
		System.out.println(Arrays.deepToString(matrix.multiplication(array2, 2)));

		
	}
}
