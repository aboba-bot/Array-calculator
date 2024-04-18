package onmu.kn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PositiveNumberDeleterTest {

    @Test
    public void testDeletePositiveNumbers() {
        // Вхідний масив з позитивними та непозитивними числами
        int[] inputArray = {1, -2, 3, -4, 5, 0};

        // Очікуваний результат після видалення позитивних чисел
        int[] expected = {-2, -4, 0};

        // Викликаємо метод, що перевіряємо
        int[] result = PositiveNumberDeleter.deletePositiveNumbers(inputArray);

        // Перевіряємо, що результат відповідає очікуваному результату
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDeletePositiveNumbers_AllPositive() {
        // Вхідний масив з усіма позитивними числами
        int[] inputArray = {1, 2, 3, 4, 5};

        // Очікуваний результат після видалення позитивних чисел (пустий масив)
        int[] expected = {};

        // Викликаємо метод, що перевіряємо
        int[] result = PositiveNumberDeleter.deletePositiveNumbers(inputArray);

        // Перевіряємо, що результат відповідає очікуваному результату
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDeletePositiveNumbers_AllNonPositive() {
        // Вхідний масив з усіма непозитивними числами
        int[] inputArray = {0, -1, -2, -3, -4};

        // Очікуваний результат після видалення позитивних чисел (масив залишається незмінним)
        int[] expected = {0, -1, -2, -3, -4};

        // Викликаємо метод, що перевіряємо
        int[] result = PositiveNumberDeleter.deletePositiveNumbers(inputArray);

        // Перевіряємо, що результат відповідає очікуваному результату
        assertArrayEquals(expected, result);
    }
}
