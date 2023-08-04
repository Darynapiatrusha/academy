package by.academy.lesson21;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Task1 {

	public static void main(String[] args) {
//		Class<Cat> catClass = Cat.class;
//		System.out.println(catClass);
//		Class<Tiger> tigerClass = Tiger.class;
//		System.out.println(tigerClass);
//
//		System.out.println("--------------------");
//
//		Field[] declaredFields = catClass.getDeclaredFields();
//		for (Field field : declaredFields) {
//			System.out.println(field);
//		}
//		System.out.println("--------------------");
//
//		Field[] declaredFieldsTigers = tigerClass.getDeclaredFields();
//		for (Field field : declaredFieldsTigers) {
//			System.out.println(field);
//		}
//
		Cat cat = new Cat("British", "Black", 5.5);
		Class<Cat> catClass = Cat.class;
////		try {
//////			Cat cat = catClass.newInstance();
////			Cat cat1 = catClass.getDeclaredConstructor(String.class, String.class, double.class).newInstance("dghjgnk",
////					"fdhsjgnk", 6.55);
//////			System.out.println(cat);
////			System.out.println(cat1);
////		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
////				| NoSuchMethodException | SecurityException e) {
////			e.printStackTrace();
////		}
		try {
			Field species = catClass.getDeclaredField("species");
			species.setAccessible(true);

			String value = (String) species.get(cat);
			System.out.println(value);

			species.set(cat, "Scotish");
			System.out.println(cat);

			Method setSpeciesMethod = catClass.getDeclaredMethod("setSpecies", String.class);
			setSpeciesMethod.setAccessible(true);
			System.out.println("Before: " + cat.getSpecies());
			setSpeciesMethod.invoke(cat, "babjd");
			System.out.println("After: " + cat.getSpecies());

			int modifiers = species.getModifiers();
			System.out.println(Modifier.isPrivate(modifiers));

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException
				| NoSuchMethodException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
