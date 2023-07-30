package by.academy.homework3.deal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {
		Nuts nut = new Nuts("funduk", 12.4, 15.0,"Belarus","salted");

		File serializableObjectDemoFile = null;
		try {
			serializableObjectDemoFile = new File("serializable.txt");
			if (!serializableObjectDemoFile.exists()) {
				serializableObjectDemoFile.createNewFile();
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		try (ObjectOutputStream os = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(serializableObjectDemoFile)))) {
			os.writeObject(nut);
		} catch (IOException e) {
			System.out.println(e);
		}

		try (ObjectInputStream is = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(serializableObjectDemoFile)))) {
			System.out.println(is.readObject());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
