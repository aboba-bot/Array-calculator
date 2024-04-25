package ua.or.onmu.KN;


import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayCalculatorTest {

    @Test
    public void testSortArrayAscending() {
        int[] array1 = {5, 2, 8, 1, 9};
        int[] array2 = {7, 4, 3, 6, 0};

        ArrayCalculator.sortArray(array1, array2, "asc");

        int[] expectedArray1 = {1, 2, 5, 8, 9};
        int[] expectedArray2 = {0, 3, 4, 6, 7};

        assertArrayEquals(expectedArray1, array1);
        assertArrayEquals(expectedArray2, array2);
    }

    @Test
    public void testSortArrayDescending() {
        int[] array1 = {5, 2, 8, 1, 9};
        int[] array2 = {7, 4, 3, 6, 0};

        ArrayCalculator.sortArray(array1, array2, "desc");

        int[] expectedArray1 = {9, 8, 5, 2, 1};
        int[] expectedArray2 = {7, 6, 4, 3, 0};

        assertArrayEquals(expectedArray1, array1);
        assertArrayEquals(expectedArray2, array2);
    }
}