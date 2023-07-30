package by.academy.lesson18;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] testArray = {10, 20, 30, 40, 50, 60};
        System.out.println("Корректный вывод:");
        printArray(testArray, 0, 6);
        System.out.println("С ошибкой:");
        printArray(testArray, 10, 15);
    }

    public static void printArray(int[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            try {
                System.out.println(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка. Попытка обращения к несуществующему индексу: " +
                        "текущий индекс = " + i + "; размер массива = " + array.length + ";");
                break;
            }
        }
    }
}
