package by.academy.homework6.Task3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3Demo {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();

		users.add(new User("Petrov", "Ivan", "Ivanovich"));
		users.add(new User("Ivanov", "Ivan", "Ivanovich"));
		users.add(new User("Petrusha", "Ivan", "Ivanovich"));
		users.add(new User("Anikushin", "Ivan", "Ivanovich"));
		users.add(new User("Yukhnovski", "Ivan", "Ivanovich"));
		users.add(new User("Sidorov", "Ivan", "Ivanovich"));
		users.add(new User("Pupkin", "Ivan", "Ivanovich"));
		users.add(new User("Rechnoi", "Ivan", "Ivanovich"));
		users.add(new User("Umanov", "Ivan", "Ivanovich"));
		users.add(new User("Lomanosov", "Ivan", "Ivanovich"));

		File dir = new File("users");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File serializableObjectDemoFile = null;
		for (int i = 0; i < users.size(); i++) {
			try {
				serializableObjectDemoFile = new File("users",
						users.get(i).getSurname() + "_" + users.get(0).getName() + ".txt");
				if (!serializableObjectDemoFile.exists()) {
					serializableObjectDemoFile.createNewFile();
				}
				try (ObjectOutputStream os = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(serializableObjectDemoFile)))) {
					os.writeObject(users.get(i));
					os.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
