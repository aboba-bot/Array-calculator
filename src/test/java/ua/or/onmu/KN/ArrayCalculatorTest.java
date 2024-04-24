package ua.or.onmu.KN;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayCalculatorTest {

    // Тут описаний Unit тест для функції "Сортування масиву за зростанням"
    @Test

    public void testSortArrayAscending() {
        int[] array1 = {0, 5, 1, 9, 3}; // Розглянемо варіант масиву позитивних чисел
        int[] array2 = {5, 0, -3, 9, -1}; // Розглянемо варіант змішаного масиву (негативні, позитивні числа та нуль)

        // Викликаємо метод "sortArray", задаючи параметр сортвання "ascending" (за зростанням)
        ArrayCalculator.sortArray(array1, array2, "asc");

        // Задаємо контрольні значення в разі успішного проходження тесту
        int[] expectedArray1 = {0, 1, 3, 5, 9};
        int[] expectedArray2 = {-3, -1, 0, 5, 9};

        // Порівнюємо контрольні значення з результатами функції
        Assertions.assertArrayEquals(expectedArray1, array1);
        Assertions.assertArrayEquals(expectedArray2, array2);
    }
}