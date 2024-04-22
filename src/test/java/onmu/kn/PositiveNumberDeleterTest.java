package onmu.kn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PositiveNumberDeleterTest {

    @Test
    public void testDeletePositiveNumbers() {
        // Вхідний масив з позитивними та непозитивними числами
        int[] inputArray = {11, -2, 3, -4, 5, 0};

        // Очікуваний результат після видалення позитивних чисел
        int[][] expected = {{-2, -4, 0}, {11, 3, 5}};

        // Викликаємо метод, що перевіряємо
        int[][] result = PositiveNumberDeleter.deletePositiveNumbers(inputArray);

        // Виводимо очищений масив та видалені числа
        System.out.println("Cleaned array: " + arrayToString(result[0]));
        System.out.println("Deleted positive numbers: " + arrayToString(result[1]));

        // Перевіряємо, що результат відповідає очікуваному результату
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDeletePositiveNumbers_AllPositive() {
        // Вхідний масив з усіма позитивними числами
        int[] inputArray = {1, 2, 3, 4, 5};

        // Очікуваний результат після видалення позитивних чисел (пустий масив)
        int[][] expected = {{}, {1, 2, 3, 4, 5}};

        // Викликаємо метод, що перевіряємо
        int[][] result = PositiveNumberDeleter.deletePositiveNumbers(inputArray);

        // Виводимо очищений масив та видалені числа
        System.out.println("Cleaned array: " + arrayToString(result[0]));
        System.out.println("Deleted positive numbers: " + arrayToString(result[1]));

        // Перевіряємо, що результат відповідає очікуваному результату
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDeletePositiveNumbers_AllNonPositive() {
        // Вхідний масив з усіма непозитивними числами
        int[] inputArray = {1, -1, -2, -3, -4};

        // Очікуваний результат після видалення позитивних чисел (масив залишається незмінним)
        int[][] expected = {{-1, -2, -3, -4}, {1}};

        // Викликаємо метод, що перевіряємо
        int[][] result = PositiveNumberDeleter.deletePositiveNumbers(inputArray);

        // Виводимо очищений масив та видалені числа
        System.out.println("Cleaned array: " + arrayToString(result[0]));
        System.out.println("Deleted positive numbers: " + arrayToString(result[1]));

        // Перевіряємо, що результат відповідає очікуваному результату
        assertArrayEquals(expected, result);
    }

    // Допоміжний метод для конвертації масиву в рядок для виведення
    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}