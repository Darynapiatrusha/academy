package by.academy.homework7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UserDemo {

	public static void main(String[] args) {
		Class<User> usersClass = User.class;
		User user1 = new User("alalal", "password", "test@mail.ru",  "Daryna", "Petrysha", 23, 14, 01, 2000);
		try {
			Method method = usersClass.getMethod("printUserInfo");
			System.out.println("Method: " + method);
			System.out.println();

			Method[] methods = usersClass.getMethods();
			System.out.println("Methods: " + Arrays.toString(methods));
			System.out.println();

			Field fieldInfo = usersClass.getField("firstName");
			System.out.println("GetField: " + fieldInfo);
			System.out.println();

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
			
			Field firstNameFields = usersClass.getSuperclass().getDeclaredField("firstName");
			Field lastNameFields = usersClass.getSuperclass().getDeclaredField("lastName");
			firstNameFields.setAccessible(true);
			lastNameFields.setAccessible(true);
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

		} catch (NoSuchMethodException | SecurityException | NoSuchFieldException | IllegalArgumentException
				| IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}
