package by.academy.lesson8.tasks;

import java.util.Arrays;

public class Matrix {
	private int n;
	private int m;
	private int[][] array = new int[n][m];

	public Matrix() {
		super();
	}

	public Matrix(int n, int m) {
		super();
		this.n = n;
		this.m = m;
	}
	
	public Matrix(int n, int m, int[][] array) {
		super();
		this.n = n;
		this.m = m;
		this.array = array;
	}

	protected int[][] addition(int[][] array1, int[][] array2) {
		int[][] addition = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				addition[i][j] = array1[i][j] + array2[i][j];
		return addition;
	}

	protected int[][] multiplication(int[][] array, int number) {
		int[][] multiplication = new int[n][m];
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array.length; j++)
				multiplication[i][j] = array[i][j] * number;
		return multiplication;
	}

	protected void printArray() {
		System.out.println(Arrays.deepToString(array));
	}

}
