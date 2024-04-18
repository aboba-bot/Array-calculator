package onmu.kn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;


public class PositiveNumberDeleterTest2 {

    @Test
    public void testDeletePositiveNumbers() {
        // Вхідний масив з позитивними та непозитивними числами
        int[] inputArray = {-1, -2, 3, 4, 5, 5656};

        // Очікуваний результат після видалення позитивних чисел
        int[] expected = {-1, -2};

        // Викликаємо метод, що перевіряємо
        int[] result = PositiveNumberDeleter.deletePositiveNumbers(inputArray);

        // Перевіряємо, що результат відповідає очікуваному результату
        assertArrayEquals(expected, result);

        // Виводимо вихідний та отриманий масиви
        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Result array: " + Arrays.toString(result));

        // Виводимо інформацію про те, що тест пройшов успішно
        System.out.println("Test 'testDeletePositiveNumbers' passed successfully.");
    }

    @Test
    public void testDeletePositiveNumbers_AllPositive() {
        // Вхідний масив з усіма позитивними числами
        int[] inputArray = {1, 12, 325, 44, 5};

        // Очікуваний результат після видалення позитивних чисел (пустий масив)
        int[] expected = {};

        // Викликаємо метод, що перевіряємо
        int[] result = PositiveNumberDeleter.deletePositiveNumbers(inputArray);

        // Перевіряємо, що результат відповідає очікуваному результату
        assertArrayEquals(expected, result);

        // Виводимо вихідний та отриманий масиви
        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Result array: " + Arrays.toString(result));

        // Виводимо інформацію про те, що тест пройшов успішно
        System.out.println("Test 'testDeletePositiveNumbers_AllPositive' passed successfully.");
    }

    @Test
    public void testDeletePositiveNumbers_AllNonPositive() {
        // Вхідний масив з усіма непозитивними числами
        int[] inputArray = {1, -1, -2, 3, -4};

        // Очікуваний результат після видалення позитивних чисел (масив залишається незмінним)
        int[] expected = {-1, -2, -4};

        // Викликаємо метод, що перевіряємо
        int[] result = PositiveNumberDeleter.deletePositiveNumbers(inputArray);

        // Перевіряємо, що результат відповідає очікуваному результату
        assertArrayEquals(expected, result);

        // Виводимо вихідний та отриманий масиви
        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Result array: " + Arrays.toString(result));

        // Виводимо інформацію про те, що тест пройшов успішно
        System.out.println("Test 'testDeletePositiveNumbers_AllNonPositive' passed successfully.");
    }
}
