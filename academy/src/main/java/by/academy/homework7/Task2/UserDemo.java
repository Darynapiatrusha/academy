package by.academy.homework7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class UserDemo {

	public static void main(String[] args) {
		Class<User> usersClass = User.class;

		try {
			Method method = usersClass.getMethod("getFirstName");
			System.out.println("Method: " + method);
			System.out.println();

			Method[] methods = usersClass.getMethods();
			System.out.println("Methods: " + Arrays.toString(methods));
			System.out.println();

//			Field field = usersClass.getField("login");
//			System.out.println("GetField: " + field);
//			System.out.println();
//
			Field[] fields = usersClass.getFields();
			System.out.println("GetFields: " + Arrays.toString(fields));
			System.out.println();

			Method declaredMethod = usersClass.getDeclaredMethod("printUserInfo");
			System.out.println("GetDeclaredMethod: " + declaredMethod);
			System.out.println();

			Method[] declaredMethods = usersClass.getDeclaredMethods();
			System.out.println("GetDeclaredMethods: " + Arrays.toString(declaredMethods));
			System.out.println();

			Field declaredField = usersClass.getDeclaredField("email");
			System.out.println("getDeclaredField: " + declaredField);
			System.out.println();

			Field[] declaredFields = usersClass.getDeclaredFields();
			System.out.println("getDeclaredFields: " + Arrays.toString(declaredFields));
			System.out.println();

		} catch (NoSuchMethodException | SecurityException | NoSuchFieldException e) {
			e.printStackTrace();
		}
		User user1 = new User();
		Class<User> userClass = User.class;
		try {
			Field firstNameFields = usersClass.getField("firstName");
			Field lastNameFields = usersClass.getField("lastName");
			firstNameFields.set(user1, "Darina");
			lastNameFields.set(user1, "Petrusha");

			Field[] userDeclaredFields = usersClass.getDeclaredFields();
			for (Field field : userDeclaredFields) {
				field.setAccessible(true);
				field.set(user1, field.getName());
				System.out.println(field.get(user1));
			}
			System.out.println();
			Method toString = usersClass.getDeclaredMethod("toString");
			System.out.println(toString.invoke(user1));
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException
				| InvocationTargetException | NoSuchFieldException e) {
			e.printStackTrace();
		}

	}
}
