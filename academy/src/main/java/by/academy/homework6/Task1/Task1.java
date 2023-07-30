package by.academy.homework6.Task1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите слово stop, чтобы закончить запись в файл");

		try (FileWriter fw = new FileWriter("file.txt")) {
			do {
				System.out.println("Введите текст для записи в файл: ");
				str = br.readLine();
				if (str.compareTo("stop") == 0)
					break;
				fw.write(str);
			} while (str.compareTo("stop") != 0);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
